#include<bits/stdc++.h> 
#include<cstdlib>
using namespace std;

int circle(int x1, int y1, int x2,
        int y2, int r1, int r2) {
    int distSq = (x1 - x2) * (x1 - x2)
            + (y1 - y2) * (y1 - y2);
    int radSumSq = (r1 + r2) * (r1 + r2);
    if (distSq == radSumSq) {
        return 1;
    } else if (distSq > radSumSq) {
        return -1;
    } else {
        return 0;
    }
}

int main() {
    int x1 = -10, y1 = 8;
    int x2 = 14, y2 = -24;
    int r1 = 30, r2 = 10;
    int t = circle(x1, y1, x2,
            y2, r1, r2);
    if (t == 1) {
        cout << "Circle touch to each other." << endl;
    } else if (t < 0) {
        cout << "Circle not touch to each other." << endl;
    } else {
        cout << "Circle intersect to each other." << endl;
    }
}
