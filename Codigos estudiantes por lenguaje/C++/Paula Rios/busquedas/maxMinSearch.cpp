#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;
pair <int,int> getMaxMin(int arr[],int n){
    pair<int,int>min_max;
    if(n==1){
       min_max=make_pair(arr[0],arr[0]);
    }
    if(arr[0]>arr[1]){
        min_max=make_pair(arr[1],arr[0]);
    }else{
        min_max=make_pair(arr[0],arr[1]);
    }
    for(int j=2;j<n;j++){
        if(arr[j]>min_max.second){
            min_max.second=arr[j];
        }else if(arr[j]<min_max.first){
            min_max.first=arr[j];
        }
    }
    return min_max;
}
int main(){
    int arr[]={3,4,6,7,2,324,32,5,6,2,1,1,0,6,456};
    int n=sizeof (arr)/ sizeof (arr[0]);
    pair<int,int> min_max(getMaxMin(arr,n));
    cout<<min_max.first<<" "<<min_max.second<< endl;
}
