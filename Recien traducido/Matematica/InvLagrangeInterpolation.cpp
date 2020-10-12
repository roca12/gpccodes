#include <bits/stdc++.h> 
using namespace std;

struct Data {
    double x, y;
};

double inv_interpolate(Data d[], int n, double y) {
    double x = 0;
    int i, j;
    for (i = 0; i < n; i++) {
        double xi = d[i].x;
        for (j = 0; j < n; j++) {
            if (j != i) {
                xi = xi* (y - d[j].y)/ (d[i].y - d[j].y);
            }
        }
        x += xi;
    }

    return x;
}

int main() {
    Data d[] = {
        { 1.27, 2.3},
        { 2.25, 2.95},
        { 2.5, 3.5},
        { 3.6, 5.1}
    };

    int n = 4;
    double y = 4.5;
    cout << "Value of x at y = 4.5 : "
            << inv_interpolate(d, n, y);
    return 0;
} 