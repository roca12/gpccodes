#include <iostream>

using namespace std;

void combUtil(int arr[], int data[], int start, int ended, int index, int r){
    if(index == r){
        for(int i = 0; i < r; i++){
            cout<<data[i]<<" ";
        }
        cout<<endl;
        return;
    }
    for(int i = start; i <= ended && ended - i + 1 >= r - index; i++){
        data[index] = arr[i];
        combUtil(arr,data, i + 1, ended, index + 1, r);
    }
}

void printComb(int arr[], int n, int r){
    int data[r];
    combUtil(arr, data, 0, n - 1, 0, r);
}

int main()
{
    int arr[] = {10, 2, 4, 6, 7};
    int r = 3;
    int n = sizeof(arr)/sizeof(arr[0]);
    printComb(arr, n, r);
    return 0;
}
