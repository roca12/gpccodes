#include <bits/stdc++.h> 
using namespace std;

int printFilledDiagonal(int sq[][3]) {

    int sum = 0;
    for (int i = 0; i < 3; i++)
        for (int j = 0; j < 3; j++)
            sum += sq[i][j];

    sum /= 2;

    for (int i = 0; i < 3; i++) {
        int rowSum = 0;
        for (int j = 0; j < 3; j++)
            rowSum += sq[i][j];
        sq[i][i] = sum - rowSum;
    }

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++)
            cout << sq[i][j] << " ";
        cout << endl;
    }
}

int main() {
    int sq[3][3] = {
        { 0, 7, 6},
        { 9, 0, 1},
        { 4, 3, 0}
    };

    printFilledDiagonal(sq);
    return 0;
} 