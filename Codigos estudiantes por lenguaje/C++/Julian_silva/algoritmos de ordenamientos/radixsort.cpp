#include <cstdlib>
#include <bits/stdc++.h>
#define printArr(x,n) for(int i=0;i<n;i++){cout<<x[i]<<" ";}cout<<endl;
using namespace std;
int getMax(int arr[],int n){
    int MAX=arr[0];
    for(int i=1;i<n;i++){
        if(arr[i]>MAX){
            MAX=arr[i];
        }
    }
    return MAX;
}
void countSort(int arr[],int n,int ex){
    int output[n];
    int i;
    int cont[10];
    memset(cont,0,sizeof(cont));
    for(i=0;i<n;i++){
        cont[(arr[i]/ex)%10]++;
    }
    for(i=1;i<10;i++){
        cont[i]+=cont[i-1];
    }
    for(i=n-1;i>=0;i--){
        output[cont[(arr[i]/ex)%10]-1]=arr[i];
        cont[(arr[i]/ex)%10]--;
    }
    for(i=0;i<n;i++){
        arr[i]=output[i];
    }
}
void radixSort(int arr[],int n){
    int m=getMax(arr,m);
    for(int ex=1;m/ex>0;ex++){
        countSort(arr,n,ex);
    }
}
int main(){
    int arr[]={170,45,75,90,802,2,24,66};
    int n=sizeof(arr)/sizeof(arr[0]);
    printArr(arr,n);
    radixSort(arr,n);
    printArr(arr,n);
}
