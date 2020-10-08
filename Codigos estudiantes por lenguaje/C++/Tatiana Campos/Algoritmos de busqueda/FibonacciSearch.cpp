#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;
static int fibonacciSearch(int arr[],int x,int n){
    if(x>arr[n-1]){
        return -1;
    }
    int fibMMm2=0;
    int fibMMm1=1;
    int fibM=fibMMm2+fibMMm1;
    while(fibM<n){
        fibMMm2=fibMMm1;
        fibMMm1=fibM;
        fibM=fibMMm2+fibMMm1;
    }
    int offset=-1;
    while(fibM>1){
    int i = std::min(offset+fibMMm2,n-1);
    if(arr[i]<x){
        fibM=fibMMm1;
        fibMMm1=fibMMm2;
        fibMMm2=fibM-fibMMm1;
        offset=i;
    }else if(arr[i]>x){
        fibM=fibMMm2;
        fibMMm1-=fibMMm2;
        fibMMm2=fibM-fibMMm1;
    }
    else{
        return i;
    }
    }
    if(fibM==1 && arr[offset+1]==x){
        return offset+1;
    }
    return -1;
}
int main() {
    int arr[]={10,22,35,40,45,50,80,82,85,90,100};
    int n=sizeof(arr)/sizeof(arr[0]);
    int x=101;
    printf("Encontrado en la posicion %d",fibonacciSearch(arr,x,n));
    return 0;
}
