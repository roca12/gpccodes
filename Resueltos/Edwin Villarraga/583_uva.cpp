#include<bits/stdc++.h>
#include<cstdlib>
#define FAST ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(0);
//---------------//
using namespace std;
typedef long long int ll;
vector<int> factores;
void primeFactos(ll n){
    if(n<0){
        n=abs(n);
        factores.push_back(-1);
    }
    for(ll p = 2;p * p <=n ;p++){
        while(n%p==0){
            factores.push_back(p);
            n/=p;
        }
    }
    if(n>1){
        factores.push_back(n);
    }
}
int main() {
FAST;
   ll n;
   cin>>n;
   while(n!=0){
   primeFactos(n);
   sort(factores.begin(),factores.end());
   cout<<n<<" = ";
   for(int i=0;i<factores.size();i++){
        cout<<factores[i];
        if(i!=factores.size()-1){
            cout<<" x ";
        }
   }
   cout<<endl;
   factores.clear();
   cin>>n;
   }
}
