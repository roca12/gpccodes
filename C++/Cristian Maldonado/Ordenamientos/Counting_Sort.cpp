#include <iostream>
#include <string.h>

using namespace std;

void sorted(char arr[], int n){
    char output[n];
    int counting[256];
    memset(counting, 0, sizeof(counting));
    for(int i = 0; i < n; i++){
        ++counting[arr[i]];
    }
    for(int i = 1; i <= 255; ++i){
        counting[i] += counting[i - 1];
    }
    for(int i = n - 1; i >= 0; i--){
        output[counting[arr[i]] - 1] = arr[i];
        --counting[arr[i]];
    }
    for(int i = 0; i < n; ++i){
        arr[i] = output[i];
    }
}

int main()
{
    string entrada = "alkjslkjkdjaskjdkasjddf";
    char arr[entrada.size()];
    strcpy(arr, entrada.c_str());
    int tam = sizeof(arr)/sizeof(arr[0]);
    sorted(arr, tam);
    cout<<"Array de caracteres ordenado: "<<endl;
    for(int i = 0; i < tam; i++){
        if(i == tam - 1){
            cout<<arr[i]<<endl;
            break;
        }
        cout<<arr[i]<<" ";
    }
    return 0;
}
