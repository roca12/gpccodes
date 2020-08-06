
// CPP program to find maximum number 
// of customers that can be satisfied 
#include <bits/stdc++.h> 
using namespace std;

vector<pair<long long, int> > v;

// print maximum number of satisfied 
// customers and their indexes 

void solve(int n, int d, int a, int b,
        int arr[][2]) {
    // Creating an vector of pair of 
    // total demand and customer number 
    for (int i = 0; i < n; i++) {
        int m = arr[i][0], t = arr[i][1];
        v.push_back(make_pair((a * m + b * t),
                i + 1));
    }

    // Sorting the customers according 
    // to their total demand 
    sort(v.begin(), v.end());

    vector<int> ans;

    // Taking the first k customers that 
    // can be satisfied by total amount d 
    for (int i = 0; i < n; i++) {
        if (v[i].first <= d) {
            ans.push_back(v[i].second);
            d -= v[i].first;
        }
    }

    cout << ans.size() << endl;
    for (int i = 0; i < ans.size(); i++)
        cout << ans[i] << " ";
}

// Driver program 

int main() {
    // Initializing variables 
    int n = 5;
    long d = 5;
    int a = 1, b = 1;
    int arr[][2] = {
        {2, 0},
        {3, 2},
        {4, 4},
        {10, 0},
        {0, 1}};

    solve(n, d, a, b, arr);
    return 0;
}
