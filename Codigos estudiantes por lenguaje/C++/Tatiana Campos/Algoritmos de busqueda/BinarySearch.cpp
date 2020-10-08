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
int main(){
    int arr[]={2,3,4,10,40};
    int n=sizeof (arr)/sizeof (arr[0]);
    sort(arr,arr+n);
    int x=40;
    int result=binarySearch(arr,0,n-1,x);
    if(result==-1){
        printf("Dato NO encontrado");
    }else{
        printf("El dato esta en la posicion %d",result);
    }
}
