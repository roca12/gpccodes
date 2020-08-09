#include <cstdlib>
#include <bits/stdc++.h> 
using namespace std;

bool compareSeq(char S[], int x, int y, int n) {
    for (int i = 0; i < n; i++) {
        if (S[x] < S[y]) {
            return false;
        } else if (S[x] > S[y]) {
            return true;
        }
        x = (x + 1) % n;
        y = (y + 1) % n;
    }
    return true;
}

int smallestSequence(char S[], int n) {
    int index = 0;
    for (int i = 1; i < n; i++) {
        if (compareSeq(S, index, i, n)) {
            index = i;
        }
    }
    return index;
}

void printSmallestSequence(string str, int n) {
    char S[str.size() + 1];
    strcpy(S, str.c_str());
    int starting_index = smallestSequence(S, n);
    for (int i = 0; i < n; i++) {
        cout << S[(starting_index + i) % n];
    }
}

int main() {
    string S = "DCACBCAA";
    int n = 8;
    printSmallestSequence(S, n);
}
