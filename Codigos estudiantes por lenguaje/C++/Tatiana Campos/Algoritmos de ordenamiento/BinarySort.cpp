#include <iostream>

using namespace std;

int binarySearch(int arr[], int i, int low, int high)
{
    if(high <=low){
        return(i > arr[low]) ? (low + 1): low;
    }
    int mid = (low + high)/2;
    if(i == arr[mid]){
        return mid + 1;
    }
    if(i > arr[mid]){
        return binarySearch(arr, i, mid + 1, high);
    }
    return binarySearch(arr, i, low, mid -1);
}

void insertionSort(int arr[], int n){
    int i, loc, j, selected;
    for(i = 1; i < n; ++i){
        j = i - 1;
        selected = arr[i];
        loc = binarySearch(arr, selected, 0, j);
        while(j >= loc){
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = selected;
    }
}

int main()
{
    int arr[] = {-63, 8, -7, -15, -19, 17, 19, 110};
    int n = sizeof(arr)/sizeof(arr[0]);
    insertionSort(arr, n);
    cout<<"Arreglo ordenado:"<<endl;
    for(int i = 0; i < n; i++){
        if(i == n - 1){
            cout<<arr[i]<<endl;
            break;
        }
        cout<<arr[i]<<" ";
    }
    return 0;
}
