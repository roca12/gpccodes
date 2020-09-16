#include <iostream>

using namespace std;

int next(int a, int k, int d[], int n){
    int j = a - 1;//posicion anterior de "a"
    for(int i = 0; i < k;){
        j = (j + 1) % n;
        if(d[j] != -1){
            i++;
        }
    }
    cout<<"next: "<<j<<endl;
    return j;
}

int josephus(int n, int k){
    int d[n + 1];
    d[0] = -1; //Cuando comienza desde 1
    for(int i = 1; i <= n; i++){
        d[i] = i;
    }
    int indice = n;
    int a = 0;//calculo de la posicion siguiente a saltar
    while(indice != 1){
        indice--;
        a = next(a, k, d, n + 1);
        d[a] = -1;
        a++;
    }
    for(indice = 0; d[indice] == -1; indice++);
        return d[indice];
}

int main()
{
    ios_base::sync_with_stdio(false);cout.tie(NULL);
    cout<<josephus(4, 2)<<endl;
    return 0;
}
