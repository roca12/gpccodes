#include <iostream>
#include <string.h>
#include <queue>

using namespace std;

typedef long long int lli;

bool isBipartite(lli **matrix, lli src, lli V){
    lli colorArr[V];
    memset(colorArr, -1, sizeof colorArr);
    colorArr[src] = 1;
    queue<lli>q; q.push(src);
    while(!q.empty()){
        lli u = q.front();
        q.pop();
        if(matrix[u][u] == 1){
            return false;
        }
        for(lli v = 0; v < V; v++){
            if(matrix[u][v] == 1 && colorArr [v]== -1){
                colorArr[v] = 1 - colorArr[u];
                q.push(v);
            }else if(matrix[u][v] == 1 && colorArr[v] == colorArr[u]){
                return false;
            }
        }
    }
    return true;
}

int main()
{
    lli V, E, origen, destino;
    while(cin>>V && V != 0){
        cin>>E;
        lli **matrix = new lli*[V];
        for(lli i = 0; i < V; i++){
            matrix[i] = new lli [V];
        }
        for(lli i = 0; i < E; i++){
            cin>>origen>>destino;
            matrix[origen][destino] = 1;
            matrix[destino][origen] = 1;
        }
        if(isBipartite(matrix, 0, V)){
            cout<<"BICOLORABLE."<<endl;
        }else{
            cout<<"NOT BICOLORABLE."<<endl;
        }
        delete matrix;
    }
    return 0;
}
