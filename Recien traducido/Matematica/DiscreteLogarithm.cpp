#include<bits/stdc++.h> 
using namespace std;

int discreteLogarithm(int a, int b, int m) {
    int n = (int) sqrt(m) + 1;
    int an = 1;
    for (int i = 0; i < n; ++i)
        an = (an * a) % m;
    unordered_map<int, int> value;
    for (int i = 1, cur = an; i <= n; ++i) {
        if (!value[ cur ])
            value[ cur ] = i;
        cur = (cur * an) % m;
    }
    for (int i = 0, cur = b; i <= n; ++i) {
        if (value[cur]) {
            int ans = value[cur] * n - i;
            if (ans < m)
                return ans;
        }
        cur = (cur * a) % m;
    }
    return -1;
}

int main() {
    int a = 2, b = 3, m = 5;
    cout << discreteLogarithm(a, b, m) << endl;
    a = 3, b = 7, m = 11;
    cout << discreteLogarithm(a, b, m);
}
