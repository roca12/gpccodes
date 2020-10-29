#include <bits/stdc++.h>
#include <cstdlib>

static int binarysearch(int arr[],int l,int r,int x){
	if(r>=l){
		int mid=l+(r-1)/2;
			if(arr[mid]==x){
		return mid;
	}
	if(arr[mid]>x){
		return binarysearch(arr,l,mid-1,x);
	}else{
		return binarysearch(arr,mid+1,r,x);
	}
	}

	return -1;
}
int main() {
	int arr[]={2,3,4,5,6};
	int n=sizeof(arr)/sizeof(arr[0]);
	int x=5;
	int resultado=binarysearch(arr,0,n-1,x);
	if(resultado==-1){
		printf("elemento no presente");
	}else{
		printf("elemento encontrado en el indice: %d",resultado);
	}
	return 0;
}
