#include <iostream>
#include <set>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
    int casos; cin>>casos;
    set<string> paises;
    vector<string> datos;
    vector<int> valores;
    while(casos--){
        string dato; cin>>dato;
        string ignorar; getline(cin, ignorar);
        datos.emplace_back(dato);
        paises.insert(dato);
    }
    for(string i: paises){
        valores.emplace_back(count(datos.begin(), datos.end(), i));
    }
    int iterador = 0;
    for(string i: paises){
        cout<<i<<" "<<valores[iterador]<<endl;
        iterador++;
    }
    return 0;
}
