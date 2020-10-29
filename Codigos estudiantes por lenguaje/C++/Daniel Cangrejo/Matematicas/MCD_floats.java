#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
double gcd(double a,double b){
    if(a<b){
        return gcd(b,a);
    }
    if(abs(b)<0.001){
        return a;
    }
    return (gcd(b,a-floor(a/b)*b));
}

int main() {
    double a=1.20;
    double b=22.5;
    printf("%.8f\n",gcd(a,b));
    return 0;
}
