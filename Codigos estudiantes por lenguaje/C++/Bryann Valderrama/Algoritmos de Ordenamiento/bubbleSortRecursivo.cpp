#include <cstdlib>
#include <bits/stdc++.h>
#define NUM 15
using namespace std;

void bubbleSort(int arr[], int len)
{
    if (len == 1)
    {
        return;
    }
    for (int i = 0; i < len - 1; i++)
    {
        if (arr[i] > arr[i + 1])
        {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
    bubbleSort(arr, len - 1);
}

int main(int argc, char const *argv[])
{
    int lista[NUM] = {};
    for (int i = 0; i < NUM; i++)
    {
        cin >> lista[i];
    }
    int len = sizeof(lista) / sizeof(lista[0]);
    bubbleSort(lista, len);
    for (int j = 0; j < len; j++)
    {
        cout << lista[j] << " ";
    }
    return 0;
}
