#include <iostream>
#include <math.h>
//----------//
#define Euler 2.71828182845904523536
#define PI 3.141592654

using namespace std;

typedef long long int lli;

lli findDigits(lli n){
    if(n < 0){
        return 0;
    }
    if(n <= 1){
        return 1;
    }
    double x = (n * log10(n / Euler) + log10(2 * PI * n) / 2.0);
    return (lli)(floor(x) + 1);
}

int main()
{
    ios_base::sync_with_stdio(false); cout.tie(NULL);
    cout<<findDigits(1)<<endl;
    cout<<findDigits(50000000)<<endl;
    cout<<findDigits(1000000000)<<endl;
    cout<<findDigits(120)<<endl;
    return 0;
}
