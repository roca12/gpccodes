#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;
int main(){
    stack<string>pila;
    pila.push("Luciano Chavarria");
    pila.push("Cristian Perez");
    pila.push("Edwin Villarraga ");
    pila.push("Juan David ");
    pila.push("Diego Lopez ");
    pila.push("Andres Garzon");
    while(!pila.empty()){
        cout<<"en la montonera esta de primeras "<<pila.top()<<endl;//solo "mira"
        cout<<"sale de la montonera "<<pila.top()<<endl;
        pila.pop();
    }
}