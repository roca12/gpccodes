#include <cstdlib>
#include <bits/stdc++.h> 
using namespace std;

int RUN = 5;
int lowerBound = 0;
int upperBound = 1000;
int minSize = 10;
int maxSize = 20;

void randomArray() {
    for (int i = 0; i < RUN; i++) {
        int size = maxSize - (rand() % minSize);
        int array[size];
        cout << size << endl;
        for (int j = 0; j < size; j++) {
            int a = upperBound - (rand() % upperBound);
            cout << a << " ";
        }
        cout << endl;
    }
}

int main() {
    randomArray();
}

