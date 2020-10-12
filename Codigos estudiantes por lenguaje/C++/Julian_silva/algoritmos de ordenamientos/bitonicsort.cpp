#include<bits/stdc++.h>
#include<cstdlib>
#define printArr(arr,x,n) for(int i=x;i<n;i++){cout<<arr[i]<<" ";}cout<<endl;
//---------------//
using namespace std;
void compAndSwap(int arr[],int i,int j,int dir){
    if((arr[i]>arr[j]&&dir==1)||(arr[i]<arr[j]&&dir==0)){
        swap(arr[i],arr[j]);
    }
}
void bitonicMerge(int arr[],int low,int cnt,int dir){
    if(cnt>1){
        int k=cnt/2;
        for(int i=low;i<low+k;i++){
            compAndSwap(arr,i,i+k,dir);
        }
        bitonicMerge(arr,low,k,dir);
        bitonicMerge(arr,low+k,k,dir);
    }
}
void bitonicSort(int arr[],int low,int cnt,int dir){
    if(cnt>1){
        int k=cnt/2;
        bitonicSort(arr,low,k,1);
        bitonicSort(arr,low+k,k,0);
        bitonicMerge(arr,low,cnt,dir);
    }
}
void sortB(int arr[],int n,int up){
    bitonicSort(arr,0,n,up);
}
int main(){
    int arr[]={3,7,4,8,6,2,1,5};
    int up=1;
    int n=sizeof(arr)/sizeof(arr[0]);
    printArr(arr,0,n);
    sortB(arr,n,up);
    printArr(arr,0,n);
}
