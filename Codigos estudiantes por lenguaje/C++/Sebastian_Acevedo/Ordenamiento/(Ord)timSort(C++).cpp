#include<bits/stdc++.h>
#include<cstdlib>
#define printArr(arr,x,n) for(int i=x;i<n;i++){cout<<arr[i]<<" ";}cout<<endl;
//--------jajaja-------//
using namespace std;
int RUN=32;
void insertionSort(int arr[],int left,int right){
    for(int i=left+1;i<=right;i++){
        int temp=arr[i];
        int j=i-1;
        while(arr[j]>temp&&j>=left){
            arr[j+1]=arr[j];
            j--;
            if(j<0){
                break;
            }
        }
        arr[j+1]=temp;
    }
}
void mergeSort(int arr[],int left,int mid,int right){
    int len1=mid-left+1,len2=right-mid;
    int L[len1];
    int R[len2];
    for(int x=0;x<len1;x++){
        L[x]=arr[left+x];
    }
    for(int x=0;x<len2;x++){
        R[x]=arr[mid+1+x];
    }
    int i=0,j=0,k=left;
    while(i<len1 && j<len2){
        if(L[i]<=R[j]){
            arr[k]=L[i];
            i++;
        }else{
            arr[k]=R[j];
            j++;
        }
        k++;
    }
    while(i<len1){
        arr[k]=L[i];
        k++;
        i++;
    }
    while(j<len2){
        arr[k]=R[j];
        k++;
        j++;
    }
}
void timSort(int arr[],int n){
    for(int i=0;i<n;i+=RUN){
        insertionSort(arr,i,min((i+31),(n-1)));
    }
    for(int sz=RUN;sz<n;sz=2 * sz){
        for(int left=0;left<n;left+=2 * sz){
            int mid = left + sz - 1;
            int rigth=std::min((left + 2 * sz - 1),(n - 1));
            mergeSort(arr,left,mid,rigth);
        }
    }
    printArr(arr,0,n);
}
int main(){
    int arr[]={5,21,7,23,10};
    int n=sizeof(arr)/sizeof(arr[0]);
    printArr(arr,0,n);
    timSort(arr,n);
    printArr(arr,0,n);
}
