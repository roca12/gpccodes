#include <bits/stdc++.h> 
#include <cstdlib>
using namespace std;
const int MAX = 1000;
int BITree[MAX];

int getSum(int index) {
    int sum = 0;
    index = index + 1;
    while (index > 0) {
        sum += BITree[index];
        index -= index & (-index);
    }
    return sum;
}

void updateBIT(int n, int index, int val) {
    index = index + 1;
    while (index <= n) {
        BITree[index] += val;
        index += index & (-index);
    }
}

void constructBITree(int arr[], int n) {
    for (int i = 1; i <= n; i++) {
        BITree[i] = 0;
    }
    for (int i = 0; i < n; i++) {
        updateBIT(n, i, arr[i]);
    }
}

int main() {
    int freq[] = {2, 1, 1, 3, 2, 3, 4, 5, 6, 7, 8, 9};
    int n = sizeof (freq) / sizeof (freq[0]);
    constructBITree(freq, n);
    cout << "Sum of elements in arr[0..5] is " << getSum(5) << endl;
    freq[3] += 6;
    updateBIT(n, 3, 6);
    cout << "Sum of elements in arr[0..5] after update is " << getSum(5) 
            << endl;
}
