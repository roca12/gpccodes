#include <cstdlib>
#include <bits/stdc++.h> 
using namespace std;

int RUN = 5;
int lowerBound = 0;
int upperBound = 1000;
int maxColumn = 10;
int minColumn = 1;
int minRow = 1;
int maxRow = 10;

void randomMatrix() {
    for (int i = 0; i < RUN; i++) {
        int row = maxRow - (rand() % maxRow) - minRow;
        int column = maxColumn - (rand() % maxColumn) - minColumn;
        int matrix[row][column];
        cout << row << " " << column << endl;
        for (int j = 0; j < row; j++) {
            for (int k = 0; k < column; k++) {
                int a = upperBound - (rand() % upperBound);
                cout << a << " ";
            }
            cout << endl;
        }
        cout << endl;
    }
}

int main() {
    randomMatrix();
}

