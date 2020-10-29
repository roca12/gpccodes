#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;
int binarySearch(int arr[],int left,int right,int x){
    if(right>=left){
        int mid=left+(right-left)/2;
        if(arr[mid]==x){
            return mid;
        }
        if(arr[mid]>x){
            return binarySearch(arr,left,mid-1,x);
        }
        return binarySearch(arr,mid+1,right,x);
    }
    return -1;
}
int expSearch(int arr[],int n,int x){
    if(arr[0]==x){
        return 0;
    }
    int i=1;
    while(i < n && arr[i]<=x){
        i*=2;
    }
    return binarySearch(arr,i/2,min(i,n),x);
}
int main(){
    int arr[]={2,3,4,10,40};
    int n=sizeof(arr)/sizeof(arr[0]);
    int x=10;
    int result = expSearch(arr,n,x);
    if(result<0){
        printf("No se encontro");
    }else{
        printf("Dato encontrado en %d",result);
    }
}
