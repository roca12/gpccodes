#include <iostream>

using namespace std;

void cycleSort(int arr[], int n){
    int writes = 0;
    for(int cycle_start = 0; cycle_start <= n - 2; cycle_start++){
        int item = arr[cycle_start];
        int pos = cycle_start;
        for(int i = cycle_start + 1; i < n; i++){
            if(arr[i] < item){
                pos++;
            }
        }
        if(pos == cycle_start){
            continue;
        }
        while(item == arr[pos]){
            pos += 1;
        }
        if(pos != cycle_start){
            int temp = item;
            item = arr[pos];
            arr[pos] = temp;
            writes++;
        }
        while(pos != cycle_start){
            pos = cycle_start;
            for(int i = cycle_start + 1; i < n; i++){
                if(arr[i] < item){
                    pos += 1;
                }
            }
            while(item == arr[pos]){
                pos += 1;
            }
            if(item != arr[pos]){
                int temp = item;
                item = arr[pos];
                arr[pos] = temp;
                writes++;
            }
        }
    }
}

int main()
{
    ios_base::sync_with_stdio(false);cout.tie(NULL);
    int arr[] = {1, 8, 3, 9, 10, -10, -5, -4, -8, -90, 90, 80};
    int n = sizeof(arr)/sizeof(arr[0]);
    cycleSort(arr, n);
    cout<<"Luego de ordenar:"<<endl;
    for(int i = 0; i < n; i++){
        if(i == n - 1){
            cout<<arr[i]<<endl;
            break;
        }
        cout<<arr[i]<<" ";
    }
    return 0;
}
