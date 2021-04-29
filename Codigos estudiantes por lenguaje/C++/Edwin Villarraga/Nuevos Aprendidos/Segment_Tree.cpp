#include <bits/stdc++.h>
using namespace std;
typedef long long int ll;
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
    ll arr[]={3,2,5,1,3};
    /*
             14
            /  \
           /    \
         10      4
        /  \    / \
       5    5  1   3
      / \
     3   2
    */
    int n= sizeof(arr)/sizeof(arr[0]);
    ll values[n+1];
    memset(values,0,sizeof(values));
    sumArr(values,arr,n+1,1);
    return 0;
}
