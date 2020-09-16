#include <bits/stdc++.h>
using namespace std;

long long polynomialRollingHash(string const& str) {
    int p = 31;
    int m = 1e9 + 9;
    long long power_of_p = 1;
    long long hash_val = 0;
    for (int i = 0; i < str.length(); i++) {
        hash_val
                = (hash_val
                + (str[i] - 'a' + 1) * power_of_p)
                % m;
        power_of_p
                = (power_of_p * p) % m;
    }
    return hash_val;
}



int main() {
    string str1 = "geeksforgeeks";
    string str2 = "geeks";

    cout << "Hash of '" << str1 << "' = "
            << polynomialRollingHash(str1);
    cout << endl;
}
