#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;
void minAbsoluteSumPair(int arr[],int n){
    int left,right,min_sum,sum,minl,minr;
    if(n==2){
        printf("invalido");
        return;
    }
    minl=0;
    minr=1;
    min_sum=arr[0]+arr[1];
    for(left=0; left<n-1;left++){
        for(right = left+1;right<n;right++){
            sum=arr[left]+arr[right];
            if(abs(min_sum)>abs(sum)){
                min_sum=sum;
                minl=left;
                minr=right;
            }
        }
    }
    cout<<"la suma minima tiene los valores de "<<arr[minl]<<" "<<arr[minr]<<" :"<<min_sum<<endl;
}
int main() {
    int arr[]={1,60,-10,70,-80,85};
    int n=sizeof (arr)/sizeof (arr[0]);
    minAbsoluteSumPair(arr,n);
}
