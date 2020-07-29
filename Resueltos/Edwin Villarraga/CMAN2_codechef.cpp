#include <bits/stdc++.h>
#define FAST ios_base::sync_with_stdio(false);cin.tie(NULL);
using namespace std;
typedef long long int ll;
int main(){
    FAST;
    ll t;cin>>t;
    while(t--){
    ll n;cin>>n;
    ll arr[n];
    for(ll i=0;i<n;i++){
        cin>>arr[i];
        }
    ll cont =0,total=0,bottles=2,n2=n;
    while(n2!=0){
        total+=count(arr,arr+n,bottles);
        total+=count(arr,arr+n,bottles-1);
        bottles+=2;
        cout<<"TYPE "<<(++cont)<<" - "<<total<<endl;
        n2-=total;
        total=0;
        }
    }
    return 0;
}
