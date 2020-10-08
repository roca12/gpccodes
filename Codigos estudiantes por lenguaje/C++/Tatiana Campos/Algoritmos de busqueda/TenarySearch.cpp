#include<bits/stdc++.h>
using namespace std;
int getMissingNo(int arr[],int n){
    int x1=arr[0];
    int x2=1;
    for(int i=1;i<n;i++){
        x1^=arr[i];
        printf("%d -> %d\n",i,x1);
    }
    for(int i=2;i<=n+1;i++){
        x2^=i;
        printf("%d -> %d\n",i,x2);
    }
    return x1^x2;
}
int main() {
    int arr[]={1,2,3,5,6,7,8};
    int n=sizeof(arr)/sizeof(arr[0]);
    int miss=getMissingNo(arr,n);
    printf("%d",miss);
}
