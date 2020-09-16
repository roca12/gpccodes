#include <bits/stdc++.h>
#include <cstdlib>

using namespace std;
int RUN = 32;

void insertionSort(int arr[], int left, int right){
   int i;
   for(i = left + 1; i <= right; i++){
    int temp = arr[i];
    int j = i - 1;
    while(arr[j] > temp && j >= left){
        arr[j + 1] = arr[j];
        j--;
        if(j < 0){
            break;
        }
    }
    arr[j + 1] = temp;
   }
}

void mergeUtil(int arr[], int x, int m, int r){
    int len1 = m - x + 1, len2 = r - m;
    int left[len1];
    int right[len2];
    for(int i = 0; i < len1; i++){
        left[i] = arr[x + i];
    }
    for(int i = 0; i < len2; i++){
        right[i] = arr[m + 1 + i];
    }
    int i = 0, j = 0, k = x;
    while(i < len1 && j < len2){
        if(left[i] <= right[j]){
            arr[k] = left[i];
            i++;
        }else{
            arr[k] = right[j];
            j++;
        }
        k++;
    }
    while(i < len1){
        arr[k] = left[i];
        k++;
        i++;
    }
    while(j < len2){
        arr[k] = right[j];
        k++;
        j++;
    }
}

void timSort(int arr[], int tam){
    for(int i = 0; i < tam; i+=RUN){
        insertionSort(arr, i, min((i + 31), (tam - 1)));
    }
    for(int sizet = RUN; sizet < tam; sizet = 2 * sizet){
        for(int left = 0; left < tam; left += 2 * sizet){
            int mid = left + sizet - 1;
            int right = min((left + 2 * sizet - 1), (tam - 1));
            mergeUtil(arr, left, mid, right);
        }
    }
}

int main()
{
    string entrada;
    getline(cin, entrada);
    string intermedio;
    stringstream check (entrada);
    vector <int> vec;
    while(getline(check, intermedio, ' ')){
        vec.push_back(atoi(intermedio.c_str()));
    }
    int arr[vec.size()];
    for(int i = 0; i < vec.size(); i++){
        arr[i] = vec[i];
    }
    timSort(arr, vec.size());
    for(int i = 0; i < vec.size(); i++){
        cout << arr[i] << " ";
    }
    cout<<endl;
    return 0;
}
