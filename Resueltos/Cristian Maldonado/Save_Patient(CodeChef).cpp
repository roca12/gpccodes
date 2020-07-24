#include <bits/stdc++.h>
//-----------//
using namespace std;
//-----------//
typedef long long int lli;

const int INF = 1 << 30;
const int MAX = 100005;
lli tiempoRestante;
lli inicial;
lli destinoFinal;
lli V;

struct Camino {
    lli destino, peso;
    lli operator < (const Camino &otro)const{
        if(peso > otro.peso){
            return 1;
        }
        if(peso == otro.destino){
            return 0;
        }
    }
};

vector<vector<Camino>> ady;
lli distancia[MAX];
lli visitado [MAX];
priority_queue <Camino> Q;
lli previo[MAX];

void init(){
    vector<Camino> ayuda;
    for(int i = 1; i <= V; i++){
        ady.push_back(ayuda);
        distancia[i] = INF;
        visitado[i] = false;
        previo[i] = -1;
    }
}

void relajacion(lli actual, lli adyacente, lli peso){
    if(distancia[actual] + peso < distancia[adyacente]){
        distancia[adyacente] = distancia[actual] + peso;
        previo[adyacente] = actual;
        Camino c;
        c.destino = adyacente;
        c.peso = distancia[adyacente];
        Q.push(c);
    }
}

void dijkstra(lli inicial){
    Camino n;
    n.destino = inicial;
    n.peso = 0;
    Q.push(n);
    distancia[inicial] = 0;
    lli actual, adyacente, peso;
    while(!Q.empty()){
        actual = Q.top().destino;
        Q.pop();
        if(visitado[actual]){
            continue;
        }
        visitado[actual] = true;
        for(lli i = 0 ; i < ady[actual].size(); i++){
            adyacente = ady[actual][i].destino;
            peso = ady[actual][i].peso;
            if(!visitado[adyacente]){
                relajacion(actual, adyacente, peso);
            }
        }
    }
    if(distancia[destinoFinal] <= tiempoRestante){
        printf("alive %lld\n", distancia[destinoFinal]);
    }else if(distancia[destinoFinal] == INF || distancia[destinoFinal] > tiempoRestante){
        printf("died\n");
    }
    ady.clear();
}

int main()
{
    lli E, origen, destino, peso;
    scanf("%lld %lld %lld %lld %lld", &V, &tiempoRestante, &E, &inicial, &destinoFinal);
    init();
    for(lli i = 0; i < E; i++){
        scanf("%lld %lld %lld", &origen , &destino, &peso);
        Camino h;
        h.destino = destino;
        h.peso = peso;
        ady[origen].push_back(h);
        Camino f;
        f.destino = origen;
        f.peso = peso;
        ady[destino].push_back(f);
    }
    dijkstra(inicial);
    return 0;
}
