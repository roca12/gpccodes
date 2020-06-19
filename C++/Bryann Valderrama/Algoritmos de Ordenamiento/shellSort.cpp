#include <cstdlib>
#include <bits/stdc++.h>
using namespace std;

int shellSort(int arr[], int n)
{
    for (int gap = n / 2; gap > 0; gap = gap / 2)
    {
        for (int i = gap; i < n; i++)
        {
            int temp = arr[i];
            int j;
            for (j = i; j >= gap && arr[j - gap] > temp; j = j - gap)
            {
                arr[j] = arr[j - gap];
            }
            arr[j] = temp;
        }
    }
    return 0;
}

void print(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }
}

int main(int argc, char const *argv[])
{
    int arr[] = {9, 8, 7, 6, 5, 4, -1, -7, 12};
    int n = sizeof(arr) / sizeof(arr[0]);
    shellSort(arr, n);
    print(arr, n);
    return 0;
}
