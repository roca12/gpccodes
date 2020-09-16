#include <iostream>

using namespace std;

void primeFactors(int n){
    for(int p = 2; p * p <= n; p++){
        while(n % p == 0){
            printf("%d\n",p);
            n /= p;
        }
    }
    if(n > 1){
        printf("%d\n", n);
    }
}

int main()
{
    int n;
    scanf("%i", &n);
    primeFactors(n);
    return 0;
}
