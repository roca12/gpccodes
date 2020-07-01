#include <bits/stdc++.h>
#include <cstdlib>

using namespace std;

int getMax(int arr[], int n){
    int mx = arr[0];
    for(int i = 1; i < n; i++){
        if(arr[i] > mx){
            mx = arr[i];
        }
    }
    return mx;
}

void countSort(int arr[], int n, int exp){
    int output[n];
    int i;
    int countt[10];
    memset(countt, 0, sizeof(countt));
    for(i = 0; i < n; i++){
        countt[(arr[i] / exp)%10]++;
    }
    for(i = 1; i < 10; i++){
        countt[i] += countt[i - 1];
    }
    for(i = n - 1; i >= 0; i--){
        output[countt[(arr[i]/exp)%10]-1] = arr[i];
        countt[(arr[i]/exp)%10]--;
    }
    for(i = 0; i < n; i++){
        arr[i] = output[i];
    }
}

void radixSort(int arr[], int n){
    int m = getMax(arr, n);
    for(int exp = 1; m/exp > 0; exp *= 10){
        countSort(arr, n, exp);
    }
}

void print(int arr[], int n){
    for(int i = 0; i < n; i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}


int main()
{
    string entrada;
    getline(cin, entrada);
    string intermediate;
    stringstream check(entrada);
    vector <int> vec;
    while(getline(check, intermediate, ' ')){
        vec.push_back(atoi(intermediate.c_str()));
    }
    int arr[vec.size()];
    for(int i = 0; i < vec.size(); i++){
        arr[i] = vec[i];
    }
    radixSort(arr, sizeof(arr)/sizeof(arr[0]));
    print(arr, sizeof(arr)/sizeof(arr[0]));
    return 0;
}
