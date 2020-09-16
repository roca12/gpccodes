#include <iostream>

using namespace std;

int getNextGap(int gap){
    gap = (gap * 10)/13;
    if(gap < 1){
        return 1;
    }
    return gap;
}

void sorted(int arr[], int n){
    int gap = n;
    bool swapped = true;
    while(gap != 1 || swapped == true){
        gap = getNextGap(gap);
        swapped = false;
        for(int i = 0; i < n - gap; i++){
            if(arr[i] > arr[i + gap]){
                int temp = arr[i];
                arr[i] = arr[i + gap];
                arr[i + gap] = temp;
                swapped = true;
            }
        }
    }
}

int main()
{
    int arr[] = {8, 4, 1, 56, 3, -44, 23, -6, 28, 0, -10};
    int tam = sizeof(arr)/sizeof(arr[0]);
    sorted(arr, tam);
    cout<<"Array ordenado"<<endl;
    for(int i = 0; i < tam; i++){
        if(i == tam - 1){
            cout<<arr[i]<<endl;
            break;
        }
        cout<<arr[i]<<" ";
    }
    return 0;
}
