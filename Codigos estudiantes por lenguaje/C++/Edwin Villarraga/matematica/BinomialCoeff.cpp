#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
int BinomialCoeff(int n,int k){
 if (k == 0 || k == n) {
        return 1;
    }
    return BinomialCoeff(n - 1, k - 1)+ BinomialCoeff(n - 1, k);
}
int main(){
    int n=5,k=2;
    printf("valor de C(%d, %d) is %d",n,k,BinomialCoeff(n,k));
}
