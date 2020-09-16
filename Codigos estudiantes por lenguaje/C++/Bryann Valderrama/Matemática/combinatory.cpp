#include <cstdlib>
#include <bits/stdc++.h>
using namespace std;

void combinationUtil(int arr[], int data[], int start, int end, int index, int r)
{
    if (index == r)
    {
        for (int j = 0; j < r; j++)
        {
            cout << data[j] << " ";
        }
        cout << endl;
        return;
    }
    for (int i = start; i <= end && end - i + 1 >= r - index; i++)
    {
        data[index] = arr[i];
        combinationUtil(arr, data, i + 1, end, index + 1, r);
    }
}

void combination(int arr[], int n, int r)
{
    int data[r];
    combinationUtil(arr, data, 0, n - 1, 0, r);
}

void combinationRepetitionUtil(int chosen[], int arr[], int index, int r, int start, int end)
{
    if (index == r)
    {
        for (int i = 0; i < r; i++)
        {
            cout << arr[chosen[i]] << " ";
        }
        cout << endl;
        return;
    }
    for (int i = start; i < end; i++)
    {
        chosen[index] = i;
        combinationRepetitionUtil(chosen, arr, index + 1, r, i, end);
    }
    return;
}

void combinationRepetition(int arr[], int n, int r)
{
    int chosen[r + 1];
    combinationRepetitionUtil(chosen, arr, 0, r, 0, n - 1);
}

int main(int argc, char const *argv[])
{
    cout << "Sin Repeticion" << endl;
    int arr[] = {1, 2, 3, 4, 5};
    int r = 3;
    int n = sizeof(arr) / sizeof(arr[0]);
    combination(arr, n, r);
    cout << "Con Repeticion" << endl;
    int arr2[] = {1, 2, 3, 4};
    int n2 = sizeof(arr2) / sizeof(arr2[0]);
    int r2 = 2;
    combinationRepetition(arr2, n2, r2);
    return 0;
}
