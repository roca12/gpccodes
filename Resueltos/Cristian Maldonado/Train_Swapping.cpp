#include<iostream>
using namespace std;

int cambios (int arr[], int size){
	int contador = 0;
	if(size == 2){
		return 1;
	}
	for(int i = 0; i < size; i++){
		for(int j = 0; j < size-1; j++){
			if(arr[j] > arr[j+1]){
				contador ++;
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
	return contador;
}

int main (int argc, char *argv[]) {
	int casos = 0;
	scanf("%i", &casos);
	for(int i = 0; i < casos; i++){
		int tam = 0;
		scanf("%i", &tam);
		int vector[tam];
		for(int j = 0; j < tam ; j++){
			scanf("%i", &vector[j]);
		}
		int resultado = cambios(vector, sizeof(vector)/sizeof(0));
		cout << "Optimal train swapping takes "+std::to_string(resultado)+" swaps."<<endl;
	}
	return 0;
}
