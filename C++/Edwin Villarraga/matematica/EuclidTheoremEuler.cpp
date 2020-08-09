#include<bits/stdc++.h>
#include<cstdlib>
//---------------//
using namespace std;
typedef long long int ll;
ll power2[1000];
bool isPerfect(ll n){
    ll s=-n;
    for(ll i=1;i*i <=n;i++){
        if(n%i==0){
            ll factor1=i,factor2=n/i;
            s+=factor1 + factor2;
            if(factor1==factor2){
                s-=i;
            }
        }
    }
    return (n==s);
}
bool isPrime(ll n){
    for(ll i=2;i*i <=n;i++){
        if(n%i==0){
            return false;
        }
    }
    return false;
}
int main() {
    memset(power2,0L,sizeof power2);
    for(int i=0;i<62;i++){
        power2[i]=0L;
    }
    for(int i=0;i<=60;i++){
        power2[i]=(1L<< i);
    }
    cout<<"Generando los primeros numeros que satiscafacen el teorema"<<endl;
    for(ll i=2;i<=25;i++){
        ll no=((power2[(int)i]-1L)*power2[(int)(i-1)]);
        if(isPerfect(no) && (no%2==0)){
            cout<<"(2^"<<i<<" -1 * (2^("<<i<<" -1)) = "<<no<<endl;
        }
    }

}
