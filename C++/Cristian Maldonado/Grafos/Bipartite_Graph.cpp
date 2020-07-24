#include<bits/stdc++.h>

using namespace std;

const int V=4;

bool isBipartite(int G[V][V],int src){
    int colorArr[V];
    memset(colorArr,-1,sizeof colorArr);
    colorArr[src]=1;
    queue <int> q;
    q.push(src);
    while(!q.empty()){
        int u = q.front() ;
        q.pop();
        if(G[u][u]==1){
            return false;
        }
        for(int v=0;v<V;v++){
            if(G[u][v]==1 && colorArr[v]== -1){
                colorArr[v]=1-colorArr[u];
                q.push(v);
            }else if(G[u][v]==1 && colorArr[v]==colorArr[u]){
                return false;
            }
        }
    }
    return true;
}
int main() {
    int G[V][V]={{0,1,0,1},{1,0,1,0},{0,1,0,1},{1,0,1,0}};
    if(isBipartite(G,0)){
        cout<<"Es bipartito"<<endl;
    }else{
        cout<<"NO es bipartito"<<endl;
    }
}
