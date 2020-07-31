#include <iostream>

using namespace std;

void cocktailSort(int arr[], int n){
    bool swapped = true;
    int start = 0;
    int ended = n;
    while(swapped == true){
        swapped = false;
        for(int i = start; i < ended - 1; ++i){
            if(arr[i] > arr[i + 1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                swapped = true;
            }
        }
        if(swapped == false){
            break;
        }
        swapped = false;
        ended = ended - 1;
        for(int i = ended - 1; i >= start; i--){
            if(arr[i] > arr[i + 1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                swapped = true;
            }
        }
        start += 1;
    }
}

void printArray(int arr[], int n){
    for(int i = 0; i < n; i++){
        if(i == n - 1){
            cout<<arr[i]<<endl;
            break;
        }
        cout<<arr[i]<<" ";
    }
}

int main()
{
    int arr[] = {-5, -90, 5, 9, 7, -15, 8, 2, -8, 0, 1, 32, -35};
    int tam = sizeof(arr)/sizeof(arr[0]);
    cocktailSort(arr, tam);
    cout<<"Arreglo ordenado"<<endl;
    printArray(arr, tam);
    return 0;
}
