#include<bits/stdc++.h>
#include<cstdlib>
//---------------//
using namespace std;
int next(int a, int k, int d[], int n){
    int j = a - 1;
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
    d[0] = -1;
    for(int i = 1; i <= n; i++){
        d[i] = i;
    }
    int indice = n;
    int a = 0;
    while(indice != 1){
        indice--;
        a = next(a, k, d, n + 1);
        d[a] = -1;
        a++;
    }
    for(indice = 0; d[indice] == -1; indice++);
        return d[indice];
}
int main(){
    cout<<josephus(10, 3)<<endl;
    return 0;
}
