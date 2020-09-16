#include <cstdlib>
#include <bits/stdc++.h>
using namespace std;

int GCD(int a, int b)
{
    return b == 0 ? a : GCD(b, a % b);
}

int LCM(int a, int b)
{
    return a * (b / GCD(a, b));
}

int main(int argc, char const *argv[])
{
    int a = 8;
    int b = 53;
    cout << "GCD de a y b = " << GCD(a, b) << endl;
    cout << "LCM de a y b = " << LCM(a, b) << endl;
    return 0;
}
