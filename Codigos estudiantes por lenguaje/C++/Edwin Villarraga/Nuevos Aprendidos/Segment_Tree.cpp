#include <bits/stdc++.h>
using namespace std;
typedef long long int ll;
void build(ll t[],ll a[],int v,int tl,int tr){
    if(tl==tr){
        t[v]=a[tl];
    }else{
        int mid=(int)(tl+tr)/2;
        build(t,a,v*2,tl,mid);
        build(t,a,(v*2)+1,mid+1,tr);
        t[v]=t[v*2]+t[v*2+1];
    }
}
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
             14                 1
            /  \              /   \
           /    \            /     \
         10      4          2       3
        /  \    / \        / \     / \
       5    5  1   3      4   5   6   7
      / \                / \
     3   2              8   9
    */
    int n= sizeof(arr)/sizeof(arr[0]);
    ll values[n+1];
    memset(values,0,sizeof(values));
    sumArr(values,arr,n+1,1);
    return 0;
}
