
#include<bits/stdc++.h>
#include<cstdlib>

using namespace std;
class NodeMayor{
    public:
        int start;
        int _end;
        int suffixIndex;
        bool verifyNull = false;
        map<char, NodeMayor> edgeMap;
        NodeNodeMayor(){};
        NodeMayor(int _start){
            start = _start;
        }
        NodeMayor(int _start, int __end){
            start = _start;
            _end = __end;
        }
        string __to_string(string phrase, int leafEnd){
            return _end == -1? phrase.substr(start, leafEnd+1) : phrase.substr(start, _end +1);
        }

        bool operator !=(const NodeMayor &n){
            return !(
                    (n.start == start) &&
                    (n._end == _end) &&
                    (n.suffixIndex == suffixIndex)
                    );
        }
        bool operator ==(const NodeMayor &n){
            return (
                    (n.start == start) &&
                    (n._end == _end) &&
                    (n.suffixIndex == suffixIndex)
                    );
        }
};
struct Node: NodeMayor{
    NodeMayor suffixLink;
    Node(NodeMayor sL, int _start):NodeMayor(_start){
        suffixLink = sL;
    }
    Node(NodeMayor sL, int _start, int __end):NodeMayor(_start, __end){
        suffixLink = sL;
    }
};
struct Ukkonen{
    bool DETAILED = true;
    char UNIQUE = '$';

    // private
    string phrase;
    Node *root;
    int leafEnd;
    Node internalNode;
    Node activeNode;
    int activeEdge;
    int activeLength;
    int remainingSuffixCount;

    void printActivePoint() {
        string sb = "ActivePoint is (";
        if (activeNode.start == -1) {
            sb+="root, ";
        } else {
            sb+=(phrase.substr(activeNode.start, activeNode.start + 1))+(", ");
        }
        sb+=(phrase.substr(activeEdge, activeEdge + 1)) + (", ");
        sb+=(activeLength+'$') + (")");
        cout<<sb<<endl;
    }


    int edgeLength(Node n) {
        return n._end != -1 ? n._end - n.start + 1 : leafEnd - n.start + 1;
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
        Node newNode;
        internalNode = newNode;
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
                    internalNode.suffixLink = &activeNode;
                    internalNode.verifyNull = true;
                }

            } else {

                Node next = activeNode.edgeMap.find(phrase[activeEdge])->second;
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
                    if (!internalNode.verifyNull && &activeNode != root) {
                        internalNode.suffixLink = &activeNode;
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
                    split.edgeMap.insert({phrase[index], {root, index}});
                    next.start += activeLength;
                    split.edgeMap.insert({phrase[next.start], next});

                    if (internalNode.verifyNull) {
                        if (DETAILED) {
                            cout<<"Set up suffixLink from last internal node to this newly created one"<<endl;
                        }
                        internalNode.suffixLink = &split;
                    }
                    internalNode = split;
                }

                remainingSuffixCount--;
                if (&activeNode == root && activeLength > 0) {
                    if (DETAILED) {
                        cout<<"ER2C1"<<endl;
                    }
                    activeLength--;
                    activeEdge = index - remainingSuffixCount + 1;
                    if (DETAILED) {
                        printActivePoint();
                    }
                } else if (&activeNode != root) { // ER2C2
                    if (DETAILED) {
                        cout<<"ER2C2"<<endl;
                    }
                    activeNode = *activeNode.suffixLink;
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
            cout<<n;
        }
        bool isLeaf = true;
        for (Entry<Character, Node> entry : n.edgeMap.entrySet()) {
            Node node = entry.getValue();
            // if n is inner node
            if (isLeaf && n.start != -1) {
                cout<<" "<<n.suffixIndex<<endl;
            }
            isLeaf = false;
            dfsSetAndPrint(node, labelHeight + edgeLength(node));
        }
        // if n is a leaf
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
    void progress(string str){
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
    cout<<1<<endl;
}
