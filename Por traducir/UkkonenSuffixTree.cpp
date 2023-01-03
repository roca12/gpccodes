#include<bits/stdc++.h>
#include<cstdlib>

using namespace std;
class NodeMayor{
    public:
        int start;
        int _end;
        int suffixIndex;
        bool verifyNull = false;
        NodeMayor(){};
};

struct _Node: NodeMayor{
    vector<_Node> suffixLink;
    map<char, _Node> edgeMap;
    _Node():NodeMayor(){}
};

struct Node:_Node{
    bool init;
    Node():_Node(){
        init = false;
        start = -1;
        suffixIndex = -1;
    }
    Node(_Node _sl, int _start):_Node(){
        start = _start;
        _end = -1;
        suffixIndex = -1;
        edgeMap = map<char, _Node>{};
        suffixLink = vector<_Node>{_sl};
        init = false;
    }
    Node(_Node _sl, int _start, int __end):_Node(){
        suffixLink = vector<_Node>{_sl};
        start = _start;
        _end = __end;
        suffixIndex = -1;
        edgeMap = map<char, _Node>{};
        init = false;
    }

    string __to_string(string phrase, int leafEnd){
        return _end == -1? phrase.substr(start, (leafEnd+1 - start)) : phrase.substr(start, (_end +1 - start));
    }
};

_Node convertTo(Node n){
    _Node newNode;
    newNode.edgeMap = n.edgeMap;
    newNode.start = n.start;
    newNode._end = n._end;
    newNode.suffixIndex = n.suffixIndex;
    newNode.suffixLink = n.suffixLink;
    newNode.verifyNull = n.verifyNull;
    return newNode;
}

Node convertToNode(_Node n){
    Node newNode;
    newNode.edgeMap = n.edgeMap;
    newNode.start = n.start;
    newNode._end = n._end;
    newNode.suffixIndex = n.suffixIndex;
    newNode.suffixLink = n.suffixLink;
    newNode.verifyNull = n.verifyNull;
    return newNode;
}

bool compareTo(Node m, Node n){
    bool ans = (n.start == m.start) &&
        (n._end == m._end) &&
        (n.suffixIndex == m.suffixIndex);
    if(!m.verifyNull && !n.verifyNull && ans && (n.init == m.init) && !m.init){
        return compareTo(convertToNode(m.suffixLink[0]), convertToNode(n.suffixLink[0]));
    }
    return (n.init == m.init)?true:ans;
}

bool distinctTo(Node m, Node n){
    bool ans = (n.start != m.start) ||
        (n._end != m._end) ||
        (n.suffixIndex != m.suffixIndex);
    if(!m.verifyNull && !n.verifyNull && !ans && (n.init == m.init) && !m.init){
        return compareTo(convertToNode(m.suffixLink[0]), convertToNode(n.suffixLink[0]));
    }
    return (n.init != m.init && !ans)?true:false;
}

struct Ukkonen{
    bool DETAILED = true;
    char UNIQUE = '$';

    // private
    string phrase;
    Node root;
    int leafEnd;
    Node internalNode;
    Node &activeNode = root;
    int activeEdge;
    int activeLength;
    int remainingSuffixCount;

    Ukkonen(){
        root = Node(root, -1);
        root.init = true;
        leafEnd = -1;
        activeEdge = -1;
        activeLength = 0;
        remainingSuffixCount = 0;
    }

    void printActivePoint() {
        string sb = "ActivePoint is (";
        if (activeNode.start == -1) {
            sb+="root, ";
        } else {
            sb+=(phrase.substr(activeNode.start, 1))+(", ");
        }
        sb+=(phrase.substr(activeEdge, 1)) + (", ");
        sb+=to_string(activeLength) + (")");
        cout<<sb<<endl;
    }


    int edgeLength(Node n) {
        return (n._end != -1) ? (n._end - n.start + 1) : (leafEnd - n.start + 1);
    }

    bool walkedDown(Node n) {
        if (activeLength >= edgeLength(n)) {
            if (DETAILED) {
                cout<<"WD"<<endl;
            }
            activeNode = n;
            activeEdge += edgeLength(n);
            activeLength -= edgeLength(n);
            if (DETAILED) {
                printActivePoint();
            }
            return true;
        }

        return false;
    }

