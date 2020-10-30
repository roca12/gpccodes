#include <bits/stdc++.h>
#define Afill(x,n) memset(x,n,sizeof(x))
using namespace std;
void countSort(char arr[],int n){
    char output[n];
    int cont[256];
    Afill(cont,0);
    for(int i=0;i<n;i++){
        cont[arr[i]]++;
    }
    for(int i=1;i<=255;i++){
        cont[i]+=cont[i-1];
    }
    for(int i=n-1;i>=0;i--){
        output[cont[arr[i]]-1]=arr[i];
        cont[arr[i]]--;
    }
    for(int i=0;i<n;i++){
        arr[i]=output[i];
    }
}
int main() {
    char arr[]={'g','e','e','k','s'};
    int n=sizeof(arr)/sizeof(arr[0]);
    countSort(arr,n);
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
}
