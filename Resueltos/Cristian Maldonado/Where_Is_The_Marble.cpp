#include<bits/stdc++.h>
#include<cstdlib>

using namespace std;

int partition (int arr [], int low, int high){
	int pivot = arr[high];
	int i = low - 1;
	for(int j = low; j < high; j++){
		if(arr[j] <= pivot){
			i++;
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	int temp = arr[i + 1];
	arr[i + 1] = arr[high];
	arr[high] = temp;
	return i + 1;
}

void quickSort(int arr[], int low, int high){
    if(low < high){
        int pivot = partition(arr, low, high);
        quickSort(arr, low, pivot - 1);
        quickSort(arr, pivot + 1, high);
    }
}

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
    int contador = 1;
    while(!cin.eof()){
        int tam = 0;
        int busquedas = 0;
        scanf("%i %i",&tam,&busquedas);
        if(tam == 0 && busquedas == 0){
            break;
        }
        int vector[tam];
        for (int i = 0; i < tam ; i++){
            scanf("%i",&vector[i]);
        }
        int buscar[busquedas];
        for (int i = 0; i < busquedas; i++){
            scanf("%i", &buscar[i]);
        }
        quickSort(vector, 0, tam-1);
        cout << "CASE# "<<contador<<":"<<endl;
        ++contador;
        for(int j = 0; j < busquedas; j++){
			int resultado = jumpSearch(vector, buscar[j],tam);
			if(resultado < 0){
				cout <<buscar[j]<<" not found" << endl;
			}else{
				cout <<buscar[j]<<" found at "+ std::to_string(resultado+1) << endl;
			}
		}
	}
}
