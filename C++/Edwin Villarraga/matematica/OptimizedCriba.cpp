#include <bits/stdc++.h>
#define FAST ios_base::sync_with_stdio(false);cin.tie(NULL);
#define MAX_SIZE 1000001
using namespace std;
typedef long long int ll;
vector<int>prime;
void manipule(ll N){
    bool arr[N+1];
    ll SPF[N+1];
    memset(arr,true,sizeof arr);
    memset(SPF,2,sizeof SPF);
    arr[0]=false;
    arr[1]=false;
    for(ll i = 2; i < N; i++) {
        if (arr[i]) {
            prime.push_back(i);
            SPF[i]= i;
        }
    for (ll j = 0;j < prime.size() && i * prime[j] < N && prime[j] <= SPF[i];j++) {
        arr[i * prime[j]]= false;
        SPF[i * prime[j]]= prime[j];
        }
    }
    for (ll i = 0; i <prime.size(); i++) {
        cout<<prime[i]<<" ";
    }
}
int main(){
    manipule(1000);
}
