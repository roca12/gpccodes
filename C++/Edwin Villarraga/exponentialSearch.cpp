#include <bits/stdc++.h>
#include <cstdlib>
int binarySearch(int arr[], int l, int r, int x) { 
    if (r >= l) { 
        int mid = l + (r - l)/2; 
        if (arr[mid] == x){
            return mid; 
        }
        if (arr[mid] > x) {
            return binarySearch(arr, l, mid-1, x); 
        }else{
        return binarySearch(arr, mid+1, r, x); 
    	}
    } 

    return -1; 
}
static int exponentialsearch(int arr[],int n,int x){
	if(arr[0]==x){
		return 0;
	}
	int i=1;
	while(i<n&&arr[i]<=x){
		i=i*2;
		int c= std::min(i,n);
		return binarySearch(arr,i/2,c,x);
	}
}

int main() {
	int arr[]={2,3,54,65,32};
	int n = sizeof(arr)/sizeof(arr[0]);
	int x=54;
	int result=exponentialsearch(arr,n,x);
	if(result<0){
		printf("Elemento no presente en el array");
	}else{
		printf("Elemento encontrado en el indice %d",result);
	}
	return 0;
}

