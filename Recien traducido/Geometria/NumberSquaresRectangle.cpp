#include<iostream> 
using namespace std;

int countSquares(int m, int n) {
    if (n < m)
        swap(m, n);
    return m * (m + 1) * (2 * m + 1) /
            6 + (n - m) * m * (m + 1) / 2;
}

int main() {
    int m = 4, n = 3;
    cout << "Count of squares is "
            << countSquares(m, n);
} 