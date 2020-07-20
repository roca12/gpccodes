#include <bits/stdc++.h>
#include <cstdlib>
#define MAX_V 100

using namespace std;

struct Estado{
    int x;
    int y;
    int d;
};

char ady [MAX_V][MAX_V];
bool visitado [MAX_V][MAX_V];
int dx[] = {0, 0, 1, -1};
int dy[] = {1, -1, 0, 0};
int h, w;
Estado previo[MAX_V][MAX_V];

void print(int x, int y){
    cout << "imprimiendo camino con asteriscos"<<endl;
    for(int i = x, j = y; previo[i][j].d != -1; i = previo[x][y].x, j = previo[x][y].y){
        ady[i][j] = '*';
        x = i;
        y = j;
    }
    cout << "Camino con el menor numero de pasos" <<endl;
    for(int i = 0; i < h; i++){
        for(int j = 0; j < w; j++){
            cout<<ady[i][j];
        }
        cout<<endl;
    }
}
int BFS(int x, int y, int h, int w){
    Estado inicial;
    inicial.x = x;
    inicial.y = y;
    inicial.d = 0;
    queue <Estado> Q;
    Q.push(inicial);
    memset(visitado, false, sizeof visitado);
    Estado nuevo;
    nuevo.x = -1;
    nuevo.y = -1;
    nuevo.d = -1;
    previo[x][y] = nuevo;
    while(!Q.empty()){
        Estado actual = Q.front();
        Q.pop();
        if(ady[actual.x][actual.y] == 'S'){
            print(actual.x, actual.y);
            return actual.d;
        }
        visitado[actual.x][actual.y] = true;
        for(int i = 0; i < 4; i++){
            int nx = dx[i] + actual.x;
            int ny = dy[i] + actual.y;
            if(nx >= 0 && nx < h && ny >= 0
               && ny < w && ady[nx][ny] != '#' && !visitado[nx][ny]){
               Estado adyacente;
               adyacente.x = nx;
               adyacente.y = ny;
               adyacente.d = actual.d + 1;
               Q.push(adyacente);
               previo[nx][ny] = actual;
            }
        }
    }
    return -1;
}

int main()
{
    int x, y;
    cin>>w>>h;
    cin.ignore();
    for(int i = 0; i < h;i++){
        string aux;
        getline(cin, aux);
        for(int j = 0; j < w; j++){
            ady[i][j] = aux[j];
            if(ady[i][j] == 'I'){
                x = i;
                y = j;
            }
        }
    }
    cout<<"Vista previa"<<endl;
    for(int i = 0; i < h; i++){
        for(int j = 0; j < w; j++){
            cout<<ady[i][j];
        }
        cout<<endl;
    }
    int resultado = BFS(x, y, h, w);
    if(resultado != -1){
        cout<<"Menor numero de pasos: "<<resultado<<endl;
    }else{
        cout<<"No se pudo llegar al final"<<endl;
    }
    return 0;
}
