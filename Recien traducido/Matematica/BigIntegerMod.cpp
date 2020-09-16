#include <cstdlib>
#include <bits/stdc++.h>

using namespace std;

int mod(string n, int m) {
    int r = 0;
    for (int i = 0; i < n.size(); i++) {
        r = (r * 10 + (n.at(i) - '0')) % m;
    }
    return r;
}

int main() {
cout<<(mod("9564784542", 10))<<endl;
}