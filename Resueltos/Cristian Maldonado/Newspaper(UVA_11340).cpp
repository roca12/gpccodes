#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

vector <pair<char, double>> letras;

int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
    int casos; cin>>casos;
    while(casos--){
        int tam; cin>>tam;
        char letra; double cantidad;
        for(int i = 0; i < tam; i++){
            cin>>letra>>cantidad;
            letras.emplace_back(make_pair(letra, cantidad/100));
        }
        int cantidadLineas; cin>>cantidadLineas;
        cin.ignore();
        double sumador = 0.0;
        for(int j = 0; j < cantidadLineas; j++){
            string linea;
            getline(cin, linea);
            long contador = 0;
            for(int i = 0; i < tam; i++){
                contador = count(linea.begin(), linea.end(), letras[i].first);
                double acumulado = contador * letras[i].second;
                sumador+=acumulado;
            }
        }
        printf("%.2f$\n", sumador);
        letras.clear();
    }
    return 0;
}
