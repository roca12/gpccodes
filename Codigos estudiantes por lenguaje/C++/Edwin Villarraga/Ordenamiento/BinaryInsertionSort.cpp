#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
int binarySearch(int a[], int item, int low, int high) {
    if (high <= low){
        return (item > a[low])?  (low + 1): low;
    }
    int mid = (low + high)/2;
    if(item == a[mid]){
        return mid+1;
    }
    if(item > a[mid]){
        return binarySearch(a, item, mid+1, high);
    }
    return binarySearch(a, item, low, mid-1);
}

void insertionSort(int a[], int n) {
    int i, pos, j, k, selected;
    for (i = 1; i < n; ++i) {
        j = i - 1;
        selected = a[i];
        pos = binarySearch(a, selected, 0, j);
        while (j >= pos) {
            a[j+1] = a[j];
            j--;
        }
        a[j+1] = selected;
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
    insertionSort(arr,N);
    cout<<"arreglo ordenados"<<endl;
    printArr(arr,N);
}
