#include <iostream>
#include <string.h>
#include <vector>

using namespace std;
typedef long long int lli;

lli casos = 1;
vector <string> ayuda;

void printSubsets(string consulta[], lli tam){
    for(lli i = (1 << tam) - 1; i >=0; i--){
        ayuda.clear();
        for(lli j = 0; j < tam; j++){
            if((i &(1 << j)) > 0){
                ayuda.push_back(consulta[j]);
            }
        }
        cout<<casos<<": ";
        if(ayuda.empty()){
            cout<<"Phi"<<endl;
        }
        for(lli k = 0; k < ayuda.size(); k++){
            if(k == ayuda.size() - 1){
               cout<<ayuda[k];
            }else{
                cout<<ayuda[k]<<" ";
            }
        }
        cout<<endl;
        casos++;
    }
}

int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);
    lli testeo;cin>>testeo;
    for(lli i = 0; i < testeo; i++){
        lli tam; cin>>tam;
        string entradas[tam];
        for(lli j = 0; j < tam; j++){
            cin>>entradas[j];
        }
        printSubsets(entradas, tam);
        casos = 1;
    }
}
