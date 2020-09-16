#include <iostream>
#include <math.h>

using namespace std;

void modEquation(int a, int b){
    if(a < b){
        cout<<"No hay solucion"<<endl;
        return;
    }
    if(a == b){
        cout<<"Hay infinitas soluciones"<<endl;
    }
    int cont = 0;
    int n = a - b;
    int y = sqrt(a - b);
    for(int i = 1; i <= y; i++){
        if(n % i == 0){
            if(n / i > b){
                cont++;
                cout<<n/i<<endl;
            }
            if(i > b){
                cont++;
                cout<<i<<endl;
            }
        }
    }
    if(y * y == n && y > b){
        cont--;
    }
    cout<<cont<<endl;
}

int main()
{
    int a = 32, b = 2;
    modEquation(a, b);
    return 0;
}
