#include<bits/stdc++.h>
#include<cstdlib>
//---------------//
using namespace std;
int exactPrimeFactorCount(int n){
    int cont=0;
    if(n%2==0){
        cont++;
        while(n%2==0){
            n/=2;
        }
    }
    for(int i=3;i<=(sqrt(n));i+=2){
        if(n%i==0){
            cont++;
            while(n%i==0){
                n/=i;
            }
        }
    }
    if(n>2){
        cont++;
    }
    return cont;
}
int main(){
    int n=51242183;
    cout<<"El numero de diferentes factores primos es "<<exactPrimeFactorCount(n)<<endl;
    cout<<"EL valor de (log(n)) es "<<log(log(n))<<endl;
}
