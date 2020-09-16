#include<iostream>
using namespace std;

int ternarySearch(int x, int r, int key, int arr[]){
	if(r>=x){
		int mid1 = x + (r - x)/3;
		int mid2 = r -(r - x)/3;
		if(arr[mid1] == key){
			return mid1;
		}
		if(arr[mid2] == key){
			return mid2;
		}
		if(key < arr[mid1]){
			return ternarySearch(x, mid1-1, key, arr);
		}else if (key > arr[mid2]){
			return ternarySearch(mid2+1, r, key, arr);
		}else{
			return ternarySearch(mid1+1, mid2-1, key,arr);
		}
	}
	return -1;
}

int main (int argc, char *argv[]) {
	int x, r, resultado, key;
	int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	x = 0;
	r = (sizeof(arr)/sizeof(0))-1;
	key = 5;
	resultado = ternarySearch(x, r, key, arr);
	if(resultado < 0){
		cout << "Elemento no presente en el arreglo" << endl;
	}else{
		cout << "Elemento encontrado en la posicion "+ std::to_string(resultado) << endl;
	}
	return 0;
}
