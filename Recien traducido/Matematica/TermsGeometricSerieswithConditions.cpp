// CPP program to find number of terms   
// in Geometric Series 
#include <bits/stdc++.h> 
using namespace std;

map<int, bool> mapp;

void progression(int b1, int q, int l,int m, int bad[]) {

    for (int i = 0; i < m; i++)
        mapp[bad[i]] = 1;
    if (abs(b1) > l)
        cout << "0";

    else if (q == 0 || b1 == 0) {
        if (mapp[0] != 1)
            cout << "inf";
        else if (mapp[0] == 1 && mapp[b1] != 1)
            cout << "1";

        else
            cout << "0";
    } else if (q == 1) {

        if (mapp[b1] != 1)
            cout << "inf";
        else
            cout << "0";
    } else if (q == -1) {

        if (mapp[b1] != 1 || mapp[-1 * b1] != 1)
            cout << "inf";
        else
            cout << "0";
    } else {
        int co = 0;
        while (abs(b1) <= l) {
            if (mapp[b1] != 1)
                co++;
            b1 *= 1LL * q;
        }
        cout << co;
    }
}

int main() {
    int b1 = 3, q = 2, l = 30, m = 4;
    int bad[4] = {6, 14, 25, 48};
    progression(b1, q, l, m, bad);
    return 0;
} 