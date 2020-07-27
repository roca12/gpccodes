#include<iostream>
#include<bits/stdc++.h>
using namespace std;

static int binarySearch(int arr[],int inicio, int fin,int x){
	if(fin>inicio){
		int mid = (inicio+(fin-1))/2;
		if(arr[mid]==x){
			return mid;
		}
		if(arr[mid]>x){
			return binarySearch(arr,inicio,mid-1,x);
		}else{
			return binarySearch(arr,mid+1,fin,x);
		}
	}
	return -1;
}

int exponentialSearch(int arr[], int tam , int buscado){
	if(arr[0] == buscado){
		return 0;
	}
	int i = 1;
	while (i<tam && arr[i] <=buscado){
		i = i*2;
	}
	return binarySearch(arr, i/2, min(i,tam),buscado);
}

int main (int argc, char *argv[]) {
	int vector [] = {1,2,3,4,5};
	int buscado = 2;
	int resultado = exponentialSearch(vector,(sizeof(vector)/sizeof(0)), buscado);
	cout << (resultado < 0 ? "Elemento no presente en el arreglo":"Elemento encontrado en la posicion: "+std::to_string(resultado))<<endl;
	return 0;
}
