#include<bits/stdc++.h>
#include<cstdlib>
//---------------//
const int MAX =100001;
//---------------//
using namespace std;
set<pair <int,int> > Q;
void printPath(int arr[],int len){
    if(len==1)return;
    printPath(arr,arr[len]);
    cout<<len<<" ";
}
int main() {
    int V,E,origen,destino,peso1,inicial=0;
    cin>>V>>E;
    long long distancia[V+1];
    int previo[V+1];
    vector <pair <int,int> >ady[V+1];
    for(int i=0;i<E;i++){
        cin>>origen>>destino>>peso1;
        ady[origen].push_back(make_pair(destino,peso1));//dirigido
        ady[destino].push_back(make_pair(origen,peso1));// no dirigido
    }
    for(int i=1;i<=V;i++){
        distancia[i]=LLONG_MAX;
    }
    Q.insert(make_pair(0,1));
    int actual,adyacente,peso;
    distancia[1]=0;
    previo[1]=-1;
    while(!Q.empty()){
        actual=Q.begin()->second;
        Q.erase(Q.begin());
        for(int i=0;i<ady[actual].size();i++){
            adyacente=ady[actual][i].first;
            peso=ady[actual][i].second;
            if(distancia[actual] + peso < distancia[adyacente]){
                Q.erase(make_pair(distancia[adyacente],adyacente));
                distancia[adyacente] = distancia[actual] + peso;
                previo[adyacente] = actual;
                Q.insert(make_pair(distancia[adyacente],adyacente));
            }
        }
    }
    if(distancia[V]==LLONG_MAX){
        cout<<-1<<endl;
        return 0;
    }
    cout<<"1 ";
    printPath(previo,V);
}
