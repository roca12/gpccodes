#include<cstdlib>
#include<bits/stdc++.h>
using namespace std;

int getMissingNo(int a[], int n){
	int x1 = a[0];
	int x2 = 1;
	for (int i = 1; i < n; i++) {
		x1 ^= a[i];
	}
	for (int i = 2; i <= n + 1; i++) {
		x2 ^= i;
	}
	return x1 ^ x2;
}




int main (int argc, char *argv[]) {
	int arr[] = {1,2,3,5,6,7,8};
	int n = sizeof(arr)/sizeof(arr[0]);
	int missed = getMissingNo(arr, n);
	cout<<"el numero que falta es: "<<missed<<endl;
	return 0;
}


