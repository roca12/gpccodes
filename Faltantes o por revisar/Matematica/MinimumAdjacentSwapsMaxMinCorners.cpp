#include <bits/stdc++.h> 
using namespace std;

void minimumSwaps(int a[], int n) {
    int maxx = -1, minn = a[0], l = 0, r = 0;
    for (int i = 0; i < n; i++) {
        if (a[i] > maxx) {
            maxx = a[i];
            l = i;
        }
        if (a[i] <= minn) {
            minn = a[i];
            r = i;
        }
    }
    if (r < l) {
        cout << (l + (n - r - 2)) << endl;
    } else {
        cout << (l + (n - r - 1)) << endl;
    }
}

int main() {
    int a[] = {5, 6, 1, 3};
    int n = sizeof(a)/sizeof(a[0]);
    minimumSwaps(a, n);
}
