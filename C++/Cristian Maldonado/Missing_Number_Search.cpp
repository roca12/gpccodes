#include<iostream>
using namespace std;

int getMissedNo(int arr[], int n){
	int x1 = arr[0]; 
	int x2 = 1;
	for(int i = 1; i < n ; i++){
		x1 = x1 ^arr[i];
	}
	for(int j = 2; j <= n+1; j++){
		x2 = x2^j;
	}
	return (x1^x2);
}

int main (int argc, char *argv[]) {
	int arr[] = {1,2,3,5,6,7,8,9,10,11};
	int missed = getMissedNo(arr,sizeof(arr)/sizeof(0));
	cout << "El numero perdido es: " << missed << endl;
	return 0;
}

