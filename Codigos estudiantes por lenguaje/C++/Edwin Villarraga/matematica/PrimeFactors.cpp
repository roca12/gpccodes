#include<bits/stdc++.h>
#include<cstdlib>
//---------------//
using namespace std;
typedef long long int ll;
void primeFactos(ll n){
    for(ll p = 2;p * p <=n ;p++){
        while(n%p==0){
            cout<<p<<" ";
            n/=p;
        }
    }
    if(n>1){
        cout<<n<<endl;
    }
}
int main() {
   ll n=20;
   primeFactos(n);
}
