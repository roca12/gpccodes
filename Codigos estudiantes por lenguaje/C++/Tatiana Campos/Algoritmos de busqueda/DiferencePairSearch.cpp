#include<bits/stdc++.h>
using namespace std;
bool findPair(int arr[],int n,int SIZE){
    int i=0,j=1;
    while(i<SIZE&&j<SIZE){
        if(i!=j&&arr[j]-arr[i]==n){
            printf("par encontrado (%d - %d)\n",arr[i],arr[j]);
            return true;
        }
        else if(arr[j]-arr[i]<n){
            j++;
        }else{
            i++;
        }
    }
    printf("par no encontrado");
    return false;
}
int main() {
    int arr[]={1,8,30,40,100};
    int x=60;
    int n=sizeof (arr)/sizeof (arr[0]);
    findPair(arr,x,n);
}
