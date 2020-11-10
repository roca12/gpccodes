#include <iostream>
#include <algorithm>

using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);
    int casos;cin>>casos;
    for(int i = 0; i < casos; i++){
        int tam; cin>>tam;
        double estudiantes[tam];
        double promedio = 0;
        for(int i = 0; i < tam; i++){
            cin>>estudiantes[i];
            promedio += estudiantes[i];
        }
        promedio /= double(tam);
        double contador = 0;
        sort(estudiantes, estudiantes + tam);
        for(int i = tam - 1; i >= 0; i--){
           if(estudiantes[i]>promedio){
                contador++;
           }else{
                break;
           }
        }
        double resultado = (contador * 100)/tam;
        printf("%.3f%\n", resultado);
    }
}
