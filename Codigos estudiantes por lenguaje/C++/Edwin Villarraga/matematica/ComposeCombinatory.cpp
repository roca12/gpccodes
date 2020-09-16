#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
void printArr(int arr[],int n){
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}
void printCompositions(int arr[],int n,int i){
    int MAX_POINT=3;
    if(n==0){
        printArr(arr,i);
    }else if(n>0){
        for(int k=1;k<=MAX_POINT;k++){
            arr[i]=k;
            printCompositions(arr,n-k,i+1);
        }
    }
}
int main(){
    int n=5;
    int len=100;
    int arr[len];
    printCompositions(arr,n,0);
    return 0;
}
