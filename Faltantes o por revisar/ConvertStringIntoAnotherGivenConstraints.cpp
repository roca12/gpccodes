
#include <bits/stdc++.h> 
using namespace std;

bool isItPossible(string str1, string str2, int m, int n) {
    if (m != n)
        return false;
    if (count(str1.begin(), str1.end(), 'A') !=
            count(str2.begin(), str2.end(), 'A') ||
            count(str1.begin(), str1.end(), 'B') !=
            count(str2.begin(), str2.end(), 'B'))
        return false;
    for (int i = 0; i < m; i++) {
        if (str1[i] != '#') {
            for (int j = 0; j < n; j++) {
                if ((str2[j] != str1[i]) && str2[j] != '#')
                    return false;
                if (str2[j] == str1[i]) {
                    str2[j] = '#';
                    if (str1[i] == 'A' && i < j)
                        return false; 
                    if (str1[i] == 'B' && i > j)
                        return false;
                    break;
                }
            }
        }
    }
    return true;
}


int main() {
    string str1 = "A#B#";
    string str2 = "A##B";
    int m = str1.length();
    int n = str2.length();
    isItPossible(str1, str2, m, n) ? cout << "Yes\n" : cout << "No\n";
    return 0;
}
