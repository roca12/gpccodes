#include<bits/stdc++.h> 
using namespace std;
#define MAX 500 

int lookup[MAX][MAX];

struct Query {
    int L, R;
};


void preprocess(int arr[], int n) {
    for (int i = 0; i < n; i++)
        lookup[i][0] = i;

    for (int j = 1; (1 << j) <= n; j++) {
        for (int i = 0; (i + (1 << j) - 1) < n; i++) {
            if (arr[lookup[i][j - 1]] < arr[lookup[i + (1 << (j - 1))][j - 1]])
                lookup[i][j] = lookup[i][j - 1];
            else
                lookup[i][j] = lookup[i + (1 << (j - 1))][j - 1];
        }
    }
}


int query(int arr[], int L, int R) {
    int j = (int) log2(R - L + 1);
    if (arr[lookup[L][j]] <= arr[lookup[R - (1 << j) + 1][j]])
        return arr[lookup[L][j]];

    else return arr[lookup[R - (1 << j) + 1][j]];
}


void RMQ(int arr[], int n, Query q[], int m) {
    preprocess(arr, n);
    for (int i = 0; i < m; i++) {
        int L = q[i].L, R = q[i].R;
        cout << "Minimum of [" << L << ", "
                << R << "] is " << query(arr, L, R) << endl;
    }
}


int main() {
    int a[] = {7, 2, 3, 0, 5, 10, 3, 12, 18};
    int n = sizeof (a) / sizeof (a[0]);
    Query q[] = {
        {0, 4},
        {4, 7},
        {7, 8}};
    int m = sizeof (q) / sizeof (q[0]);
    RMQ(a, n, q, m);
    return 0;
}
