#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
void pigeonHole(int arr[],int n){
    int MIN=arr[0];
    int MAX=arr[0];
    int range=0,i,j,index=0;
    for(int a=0;a<n;a++){
        if(arr[a]>MAX){
            MAX=arr[a];
        }
        if(arr[a]<MIN){
            MIN=arr[a];
        }
    }
    range= MAX - MIN + 1;
    int phole[range];
    memset(phole,0,sizeof phole);
    for(i=0;i<n;i++){
        phole[arr[i]-MIN]++;
    }
    for(j=0;j<range;j++){
        while(phole[j]--){
            arr[index++]=j+MIN;
        }
    }
}
void printArr(int arr[],int n){
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}
int main() {
    int arr[]={1,3,54,255,2,5,3,1,5,7,4,299,3,54,64,73,-1};
    int N=sizeof(arr)/sizeof(arr[0]);
    pigeonHole(arr,N);
    cout<<"arreglo ordenados"<<endl;
    printArr(arr,N);
}
