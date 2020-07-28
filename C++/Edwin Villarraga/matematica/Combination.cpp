#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
int cont=0;
void combUtil(int arr[],int data[],int start,int ends,int index,int r){
    if(index==r){
        for(int i=0;i<r;i++){
            cout<<data[i]<<" ";
        }
        cout<<endl;
        cont++;
        return;
    }
    for(int i=start;i<=ends && ends - i + 1 >= r - index;i++){
        data[index]=arr[i];
        combUtil(arr,data,i+1,ends,index+1,r);
    }
}
void printComb(int arr[],int n,int r){
    int data[r];
    combUtil(arr,data,0,n-1,0,r);
}
int main() {
    int arr[]={1,2,3,4,5};
    int r=3;
    int n=sizeof arr/sizeof arr[0];
    printComb(arr,n,r);
    cout<<"total de combinaciones "<<cont<<endl;
}
