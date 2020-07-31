#include <iostream>

using namespace std;

void solution(int a, int b, int n){
    for(int i = 0; i * a <= n; i++){
        if((n - (i * a))%b == 0){
            cout<<"x: "<<i<<", y: "<<((n - (i * a))/b)<<endl;
            return;
        }
    }
    cout<<"No hay solucion"<<endl;
}

int main()
{
    int a = 2, b = 3, n = 16;
    solution(a, b, n);
    return 0;
}
