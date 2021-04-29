#include <bits/stdc++.h>
using namespace std;
typedef long long int ll;
ll prefixSum(int i,int j,ll arr[]){
    ll sum_i=0,sum_j=0;
    return arr[j]-arr[i-1];
}
ll op(ll a,ll b){
    return a+b;
}
//calculo de las sumas adyacentes
void sumArr(ll temp[],ll values[],int n,int index){
    if(index==n){
        return;
    }
    if(index==0){
        sumArr(temp,values,n,index+1);
    }
    temp[index]=op(values[index-1],temp[index-1]);
    sumArr(temp,values,n,index+1);
}
int main(){
    ll arr[]={3,4,65,6,3,2,34,6,8,9,7,5,1,6};
    int n= sizeof(arr)/sizeof(arr[0]);
    //alojamos todas las sumas de forma lineal (arr[current],arr[current+1]);
    ll temp[n+1];
    memset(temp,0,sizeof(temp));
    sumArr(temp,arr,n+1,1);
    cout<<endl;
    /*
    for_each(temp,temp+n+1,[&](ll a){
             cout<<a<<" ";
             });
             cout<<endl;
             */
    cout<<prefixSum(7,8,temp)<<endl;
    return 0;
}
