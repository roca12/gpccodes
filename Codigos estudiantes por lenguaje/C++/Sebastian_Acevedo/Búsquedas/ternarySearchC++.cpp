#include<bits/stdc++.h>
using namespace std;
typedef long long int ll;
ll ternarySearch(ll left,ll right,ll key,ll arr[]){
    if(right>=left){
        ll mid1=left+(right-left)/3;
        ll mid2=right-(right-left)/3;
        if(arr[mid1]==key){
            return mid1;
        }
        if(arr[mid2]==key){
            return mid2;
        }
        if(key<arr[mid1]){
            return ternarySearch(left,mid1-1,key,arr);
        }else if(key>arr[mid2]){
            return ternarySearch(mid2+1,right,key,arr);
        }else{
            return ternarySearch(mid1+1,mid2-1,key,arr);
        }
    }
    return -1;
}
int main() {
    ll arr[]={1,2,3,4,5,6,7,8,9,10};
    ll l=0;
    ll r=9;
    ll key=5;
    ll p=ternarySearch(l,r,key,arr);
    printf("Index of %d\n",p);
    key=50;
    p=ternarySearch(l,r,key,arr);
    printf("Index of %d\n",p);
}
