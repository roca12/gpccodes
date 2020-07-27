#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int min (int x, int y){
	return (x<=y) ? x:y;
}
	
	int fibonacciSearch(int arr[], int buscado, int tam){
		if(buscado > arr[tam-1]){
			return -1;
		}
		int fib2 = 0;
		int fib1 = 1;
		int fibM = fib2+fib1;
		while(fibM < tam){
			fib2 = fib1;
			fib1 = fibM;
			fibM = fib2 + fib1;
		}
		int offset = -1;
		
		while(fibM > 1){
			int i = min((offset + fib2), (tam - 1));
			if(arr[i] < buscado){
				fibM = fib1;
				fib1 = fib2;
				fib2 = fibM - fib1;
				offset = i;
			}else if (arr[i] > buscado){
				fibM = fib2;
				fib1 = fib1 - fib2;
				fib2 = fibM - fib1;
			}else{
				return i;
			}
		}
		if(fib1 == 1 && arr[offset+1] == buscado){
			return offset+1;
		}
		return -1;
	}

int main (int argc, char *argv[]) {
	int arr[] = { 10, 22, 35, 40, 45, 50, 80, 82, 85, 90, 100 };
	int tam = sizeof(arr)/sizeof(0);
	int buscado = 90;
	int resultado = fibonacciSearch(arr, buscado, tam);
	if(resultado < 0){
		cout << "No encontrado" << endl;
	}else{
		cout << "Elemento encontrado en la posicion: "+std::to_string(resultado)<<endl;
	}
	return 0;
}
