#include <cstdlib>
#include <bits/stdc++.h> 
using namespace std;

static int requiredNumbers = 5;
static int lowerBound = 0;
static int upperBound = 1000;

void randomNumbers() {
    for (int i = 0; i < requiredNumbers; i++) {
        int a = (rand())% upperBound;
        cout << a<<" ";
    }
}

int main() {
    randomNumbers();
}

