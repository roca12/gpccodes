#include <iostream>
#include <algorithm>

using namespace std;

typedef long long ll;

int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
    ll casos; cin>>casos;
    while(casos--){
        ll contador = 9, tam = 10;
        char a = 48;
        ll cantidades [contador];
        ll numero, avance = 1; cin>>numero;
        string entrada = "";
        while(avance <= numero){
            entrada+= to_string(avance);
            avance++;
        }
        avance = 0;
        while(avance < tam){
            cantidades[avance] = count(entrada.begin(),entrada.end(), a);
            avance++;
            a++;
        }
        for(ll i = 0; i < tam; i++){
            if(i == (tam - 1)){
                cout<<cantidades[i]<<endl;
                break;
            }
            cout<<cantidades[i]<<" ";
        }
    }
    return 0;
}
