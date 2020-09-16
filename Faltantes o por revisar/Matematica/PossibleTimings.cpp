#include "bits/stdc++.h" 
using namespace std;

int num[] = {2, 7, 2, 3, 3, 4, 2, 5, 1, 2};

void possibleTimings(string n) {
    cout << (num[(n.at(0) - '0')]
            * num[n.at(1) - '0']) << endl;
}

int main() {
    string n = "05";
    possibleTimings(n);
}
