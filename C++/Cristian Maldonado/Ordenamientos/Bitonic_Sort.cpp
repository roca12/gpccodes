#include <iostream>

using namespace std;

void compAndSwap(int arr[], int i, int j, int dir){
    if((arr[i] > arr[j] && dir == 1)||(arr[i] < arr[j] && dir == 0)){
        swap(arr[i], arr[j]);
    }
}

void bitonicMerge(int arr[], int low, int cnt, int dir){
    if(cnt > 1){
        int k = cnt / 2;
        for(int i = low; i < low + k; i++){
            compAndSwap(arr, i, i + k, dir);
        }
        bitonicMerge(arr, low, k, dir);
        bitonicMerge(arr, low + k, k, dir);
    }
}

void bitonicSort(int arr[], int low, int cnt, int dir){
    if(cnt > 1){
        int k = cnt / 2;
        bitonicSort(arr, low, k, 1);
        bitonicSort(arr, low + k, k, 0);
        bitonicMerge(arr, low, cnt, dir);
    }
}

void sorted(int arr[], int N, int up){
    bitonicSort(arr, 0, N, up);
}

void printArray(int arr[], int n){
    for(int i = 0; i < n; ++i){
        if(i == n - 1){
            cout<<arr[i]<<endl;
            break;
        }
        cout << arr[i]<<" ";
    }
}

int main()
{
    int arr[] = {-5, -6, -1, -4, 8, 100, -90, -15, 35};
    int up = 1;
    int tam = sizeof(arr)/sizeof(arr[0]);
    sorted(arr, tam, up);
    cout<<"Array ordenado"<<endl;
    printArray(arr, tam);
    return 0;
}
