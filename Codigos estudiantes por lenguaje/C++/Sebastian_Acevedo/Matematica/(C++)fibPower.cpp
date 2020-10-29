//Solo soporta hasta 93

#include <iostream>

using namespace std;

typedef unsigned long long int lli;

void multiply(lli F[2][2], lli M[2][2]){
    lli x = F[0][0] * M[0][0] + F[0][1] * M[1][0];
    lli y = F[0][0] * M[0][1] + F[0][1] * M[1][1];
    lli z = F[1][0] * M[0][0] + F[1][1] * M[1][0];
    lli w = F[1][0] * M[0][1] + F[1][1] * M[1][1];
    F[0][0] = x;
    F[0][1] = y;
    F[1][0] = z;
    F[1][1] = w;
}

void power(lli F[2][2], lli n){
    if(n == 0 || n == 1){
        return;
    }
    lli M[2][2] = {{1, 1},{1, 0}};
    power(F, n>>1);
    multiply(F, F);
    if(n % 2 != 0){
        multiply(F, M);
    }
}

lli fib(int N){
    lli F[2][2] = {{1, 1},{1, 0}};
    if(N == 0){
        return 0;
    }
    power(F, N - 1);
    return F[0][0];
}

lli fibLastDigit(lli N){
    return fib(N)%10;
}

int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
    lli n; cin>>n;
    cout<<fibLastDigit(n)<<endl;
}
