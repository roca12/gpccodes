#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
const int INF= 0x3f3f3f3f;//1061109567
int graph[1002][1002];
int E,V,T;
void floydWarshall() {
        for (int k = 1; k <= E; k++) {
            for (int i = 1; i <=E; i++) {
                for (int j = 1; j <= E; j++) {
                    if (graph[i][k] != INF && graph[k][j] != INF) {
                        graph[i][j]=min(graph[i][j],max(graph[i][k],graph[k][j]));
                    }
                }
            }
        }
    }
int main() {
    bool ve=true;
    //ofstream os("salida.txt");
    int a,b,c,x,z,cont=1;
    while(cin>>E>>V>>T && (E|V|T)){
    memset(graph,INF,sizeof graph);
    for(int i=0;i<=V;i++){
        for(int j=0;j<=V;j++){
            graph[i][j]=INF;
        }
    }
    for(int i=0;i<=V;i++){
        graph[i][i]=0;
    }
    while(V--){
        cin>>a>>b>>c;
        graph[a][b]=c;
        graph[b][a]=c;
    }
    floydWarshall();
    if(ve==false){
            cout<<endl;
    }
    ve=false;
    cout<<"Case #"<<cont++<<endl;
    while(T--){
        cin>>x>>z;
        if(graph[x][z]==INF){
            cout<<"no path"<<endl;
        }else{
            cout<<graph[x][z]<<endl;
        }
    }
    }
}
