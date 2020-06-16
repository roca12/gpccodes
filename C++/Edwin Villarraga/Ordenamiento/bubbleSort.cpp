#include <bits/stdc++.h>
#include <cstdlib>
//recursivo vale verga :3
using namespace std; 
typedef long long int ll;
void bubble_sort(int arr[],int len){
	if(len==1){
		return;
	}
	for(int j=0;j<len;j++){
		for(int i=0;i<len-1;i++){
		if(arr[i]>arr[i+1]){
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
			}
		}
	}
}
int main(){
	int arr[]={9,7,6,4,3,2,1,7,8,43,43,4,54,54,3,234,1,23};
	int len=sizeof(arr)/sizeof(arr[0]);
	bubble_sort(arr,len);
	for(int i=0;i<len;++i){
		printf("%d ",arr[i]);
	}
    return 0; 
}
