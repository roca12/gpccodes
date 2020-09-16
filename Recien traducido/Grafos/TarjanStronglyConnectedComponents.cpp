#include<bits/stdc++.h>
#include <cstdlib>
#define MAX 99999
#define NIL -1
using namespace std;
list<int> adj[MAX];
struct Graph{
    int V;
    void initGraph(int v){
        for(int i=0;i<v;i++){
            adj[i].clear();
        }
    }
    void addEdge(int v, int w) {
        adj[v].push_back(w);
    }
    void SCCUtil(int u, int disc[], int low[], stack<int>& st,bool stackMember[]) {
        static int time = 0;
        disc[u] = low[u] = ++time;
        st.push(u);
        stackMember[u] = true;
        for (int i: adj[u]){
            int v = i;

            if (disc[v] == -1) {
                SCCUtil(v, disc, low, st, stackMember);


                low[u] = min(low[u], low[v]);
            }


            else if (stackMember[v] == true){
                low[u] = min(low[u], disc[v]);
            }
        }
        int w = 0;
        if (low[u] == disc[u]) {
            while (st.top() != u) {
                w = (int) st.top();
                cout << w << " ";
                stackMember[w] = false;
                st.pop();
            }
            w = (int) st.top();
            cout << w << "\n";
            stackMember[w] = false;
            st.pop();
            }
        }
    void SCC() {
        int disc [V];
        int low [V];
        bool stackMember [V];
        stack<int> st;

        for (int i = 0; i < V; i++) {
            disc[i] = NIL;
            low[i] = NIL;
            stackMember[i] = false;
        }

         for (int i = 0; i < V; i++){
            if (disc[i] == NIL){
                SCCUtil(i, disc, low, st, stackMember);
                }
            }
        }

};

int main() {
    cout << "\nSCCs in first graph \n";
    Graph g1;
    g1.V=5;
    g1.initGraph(5);
    g1.addEdge(1, 0);
    g1.addEdge(0, 2);
    g1.addEdge(2, 1);
    g1.addEdge(0, 3);
    g1.addEdge(3, 4);
    g1.SCC();

    cout << "\nSCCs in second graph \n";
    Graph g2;
    g2.V=4;
    g2.initGraph(4);
    g2.addEdge(0, 1);
    g2.addEdge(1, 2);
    g2.addEdge(2, 3);
    g2.SCC();

     cout << "\nSCCs in third graph \n";
    Graph g3;
    g3.V=7;
    g3.initGraph(7);
    g3.addEdge(0, 1);
    g3.addEdge(1, 2);
    g3.addEdge(2, 0);
    g3.addEdge(1, 3);
    g3.addEdge(1, 4);
    g3.addEdge(1, 6);
    g3.addEdge(3, 5);
    g3.addEdge(4, 5);
    g3.SCC();

    cout << "\nSCCs in fourth graph \n";
    Graph g4;
    g4.V=11;
    g4.initGraph(11);
    g4.addEdge(0, 1);
    g4.addEdge(0, 3);
    g4.addEdge(1, 2);
    g4.addEdge(1, 4);
    g4.addEdge(2, 0);
    g4.addEdge(2, 6);
    g4.addEdge(3, 2);
    g4.addEdge(4, 5);
    g4.addEdge(4, 6);
    g4.addEdge(5, 6);
    g4.addEdge(5, 7);
    g4.addEdge(5, 8);
    g4.addEdge(5, 9);
    g4.addEdge(6, 4);
    g4.addEdge(7, 9);
    g4.addEdge(8, 9);
    g4.addEdge(9, 8);
    g4.SCC();

    cout << "\nSCCs in fifth graph \n";
    Graph g5;
    g5.V=5;
    g5.initGraph(5);
    g5.addEdge(0, 1);
    g5.addEdge(1, 2);
    g5.addEdge(2, 3);
    g5.addEdge(2, 4);
    g5.addEdge(3, 0);
    g5.addEdge(4, 2);
    g5.SCC();

        cout << "\nSCCs in sixth graph \n";
    Graph g6;
    g6.V=5;
    g6.initGraph(5);
    g6.addEdge(2, 1);
    g6.addEdge(0, 2);
    g6.addEdge(1, 3);
    g6.addEdge(1, 2);
    g6.addEdge(2, 3);
    g6.addEdge(4, 2);
    g6.SCC();

    cout << "\nSCCs in seventh graph \n";
    Graph g7;
    g7.V=4;
    g7.initGraph(4);
    g7.addEdge(0, 1);
    g7.addEdge(1, 2);
    g7.addEdge(2, 3);
    g7.addEdge(0, 3);
    g7.addEdge(1, 0);
    g7.SCC();


    return 0;
}