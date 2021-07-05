#include <bits/stdc++.h>

using namespace std;
using ll = long long int;

int main()
{
    ios_base::sync_with_stdio(0);cin.tie(0);
    ll n, x, ch = 0; cin>>n>>x;
    ll arr[n];
    vector <ll> cnt(1000);
    fill(cnt.begin(), cnt.end(), 1);
    for(ll i = 0; i < n; i++){
        cin>>arr[i];
        if(i >= 1){
            if((arr[i] - arr[i - 1]) <= x){
                cnt[ch]++;
            }else{
                ch++;
            }
        }
    }
    sort(cnt.begin(), cnt.end());
    cout<<cnt[(ll)cnt.size() - 1]<<endl;
    return 0;
}
