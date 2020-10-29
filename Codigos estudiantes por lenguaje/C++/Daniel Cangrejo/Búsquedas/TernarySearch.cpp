#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;
static int ternarySearch(int left,int r,int key,int arr[]){
	if(r>=left){
		int mid1 = left + (r-left)/3;
		int mid2 = r - (r-left)/3;
		if (arr[mid1]==key){
			return mid1;
		}
		if(arr[mid2]==key){
			return mid2;
		}if(key<arr[mid1]){
			return ternarySearch(left,mid1-1,key,arr);
		}else if(key>arr[mid2]){
			return ternarySearch(mid2+1,r,key,arr);
		}else{
			return ternarySearch(mid1+1,mid2-1,key,arr);
		}
		
	}
	return -1;
}
int main() {
	int arr[]={1,2,3,4,5,6,7,8,9};
	int n = sizeof(arr)/sizeof(arr[0]);
	int l=0;
	int r=9;
	int x=5;
	int result = ternarySearch(l,r,x,arr);
	if(result<0){
		printf("el numero %d no se encuentra en el array\n",x);
	}else{
	printf("indice encontrado en la posicion %d\n",result);
}
	return 0;
}
