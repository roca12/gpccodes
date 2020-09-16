#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
void cycleSort(int arr[],int n){
    int writes=0;
    for(int cycle_start=0;cycle_start<=n-2;cycle_start++){
        int item=arr[cycle_start];
        int pos=cycle_start;
        for(int i=cycle_start+1;i<n;i++){
            if(arr[i]<item){
                pos++;
            }
        }
         if(pos==cycle_start){
                continue;
            }
            while(item==arr[pos]){
                swap(arr[pos],item);
                writes++;
            }
            while(pos!=cycle_start){
                pos=cycle_start;
                for(int i=cycle_start+1;i<n;i++){
                    if(arr[i]<item){
                        pos++;
                    }
                }
                 while(item==arr[pos]){
                        pos++;
                    }
                if(item!=arr[pos]){
                    swap(arr[pos],item);
                    writes++;
                }
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
    int arr[]={1,3,54,255,2,5,3,1,5,7,4,299,3,54,64,73};
    int N=sizeof(arr)/sizeof(arr[0]);
    cycleSort(arr,N);
    cout<<"arreglo ordenados"<<endl;
    printArr(arr,N);
}
