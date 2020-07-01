#include <bits/stdc++.h>
#include <cstdlib>

using namespace std;

void bubbleSort(int arr[], int tam){
    if(tam == 1){
        return;
    }
    for(int i = 0; i < tam; i++){
        for(int j = 0 ; j < tam - 1; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j + 1] = temp;
            }
        }
    }
}

int main()
{
   string entrada;
   getline(cin, entrada);
   stringstream check(entrada);
   string intermediate;
   vector <int> vec;
   while(getline(check,intermediate,' ')){
    vec.push_back(atoi(intermediate.c_str()));
   }
   int arr[vec.size()];
   for(int i = 0; i < vec.size(); i++){
    arr[i] = vec[i];
   }
   bubbleSort(arr, sizeof(arr)/sizeof(arr[0]));
   for(int i = 0; i < vec.size(); i++){
    cout << arr[i] << " ";
   }
   cout<<endl;
    return 0;
}