    void processIndex(int index) {
        if (DETAILED) {
           cout<<"Rule One/Trick Three"<<endl;
        }
        leafEnd = index;
        remainingSuffixCount++;
        internalNode.verifyNull = true;
        while (remainingSuffixCount > 0) {
            if (activeLength == 0) {
                if (DETAILED) {
                    cout<<"ALZ"<<endl;
                }
                activeEdge = index;
                if (DETAILED) {
                    printActivePoint();
                }
            }

            if (activeNode.edgeMap.find(phrase[activeEdge]) == activeNode.edgeMap.end()){
                if (DETAILED) {
                    cout<<"Rule Two: new leaf"<<endl;
                }
                activeNode.edgeMap.insert({phrase[activeEdge], Node(root, index)});
                if (!internalNode.verifyNull) {
                    if (DETAILED) {
                        cout<<"Set up suffixLink from last internal node to activeNode"<<endl;
                    }
                    internalNode.suffixLink = vector<_Node>{activeNode};
                    internalNode.verifyNull = true;
                }

            } else {
                _Node _next = activeNode.edgeMap.find(phrase[activeEdge])->second;
                Node next = convertToNode(_next);
                if (DETAILED) {
                    cout<<"Trick One: Skip/Count"<<endl;
                }
                if (walkedDown(next)) {
                    continue;
                }
                if (phrase[(next.start + activeLength)] == phrase[index]) {
                    if (DETAILED) {
                        cout<<"Rule Three"<<endl;
                    }
                    if (!internalNode.verifyNull && distinctTo(activeNode, root)) {
                        internalNode.suffixLink = vector<_Node>{activeNode};
                        internalNode.verifyNull = true;
                    }
                    if (DETAILED) {
                        cout<<"ER3"<<endl;
                    }
                    activeLength++;
                    if (DETAILED) {
                        printActivePoint();
                    }
                    if (DETAILED) {
                        cout<<"Trick Two"<<endl;
                    }
                        break;
                }
                if (DETAILED) {
                    cout<<"Rule Two: Split Node"<<endl;
                }
                int splitEnd = next.start + activeLength - 1;
                Node split = Node(root, next.start, splitEnd);
                activeNode.edgeMap.insert({phrase[activeEdge], split});
                Node newNode = Node(root, index);
                split.edgeMap.insert({phrase[index], convertTo(newNode)});
                next.start += activeLength;
                split.edgeMap.insert({phrase[next.start], next});

                if (!internalNode.verifyNull) {
                    if (DETAILED) {
                        cout<<"Set up suffixLink from last internal node to this newly created one"<<endl;
                    }
                    internalNode.suffixLink = vector<_Node>{split};
                }
                internalNode = split;
            }

            remainingSuffixCount--;
            if (compareTo(activeNode, root) && activeLength > 0) {
                if (DETAILED) {
                    cout<<"ER2C1"<<endl;
                }
                activeLength--;
                activeEdge = index - remainingSuffixCount + 1;
                if (DETAILED) {
                    printActivePoint();
                }
            } else if (distinctTo(activeNode, root)) { // ER2C2
                if (DETAILED) {
                    cout<<"ER2C2"<<endl;
                }
                activeNode = convertToNode(activeNode.suffixLink[0]);
                if (DETAILED) {
                    printActivePoint();
                }
            }
        }
    }

    void dfsSetAndPrint(Node n, int labelHeight) {
        if (n.verifyNull) {
            return;
        }
        if (n.start != -1) {
            cout<<n.__to_string(phrase, leafEnd);
        }
        bool isLeaf = true;
        for (auto entry : n.edgeMap) {
            Node node = convertToNode(entry.second);
            if (isLeaf && n.start != -1) {
                cout<<" "<<n.suffixIndex<<endl;
            }
            isLeaf = false;
            dfsSetAndPrint(node, labelHeight + edgeLength(node));
        }
        if (isLeaf) {
            n.suffixIndex = phrase.size() - labelHeight;
            cout<<" "<<n.suffixIndex<<endl;
        }
    }
    void printTree() {
        dfsSetAndPrint(root, 0);
        if (DETAILED) {
            printActivePoint();
        }
    }
    void process(string str){
        if(true){

        }
        phrase = str;
        for (int i = 0; i < phrase.size(); i++) {
            if (DETAILED) {
                cout<<"----------Step "<<(i + 1)<<"-------------"<<endl;
            }
            processIndex(i);
            if (DETAILED) {
                printTree();
            }
        }
        if (!DETAILED) {
            printTree();
        }
    }
};

int main(){
    Ukkonen suffixTree = Ukkonen();
    suffixTree.process("abcabxabcd$");
}
