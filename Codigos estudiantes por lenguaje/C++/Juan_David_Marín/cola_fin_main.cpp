#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;
int main(){
    queue<string>cola;
    cola.push("Luciano Chavarria - 79291");
    cola.push("Cristian Perez - 61551");
    cola.push("Edwin Villarraga - 84604");
    cola.push("Juan David - 92399");
    cola.push("Diego Lopez - 92379");
    cola.push("Andrés Garzon - 61686");
    while(!cola.empty()){
        cout<<"en la punta esta"<<cola.front()<<endl;//solo "mira"
        cola.pop();
    }
}