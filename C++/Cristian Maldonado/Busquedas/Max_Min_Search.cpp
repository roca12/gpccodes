#include<cstdlib>
#include<bits/stdc++.h>

using namespace std;

void conPair(int arr[], int n){
	pair <int, int> par;
	if(n == 1){
		par.first = arr[0];
		par.second = arr[0];
	}
	if(arr[0]>arr[1]){
		par.first = arr[0];
		par.second = arr[1];
	}else{
		par.first = arr[1];
		par.second = arr[0];
	}
	for(int i = 2; i < n; i++){
		if(arr[i] > par.first){
			par.first = arr[i];
		}else if(arr[i] < par.second){
			par.second = arr[i];
		}
	}
	cout << "El mayor es: " << par.first <<endl;
	cout << "El menor es: " << par.second <<endl;
}

void calcular(int arr[], int n){
	int max = 0, min = 0;
 	if(n == 1){
		max = arr[0];
		min = arr[0];
	}
	if(arr[0]>arr[1]){
		max = arr[0];
		min = arr[1];
	}else{
		max = arr[1];
		min = arr[0];
	}
	for(int i = 2; i < n; i++){
		if(arr[i] > max){
			max = arr[i];
		}else if(arr[i] < min){
			min = arr[i];
		}
	}
	cout << "El minimo es : "<<min << endl;
	cout << "El maximo es : "<<max << endl;
}

int main (int argc, char *argv[]) {
	int arr []= {1000, 11, 445, 1, 330, 3000};
	int n = sizeof(arr)/sizeof(0);
	calcular(arr,n);
	conPair(arr,n);
		return 0;
}

