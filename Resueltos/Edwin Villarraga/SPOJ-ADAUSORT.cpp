#include <bits/stdc++.h>
using namespace std;
typedef long long int ll;
bool cmp(const pair<ll,ll> a,const pair<ll,ll> b){
    if(a.first==b.first){
        return a.second>b.second;
    }
    return a.first<b.first;
}
int main() {
    ll n;
    cin>>n;
    vector<pair<ll,ll> >vec(n);
    for(ll i=0;i<n;i++){
        ll a;
        cin>>a;
        vec[i]={a,i+1};
    }
    sort(vec.begin(),vec.end(),cmp);
    for(auto i:vec){
        cout<<i.second<<" ";
    }
}
