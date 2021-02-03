#include<iostream>

using namespace std;

int binarySearch(int arr[],int start, int last, int x){
	if(last >= start){
		int mid = start +(last - start)/2;
		if(arr[mid] == x)
			return mid;
		if(arr[mid] > x){
			return binarySearch(arr, start, mid-1, x);
		}else{
			return binarySearch(arr, mid+1, last, x);
		}
    }
	return -1;
}

int exponentialSearch(int arr[], int tam , int lost){
	if(arr[0] == lost){
		return 0;
	}
	int i = 1;
	while (i < tam && arr[i] <= lost){
		i = i * 2;
	}
	return binarySearch(arr, i/2, min(i,tam - 1),lost);
}

int main () {
    ios_base::sync_with_stdio(0);cin.tie(0);
	int tam; cin>>tam;
	int arr[tam];
	for(int i = 0; i < tam; i++){
        cin>>arr[i];
	}
	int lost; cin>>lost;
	cout<<"The number was found at position: "<<exponentialSearch(arr, tam, lost)<<endl;
	return 0;
}

