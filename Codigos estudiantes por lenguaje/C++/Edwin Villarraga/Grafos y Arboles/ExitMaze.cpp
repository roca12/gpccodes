#include<bits/stdc++.h>
#define MAX 100
using namespace std;
struct Estado{
    int x;
    int y;
    int d;
};
char ady[MAX][MAX];
bool visited[MAX][MAX];
int dx[]={0,0,1,-1};
int dy[]={1,-1,0,0};
int h,w;
Estado prev[MAX][MAX];
void print(int x,int y){
    for(int i=x,j=y;prev[i][j].d!=-1;i=prev[x][y].x,j=prev[x][y].y){
        ady[i][j]='*';
        x=i;
        y=j;
    }
    cout<<"camino con menor pasos"<<endl;
    for(int i=0;i<h;i++){
        for(int j=0;j<w;j++){
            cout<<ady[i][j];
        }
        cout<<endl;
    }
}
int BFS(int x,int y,int h,int w){
    Estado inicial;
    inicial.x=x;
    inicial.y=y;
    inicial.d=0;
    queue<Estado> Q;
    Q.push(inicial);
    for(int i=0;i<MAX;++i){
        memset(visited[i],false,sizeof visited[i]);
    }
    Estado nuevo;
    nuevo.x=-1;
    nuevo.y=-1;
    nuevo.d=-1;
    prev[x][y]=nuevo;
    while(!Q.empty()){
        Estado actual = Q.front();
        Q.pop();
        if(ady[actual.x][actual.y]=='S'){
            print(actual.x,actual.y);
            return actual.d;
        }
        visited[actual.x][actual.y]=true;
        for(int i=0;i<4;i++){
            int nx=dx[i]+actual.x;
            int ny=dy[i]+actual.y;
            if(nx>=0 && nx<h && ny>=0 && ny<w &&ady[nx][ny]!='#' && !visited[nx][ny]){
                Estado adyacente;
                adyacente.x=nx;
                adyacente.y=ny;
                adyacente.d=actual.d+1;
                Q.push(adyacente);
                prev[nx][ny]=actual;
            }
        }
    }
    return -1;
}
int main() {
    int x=0;
    int y=0;
    cout<<"altura\n";
    cin>>h;
    cout<<"ancho\n";
    cin>>w;
    cin.ignore();
    for(int i=0;i<h;i++){
        string aux;
        getline(cin,aux);
        for(int j=0;j<w;j++){
            ady[i][j]=aux[j];
            if(ady[i][j]=='I'){
                x=i;
                y=j;
            }
        }
    }
    for(int i=0;i<h;i++){
        for(int j=0;j<w;j++){
            cout<<ady[i][j];
        }
        cout<<endl;
    }
    int mini=BFS(x,y,h,w);
    if(mini!=-1){
        cout<<"El menor numero de pasos es "<<mini;
    }else{
        cout<<"No se pudo llegar";
    }
    return 0;
}
