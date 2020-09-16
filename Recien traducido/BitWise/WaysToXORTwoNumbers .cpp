#include <bits/stdc++.h> 
using namespace std;


int countWays(string s1, string s2) {
    int c1 = 0, c0 = 0;
    int n = s1.length();
    for (int i = 0; i < n; i++) {
        if (s1[i] == '1')
            c1++;
        else
            c0++;
    }
    int used1 = 0, used0 = 0;
    int ways = 0;

    for (int i = 0; i < n; i++) {
        if (s1[i] == '0' and s2[i] == '0') {
            ways += c1;
            ways -= used1;
            used0++;
        }
        else if (s1[i] == '1' and s2[i] == '0') {
            ways += c0;
            ways -= used0;
            used1++;
        }
    }
    return ways;
}

int main() {
    string s1 = "01011";
    string s2 = "11001";

    cout << countWays(s1, s2);
    return 0;
}
