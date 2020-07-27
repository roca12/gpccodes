#include<iostream>
using namespace std;

void minAbsSumPair(int arr[], int n){
	int l, r, min_sum,sum =0, min_l, min_r;
	if(n < 2){
		cout << "Array no tiene la cantidad de valores necesarios"<<endl; 
		return;
	}
	min_l = 0;
	min_r = 1;
	min_sum = arr[0] + arr[1];
	for(l = 0; l < n; l++){
		for(r = l+1; r <n;r++){
			sum = arr[l]+arr[r];
			if(abs(min_sum) > abs(sum)){
				min_sum = sum;
				min_l = l;
				min_r = r;
			}
		}
	}
	cout << "Los dos elementos con la suma minima son: "<<arr[min_l]<<" y "<<arr[min_r]<<endl; 
}

int main (int argc, char *argv[]) {
	int arr [] = {1,60,-10,70,-80,85};
	minAbsSumPair(arr,sizeof(arr)/sizeof(0));
	return 0;
}
