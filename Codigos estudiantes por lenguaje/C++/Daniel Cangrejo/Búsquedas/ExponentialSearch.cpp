#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;

int binarySearch(int arr[], int l, int r, int x) { 
    if (r >= l) { 
        int mid = l + (r - l)/2; 
        if (arr[mid] == x){
            return mid; 
        }
        if (arr[mid] > x) {
            return binarySearch(arr, l, mid-1, x); 
        }else{
        return binarySearch(arr, mid+1, r, x); 
    	}
    } 

    return -1; 
}

int exponentialSearch(int arr[], int n, int x) {
    if (arr[0] == x) {
        return 0;
    }
    int i = 1;
    while (i < n && arr[i] <= x) {
        i = i * 2;
    }
    return binarySearch(arr, i / 2, min(i, n), x);
}

int main(int argc, char const *argv[]) {
    int arr[] = {1, 2, 3, 4, 5};
    int n = sizeof (arr) / sizeof (arr[0]);
    int x=5;
    int result = exponentialSearch(arr, n, x);
    if (result < 0) {
        cout << "El resultado no esta presente en el Array" << endl;
    } else {
        cout << "Elemento encontrado en el indice " << result << endl;
    }

    return 0;
}
