#include <iostream>

using namespace std;

void printSubsets(string arr[], int n){
    for(int i = 0; i < (1 << n); i++){
        cout<<"{";
        for(int j = 0; j < n; j++){
            if((i & (1 << j)) > 0){
                cout<<arr[j]<<" ";
            }
        }
        cout<<"}"<<endl;
    }
}

int main()
{
    string colores[] = {"negro", "blanco", "amarillo", "morado"};
    printSubsets(colores, sizeof(colores)/sizeof(colores[0]));
    return 0;
}
