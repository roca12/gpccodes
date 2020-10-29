#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
int gcd(int a,int b){
    return (a==0?b:gcd(b%a,a));
}
int findGCD(int arr[],int n){
    int res=arr[0];
    for(int i=1;i<n;i++){
        res=gcd(arr[i],res);
    }
    return res;
}
int main() {
    int arr[]={2,4,8,16};
    int n=sizeof(arr)/sizeof(arr[0]);
    cout<<findGCD(arr,n)<<endl;
    return 0;
}
