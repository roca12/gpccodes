
/*
    Author : Edanv
    29/04/21
    Prefix Sum desde un indece i hasta un j
    O(N)
*/
#include <bits/stdc++.h>
using namespace std;
typedef long long int ll;
typedef pair <int,int> pii;
//guardamos los valores del i,j ya calculados (en caso que noo hay updates)
map<pii,ll>dp;
//calculo de la suma de los elementos de forma lineal
ll prefixSum(int i,int j,ll arr[]){
    ll &ans =dp.find({i,j})->second;
    if(ans>0){
        return ans;
    }
    if(j==i){
        return ans=arr[i];
    }
    return ans=arr[j]-arr[i-1];
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
    /*
    for_each(temp,temp+n+1,[&](ll a){
             cout<<a<<" ";
             });
             cout<<endl;
             */
    int i=7,j=8;
    dp[{i,j}]=prefixSum(i,j,temp);
    cout<<(dp.find({i,j})->second)<<endl;
    i=1,j=3;
    dp[{i,j}]=prefixSum(i,j,temp);
    cout<<(dp.find({i,j})->second)<<endl;
    i=1,j=1;
    dp[{i,j}]=prefixSum(i,j,temp);
    cout<<(dp.find({i,j})->second)<<endl;
    return 0;
}
