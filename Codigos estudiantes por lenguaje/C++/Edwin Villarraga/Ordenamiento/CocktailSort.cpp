#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
void cocktailSort(int arr[],int endArr){
    bool swapped = true;
    int start=0;
    while(swapped){
        swapped=false;
        for(int i=start;i<endArr-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                swapped=true;
            }
        }
        if(swapped==false){
            break;
        }
        swapped=false;
        endArr-=1;
        for(int i=endArr-1;i>=start;i--){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                swapped=true;
            }
        }
        start+=1;
    }
}
void printArr(int arr[],int n){
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}
int main() {
    int arr[]={5,1,4,2,8,0,2};
    int n=sizeof arr/sizeof arr[0];
    cocktailSort(arr,n);
    cout<<"arreglo ordenado"<<endl;
    printArr(arr,n);
}
