#include <iostream>
#include <algorithm>

using namespace std;

const int win = 3;
const int draw = 1;

int equipoA = 0;
int equipoB = 0;
int posibilidades = 0;

void verificar(char a){
    switch(a){
    case 'W':
        equipoA += win;
        break;
    case 'L':
        equipoB += win;
        break;
    case 'D':
        equipoA += draw;
        equipoB += draw;
        break;
    case '?':
        posibilidades++;
        break;
    }
}

void reiniciar(){
    equipoA = 0;
    equipoB = 0;
    posibilidades = 0;
}

int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
    int casos; cin>>casos;
    while(casos--){
        int cantidaPartidos; cin>>cantidaPartidos;
        string entrada; cin>>entrada;
        for(int i = 0; i < entrada.size(); i++){
            verificar(entrada[i]);
        }
        if(equipoA > equipoB){
            cout<<0<<endl;
            reiniciar();
            continue;
        }
        int contador = 0;
        while(posibilidades--){
            equipoA += win;
            contador++;
            if(equipoA > equipoB){
                cout<<contador<<endl;
                break;
            }
        }
        if(equipoA <= equipoB){
            cout<<-1<<endl;
        }
        reiniciar();
    }
    return 0;
}
