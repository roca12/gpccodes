#include <iostream>
#include <vector>
#include <math.h>
#include <algorithm>
//-----------//
#define MAX 5000000
using namespace std;

typedef long long int lli;
const lli MULT = 2;
vector <lli> datos;

int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
    lli casos; cin>>casos;
    while(casos--){
        lli dato;
        while((cin>>dato) && dato != 0){
            datos.emplace_back(dato);
        }
        lli exponente = 1;
        lli acumulador = 0;
        lli tam = datos.size();
        sort(datos.begin(), datos.end());
        reverse(datos.begin(), datos.end());
        for(lli i = 0; i < tam; i++){
            acumulador+=MULT*pow(datos[i], exponente);
            exponente++;
        }
        if(acumulador > MAX){
            cout<<"Too expensive"<<endl;
        }else{
            cout<<acumulador<<endl;
        }
        datos.clear();
    }
    return 0;
}
