#include <iostream>
#include <vector>
using namespace std;

typedef long long int lli;

vector<lli> ayuda;

void primeFactors(lli n){
    for(lli p = 2; p * p <= n; p++){
        while(n % p == 0){
            ayuda.push_back(p);
            n /= p;
        }
    }
    if(n > 1){
        ayuda.push_back(n);
    }
}

int main()
{
    while(!cin.eof()){
        lli n;
        scanf("%lli", &n);
        if(n == 0){
            break;
        }
        if(n < 0){
          printf("%lli = -1 x ", n);
        }else{
            printf("%lli = ", n);
        }
        primeFactors(abs(n));
        for(lli i = 0; i < ayuda.size(); i++){
            if(i == ayuda.size()-1){
                printf("%lli\n",ayuda[i]);
            }else{
                printf("%lli x ",ayuda[i]);
            }
        }
        ayuda.clear();
    }
    return 0;
}

