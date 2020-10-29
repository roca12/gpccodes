#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
typedef long long int ll;
ll LCMarray(ll arr[],int n){
    ll ans=1;
    ll divisor=2;
    while(true){
        int counter=0;
        bool divisible=false;
        for(int i=0;i<n;i++){
            if(arr[0]==0){
                return 0;
            }else if(arr[i]<0){
                arr[i]=abs(arr[i]);
            }
            if(arr[i]==1){
                counter++;
            }
            if(arr[i]%divisor==0){
                divisible=true;
                arr[i]/=divisor;
            }
        }
        if(divisible){
            ans*=divisor;
        }else{
            divisor++;
        }
        if(counter==n){
            return ans;
        }
    }
}
int main() {
    ll arr[]={2,7,3,9,4};
    ll n=sizeof(arr)/sizeof(arr[0]);
    cout<<LCMarray(arr,n)<<endl;
    return 0;
}
