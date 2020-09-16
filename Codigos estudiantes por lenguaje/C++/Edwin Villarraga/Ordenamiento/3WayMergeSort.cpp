#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
void mergeArr(int gArray[], int low, int mid1,int mid2, int high, int arrdest[]){
    int i = low, j = mid1, k = mid2, l = low;
    while ((i < mid1) && (j < mid2) && (k < high)){
        if(gArray[i] < gArray[j]){
            if(gArray[i] < gArray[k])
            {
                arrdest[l++] = gArray[i++];
            }else{
                arrdest[l++] = gArray[k++];
            }
        }else{
            if(gArray[j] < gArray[k]){
                arrdest[l++] = gArray[j++];
            }else{
                arrdest[l++] = gArray[k++];
            }
        }
    }
    while ((i < mid1) && (j < mid2)){
        if(gArray[i] < gArray[j]){
            arrdest[l++] = gArray[i++];
        }else{
            arrdest[l++] = gArray[j++];
        }
    }
    while ((j < mid2) && (k < high)){
        if(gArray[j] < gArray[k]){
            arrdest[l++] = gArray[j++];
        }else{
            arrdest[l++] = gArray[k++];
        }
    }
    while ((i < mid1) && (k < high)){
        if(gArray[i] < gArray[k]){
            arrdest[l++] = gArray[i++];
        }else{
            arrdest[l++] = gArray[k++];
        }
    }
    while (i < mid1){
        arrdest[l++] = gArray[i++];
    }
    while (j < mid2){
        arrdest[l++] = gArray[j++];
    }
    while (k < high){
        arrdest[l++] = gArray[k++];
    }
}
void mergeSort3wayRec(int arr[],int low,int high,int arrdest[]){
    if(high-low<2){
        return;
    }
    int mid1=low + ((high-low)/3);
    int mid2=low + 2 * ((high-low)/3) + 1;
    mergeSort3wayRec(arrdest,low,mid1,arr);
    mergeSort3wayRec(arrdest,mid1,mid2,arr);
    mergeSort3wayRec(arrdest,mid2,high,arr);

    mergeArr(arrdest,low,mid1,mid2,high,arr);
}
void mergeSort3way(int arr[],int n){
    if(n==0){
        return;
    }
    int farr[n];
    for(int i=0;i<n;i++){
        farr[i]=arr[i];
    }
    mergeSort3wayRec(farr,0,n,arr);
    for(int i=0;i<n;i++){
        arr[i]=farr[i];
    }
}
void printArr(int arr[],int n){
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}
int main() {
    int arr[]={1,3,54,255,2,5,3,1,5,7,4,299,3,54,64,73};
    int N=sizeof(arr)/sizeof(arr[0]);
    mergeSort3way(arr,N);
    cout<<"arreglo ordenados"<<endl;
    printArr(arr,N);
}
