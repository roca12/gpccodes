#include <cstdlib>
#include <bits/stdc++.h>
#define printArr(x,n) for(int i=0;i<n;i++){cout<<x[i]<<" ";}cout<<endl;
using namespace std;
void shellSort(int arr[],int n){
    for(int salto=n/2;salto>0;salto/=2){
        for(int i=salto;i<n;i++){
            int temp=arr[i];
            int j;
            for(j=i;j>=salto&&arr[j-salto]>temp;j-=salto){
                arr[j]=arr[j-salto];
            }
            arr[j]=temp;
        }
    }
}
int main(){
    int arr[]={12,34,2,5,32,23,43};
    int n=sizeof(arr)/sizeof(arr[0]);
    printArr(arr,n);
    shellSort(arr,n);
    printArr(arr,n);
}
