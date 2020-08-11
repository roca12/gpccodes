#include<bits/stdc++.h>
#include<cstdlib>
//---------------//
using namespace std;
int GCD(int a,int b){
    if(a==0){
        return b;
    }
    return GCD(b%a,a);
}
int power(int x,unsigned int y,unsigned int m){
    if(y==0){
        return 1;
    }
    int p=power(x,y/2,m)%m;
    p= (p*p)%m;
    return (y%2==0)?p:(x*p)%m;

}
void modInverse(int a,int m){
    if(GCD(a,m)!=1){
        cout<<"No existe inverso"<<endl;
    }else{
        cout<<"Multiplicacion inversa es "<<power(a,m-2,m)<<endl;
    }
}
int main() {
    int a=3,m=11;
    modInverse(a,m);
}
