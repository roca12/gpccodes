#include<bits/stdc++.h>
#include<cstdlib>
//---------------//
using namespace std;
int countSetBits(int n){
    int cont=0;
    while(n!=0){
        cont+=n&1;
        n>>=1;
    }
    return cont;
}
int flippedCount(int a,int b){
    return countSetBits(a^b);
}
string toBinary(int n){
    string r;
    while(n!=0) {r=(n%2==0 ?"0":"1")+r; n/=2;}
    return r;
}
int main(){
    int a=5;
    int b=100;
    cout<<a<<"->"<<toBinary(a)<<endl;
    cout<<b<<"->"<<toBinary(b)<<endl;
    cout<<flippedCount(a,b)<<endl;
}
