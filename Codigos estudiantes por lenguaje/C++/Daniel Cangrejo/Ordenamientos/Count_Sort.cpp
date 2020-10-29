#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
void sortArr(char arr[],int n){
    char output[n];
    int Count[256];
    memset(Count,0,sizeof Count);
    for(int i=0;i<n;i++){
        Count[arr[i]]++;
    }
    for(int i=1;i<255;i++){
        Count[i]+=Count[i-1];
    }
    for(int i=n-1;i>=0;i--){
        output[Count[arr[i]]-1]=arr[i];
        --Count[arr[i]];
    }
    for(int i=0;i<n;i++){
        arr[i]=output[i];
    }
}
void printArr(char arr[],int n){
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}
int main() {
    char arr[]={'g','e','e','k','s','f','o','r','g','e','e','k','s'};
    int len=sizeof(arr)/sizeof(arr[0]);
    sortArr(arr,len);
    cout<<"caracteres ordenados"<<endl;
    printArr(arr,len);
}
