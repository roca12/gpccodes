#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;
void bubbleSort(int arr[],int n){
    if(n==1){
        return;
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n-1;j++){
            if(arr[j]>arr[j+1]){
                /*
                int aux=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=aux;
                */
                swap(arr[j],arr[j+1]);
            }
        }
    }
}
int main() {
    int arr[]={64,34,25,12,22,11,90};
    int n=sizeof(arr)/sizeof(arr[0]);
    bubbleSort(arr,n);
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
}