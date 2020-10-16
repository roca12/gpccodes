

#include <bits/stdc++.h> 
using namespace std;

bool is_geometric(int arr[], int n) {
    if (n == 1)
        return true;

    int ratio = arr[1] / (arr[0]);

    for (int i = 1; i < n; i++) {
        if ((arr[i] / (arr[i - 1])) != ratio) {
            return false;
        }
    }
    return true;
}

int main() {
    int arr[] = {2, 6, 18, 54};
    int n = sizeof (arr) / sizeof (arr[0]);

    (is_geometric(arr, n)) ? (cout << "True" << endl) : (cout << "False" << endl);

    return 0;
} 