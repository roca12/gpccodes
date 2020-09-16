#include <iostream>

using namespace std;

void mergeSort(int gArray[], int low, int mid1, int mid2, int high, int destArray[]){
    int i = low, j = mid1, k = mid2, m = low;
    //Elegir el pequenio de los mas pequenios de los 3 rangos
    while((i < mid1) && (j < mid2) && (k < high)){
        if(gArray[i] < gArray[j]){
            if(gArray[i] < gArray[k]){
                destArray[m++] = gArray[i++];
            }else{
                destArray[m++] = gArray[k++];
            }
        }else{
            if(gArray[j] < gArray[k]){
                destArray[m++] = gArray[j++];
            }else{
                destArray[m++] = gArray[k++];
            }
        }
    }
    /*Caso donde el primero y el segundo rango
      tienen valores restantes*/
    while((i < mid1) && (j < mid2)){
        if(gArray[i] < gArray[j]){
            destArray[m++] = gArray[i++];
        }else{
            destArray[m++] = gArray[j++];
        }
    }
    /*Caso donde el segundo y el tercer rango
      tienen valores restantes*/
    while((j < mid2) && (k < high)){
        if(gArray[j] < gArray[k]){
            destArray[m++] = gArray[j++];
        }else{
            destArray[m++] = gArray[k++];
        }
    }
    /*Caso dondel el primer y tercer rango
      tienen valores restantes*/
    while((i < mid1) && (k < high)){
        if(gArray[i] < gArray[k]){
            destArray[m++] = gArray[i++];
        }else{
            destArray[m++] = gArray[k++];
        }
    }
    //Copiar valores restantes del primer rango
    while(i < mid1){
        destArray[m++] = gArray[i++];
    }
    //Copiar valores restantes del segundo rango
    while(j < mid2){
        destArray[m++] = gArray[j++];
    }
    //Copiar valores restantes del tercer rango
    while(k < high){
        destArray[m++] = gArray[k++];
    }
}

void mergesort3WayRec(int gArray[], int low, int high, int destArray[]){
    //Si el tamanio del arreglo es 1, entonces no haga nada
    if(high - low < 2){
        return;
    }
    //separando el arreglo en 3 partes
    int mid1 = low + ((high - low)/3);
    int mid2 = low + 2 * ((high - low)/3) + 1;
    //Ordenando los 3 arreglos de forma recursiva
    mergesort3WayRec(destArray, low, mid1, gArray);
    mergesort3WayRec(destArray, mid1, mid2, gArray);
    mergesort3WayRec(destArray, mid2, high, gArray);
    //Fusionando los arreglos ordenados
    mergeSort(destArray, low, mid1, mid2, high, gArray);
}

void mergeSort3Way(int gArray[], int n){
    //Si el tamamio del arreglo es cero, retorna null
    if(n == 0){
        return;
    }
    //Crear el duplicado del arreglo dado
    int fArray[n];
    /*Copiar todos los elementos del arraglo dado
      dentro del arreglo usado como duplicado*/
    for(int i = 0; i < n; i++){
        fArray[i] = gArray[i];
    }
    //Funcion de ordenamiento
    mergesort3WayRec(fArray, 0, n, gArray);

    /*Copiar todos los elementos del arreglo duplicado
      al arreglo dado*/
    for(int i = 0; i < n; i++){
        gArray[i] = fArray[i];
    }
}

int main()
{
    ios_base::sync_with_stdio(false);cout.tie(NULL);
    int data[] = {145, -2, 45, -78, 30, -42, 10, -12, 73, -93};
    int n = sizeof(data)/sizeof(data[0]);
    mergeSort3Way(data, n);
    cout<<"Despues de 3 Way Merge Sort:"<<endl;
    for(int i = 0; i < n; i++){
        if(i == n - 1){
            cout<<data[i]<<endl;
            break;
        }
        cout<<data[i]<<" ";
    }
    return 0;
}
