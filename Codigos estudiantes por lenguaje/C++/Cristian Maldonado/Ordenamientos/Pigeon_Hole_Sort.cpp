#include <iostream>
#include <string.h>
#include <vector>

using namespace std;

void pigeonHoleSort(int arr[], int n){
    int minim = arr[0];
    int maxim = arr[0];
    int range, i;
    for(int a = 0; a < n; a++){
        if(arr[a] > maxim){
            maxim = arr[a];
        }
        if(arr[a] < minim){
            minim = arr[a];
        }
    }
    range = maxim - minim + 1;

    //Crear un arreglo de vectores de tamamio range.
    //Cada vector representa un agujero que estara
    //para contener los elementos que coincidentes
    vector<int> pHole[range];
    memset(pHole, 0, range);

    //Atravesar el arreglo de entrada y colocar cada elemento
    //en su respectivo agujero
    for(i = 0; i < n; i++){
        pHole[arr[i] - minim].push_back(arr[i]);
    }

    //Recorrer todos los agujeros uno a uno.
    //Para cada agujero, se toma sus elementos y se
    //colocan en el arreglo dado.
    int index = 0;
    for(i = 0; i < range; i++){
        for(int k: pHole[i]){
            arr[index++] = k;
        }
    }
}

int main()
{
    ios_base::sync_with_stdio(false);cout.tie(NULL);
    int arr[] = {-8, 4, -5, 8, -6, 90, 70, -95, -100, 105, 97, -1000};
    cout<<"Arreglo ordenado:"<<endl;
    int n = sizeof(arr)/sizeof(arr[0]);
    pigeonHoleSort(arr, n);
    for(int i = 0; i < n; i++){
        if(i == n - 1){
            cout<<arr[i]<<endl;
            break;
        }
        cout<<arr[i]<<" ";
    }
    return 0;
}
