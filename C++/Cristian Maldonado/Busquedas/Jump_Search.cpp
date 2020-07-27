#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int jumpSearch(int arr[], int x, int tam){
	int step = (int) floor(sqrt(tam));
	int prev = 0;
	while(arr[min(step,tam)-1] < x){
		prev = step;
		step += (int) floor(sqrt(tam));
		if(prev >= tam){
			return -1;
		}
	}
	while(arr[prev] < x){
		prev++;
		if(prev == min (step,tam)){
			return -1;
		}
	}
	if(arr[prev] == x){
		return prev;
	}
	return -1;
}

int main (int argc, char *argv[]) {
	int arr[] = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
	int x = 144;
	int resultado = jumpSearch(arr, x, sizeof(arr)/sizeof(0));
	if(resultado == -1){
		cout << "No encontrado" << endl;
	}else{
		cout << "Encontrado en la posicion: " + std::to_string(resultado) << endl;
	}
	return 0;
}
