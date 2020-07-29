#include<bits/stdc++.h>
#include<cstdlib>
#define FAST ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(0);
//---------------//
using namespace std;
typedef long long int ll;
pair<int,int>d;
int divisors(int x){
    int nDiv=1;
    for(int i=2;i<= sqrt(x);i++){
        int cnt=0;
        while(x%i==0){
            ++cnt;
            x/=i;
        }
        nDiv*=cnt+1;
    }
    if(x>1){
        nDiv*=2;
    }
    return nDiv;
}
int main() {
    FAST;
    int t;cin>>t;
    while(t--){
    int a, b;
    cin>>a>>b;
    d=make_pair(0,0);
    for(int i=a;i<=b;i++){
        int v=divisors(i);
        if(d.second<v){
            d=make_pair(i,v);
        }
    }
    cout<<"Between "<<a<<" and "<<b<<", "<<d.first<<" has a maximum of "<<d.second<<" divisors."<<endl;
    d=make_pair(0,0);
    }
}
