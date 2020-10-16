#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
void cycleSort(int arr[],int n){
    int writes=0;
    for(int cyclestart=0;cyclestart<n-2;cyclestart++){
        int item=arr[cyclestart];
        int pos=cyclestart;
        for(int i=cyclestart+1;i<n;i++){
            if(arr[i]<item){
                pos++;
            }
        }
        if(pos==cyclestart)continue;
        while(item==arr[pos]){
            pos++;
        }
        if(pos!=cyclestart){
            swap(item,arr[pos]);
            writes++;
        }
        while(pos!=cyclestart){
            pos=cyclestart;
            for(int i=cyclestart+1;i<n;i++){
                if(arr[i]<item){
                    pos++;
                }
            }
            while(item==arr[pos]){
                pos++;
            }
            if(item!=arr[pos]){
                swap(item,arr[pos]);
                writes++;
            }
        }
    }

}
int main() {
    int arr[]={1,8,3,9,10,2,4,10,45,-5};
    int n=sizeof(arr)/sizeof(arr[0]);
    cycleSort(arr,n);
    for(int i:arr){
        printf("%d ",i);
    }
}
