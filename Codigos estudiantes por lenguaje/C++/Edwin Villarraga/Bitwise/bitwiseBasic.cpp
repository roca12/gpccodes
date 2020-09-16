#include<bits/stdc++.h>
#include<cstdlib>
#define c(x) cout<<x<<endl;
#define cn(x) cout<<x;
#define l(c) cin>>t;
using namespace std;
int addOne(int x){
    return (-(~x));
}
bool opposite(int a,int b){
    return ((a^b)<0);
}
string toBinary(int n){
    string r;
    while(n!=0) {r=(n%2==0 ?"0":"1")+r; n/=2;}
    return r;
}
int main() {
    int a=8,b=5;
    cout<<a<<"->"<<toBinary(a)<<endl;
    a=addOne(a);
    cout<<a<<"->"<<toBinary(a)<<endl;
    if(opposite(a,b)){
        c("son distintos los simbolos");
    }else{
        c("son iguales los simbolos");
    }
}
