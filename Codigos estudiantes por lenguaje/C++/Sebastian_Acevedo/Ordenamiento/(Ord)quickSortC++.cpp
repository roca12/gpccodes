#include <cstdlib>
#include <bits/stdc++.h>
#define printArr(x,n) for(int i=0;i<n;i++){cout<<x[i]<<" ";}cout<<endl;
using namespace std;
int partitionQ(int arr[],int low,int high){
    int pivot=arr[high];
    int i=(low-1);//index
    for(int j=low;j<high;j++){
        if(arr[j]<=pivot){
            i++;
            swap(arr[i],arr[j]);
        }
    }
    swap(arr[i+1],arr[high]);
    return i+1;
}
void quickSort(int arr[],int low,int high){
    if(low<high){
        int pi=partitionQ(arr,low,high);
        quickSort(arr,low,pi-1);//sub vector izquierda
        quickSort(arr,pi+1,high);//sub vector derecha
    }
}
int main(){
    int arr[]={2,3,4,5,6,2,23,4,6,2};
    int n=sizeof(arr)/sizeof(arr[0]);
    printArr(arr,n);
    quickSort(arr,0,n-1);
    printArr(arr,n);
}
