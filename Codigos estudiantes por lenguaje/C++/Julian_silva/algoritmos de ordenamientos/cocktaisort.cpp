#include<bits/stdc++.h>
#include<cstdlib>
#define printArr(arr,x,n) for(int i=x;i<n;i++){cout<<arr[i]<<" ";}cout<<endl;
//---------------//
using namespace std;
void cocktailSort(int arr[],int n){
    bool swapped=true;
    int start=0;
    int ennd=n;
    while(swapped==true){
        swapped==false;
        for(int i=start;i<ennd-1;i++){
            if(arr[i]>arr[i+1]){
                swap(arr[i],arr[i+1]);
                swapped=true;
            }
        }
        if(swapped==false){
            break;
        }
        swapped=false;
        ennd-=1;
        for(int i=ennd-1;i>=start;i--){
            if(arr[i]>arr[i+1]){
                swap(arr[i],arr[i+1]);
                swapped=true;
            }
        }
        start+=1;
    }
}
int main(){
    int arr[]={3,4,5,2,1,5,6,4};
    int n=sizeof(arr)/sizeof(arr[0]);
    printArr(arr,0,n);
    cocktailSort(arr,n);
    printArr(arr,0,n);
}
