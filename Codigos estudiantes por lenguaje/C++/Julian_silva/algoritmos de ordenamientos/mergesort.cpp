#include <bits/stdc++.h>
using namespace std;

void mergeUtil(int arr[], int left, int mid, int right){
    int tam1 = mid - left + 1;
    int tam2 = right - mid;
    int Left[tam1];
    int Right[tam2];
    for(int i = 0; i < tam1; i++){
        Left[i] = arr[left + i];
    }
    for(int i = 0; i < tam2; i++){
        Right[i] = arr[mid + 1 + i];
    }
    int i = 0, j = 0, k = left;
    while(i < tam1 && j < tam2){
        if(Left[i] <= Right[j]){
            arr[k] = Left[i];
            i++;
        }else{
            arr[k] = Right[j];
            j++;
        }
        k++;
    }
    while(i < tam1){
        arr[k] = Left[i];
        i++;
        k++;
    }
    while(j < tam2){
        arr[k] = Right[j];
        j++;
        k++;
    }
}

void mergeSort(int arr[], int left, int right){
    if(left < right){
        int m = (left + right)/2;
        mergeSort(arr, left, m);
        mergeSort(arr, (m + 1), right);
        mergeUtil(arr, left, m , right);
    }
}

void print(int arr[], int n){
    for(int i = 0; i < n; i++){
        if(i == (n-1)){
            cout << arr[i] << endl;
        }else{
            cout << arr[i] <<" ";
        }
    }
}

int main (int argc, char *argv[]) {
    string str;
    getline(cin,str);
    string intermediate;
    vector<int> vec;
    stringstream check1(str);
    while(getline(check1, intermediate, ' ')) {
        vec.push_back(atoi(intermediate.c_str()));
    }
    int arr[vec.size()];
    for(int i = 0;i < vec.size();++i){
        arr[i] = vec[i];
    }
    int tam = sizeof(arr)/sizeof(arr[0]);
    mergeSort(arr, 0, tam - 1);
    print(arr, tam);
    return 0;
}
