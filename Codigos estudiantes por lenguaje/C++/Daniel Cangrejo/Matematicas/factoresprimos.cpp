#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
typedef long long int ll;
void primeFactors(int N){
    for(ll i=2;i*i<=N;i++){
        while(N%i==0){
            cout<<i<<endl;
            N/=i;
        }
    }
    if(N>1){
        cout<<N<<endl;
    }
}
int main() {
    primeFactors(100);
}
