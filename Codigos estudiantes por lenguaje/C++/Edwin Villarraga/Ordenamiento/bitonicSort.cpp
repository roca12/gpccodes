#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
void compAnsSwap(int arr[],int i,int j,int dir){
    if((arr[i]>arr[j] && dir==1)|| (arr[i]<arr[j] && dir==0)){
        swap(arr[i],arr[j]);
    }
}
void bitonicMerge(int arr[],int low,int cnt,int dir){
    if(cnt > 1){
        int k= cnt/2;
        for(int i=low;i < low + k;i++){
            compAnsSwap(arr,i,i+k,dir);
        }
        bitonicMerge(arr, low  ,k,dir);
        bitonicMerge(arr,low+k,k,dir);

    }
}
void bitonicSort(int arr[],int low,int cnt,int dir){
    if(cnt>1){
        int k= cnt/2;
        bitonicSort(arr,low,k,1);
        bitonicSort(arr,low+k,k,0);
        bitonicMerge(arr,low,cnt,dir);
    }
}
void sortArr(int arr[],int N,int up){
    bitonicSort(arr,0,N,up);
}
void printArr(int arr[],int n){
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}
int main() {
    int arr[]= {4,3,24,6,2,3,4,1};
    int N = sizeof arr/sizeof arr[0];
    int up = 1;
    sortArr(arr, N, up);
    printf("Sorted array: \n");
    printArr(arr,N);
    return 0;
}
