#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
double exp(int n,double x){
    double sum=1;
    for(int i=n-1;i>0;i--){
        sum= 1 + x * sum / i;
    }
    return sum;
}
int main() {
    int n=10;
    double x=2;
    printf("exp %.15f\n",exp(n,x));
    printf("exp %.15f\n",exp(n+10,x));
}
