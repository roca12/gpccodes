#include <bits/stdc++.h>
#include <cstdlib>
using namespace std; 
typedef long long int ll;
void bubble_sort(int arr[],int len){
	if(len==1){
		return;
	}
	for(int i=0;i<len-1;i++){
		if(arr[i]>arr[i+1]){
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		bubble_sort(arr,len-1);
	}
}
int main(){
	int arr[]={9,7,6,4,3,2,1,0};
	int len=sizeof(arr)/sizeof(arr[0]);
	bubble_sort(arr,len);
	for(int i=0;i<len;++i){
		printf("%d ",arr[i]);
	}
    return 0; 
} 
