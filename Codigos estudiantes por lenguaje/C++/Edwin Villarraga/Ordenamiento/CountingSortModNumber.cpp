#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
int number[300];
void sortArr(int arr[],int n){
    memset(number,0,sizeof number);
    int len=sizeof(number)/sizeof (arr[0]);
    for(int i=0;i<n;i++){
        number[arr[i]]++;
    }
    for(int i=0;i<len;i++){
            if(number[i]>0){
                while(number[i]!=0){
                    cout<<i<<" ";
                    number[i]--;
                }
            }
    }
    cout<<endl;

}
int main() {
    int arr[]={1,3,54,255,2,5,3,1,5,7,4,299,3,54,64,73};
    int len=sizeof(arr)/sizeof(arr[0]);
    cout<<"arreglo ordenados"<<endl;
    sortArr(arr,len);
}
