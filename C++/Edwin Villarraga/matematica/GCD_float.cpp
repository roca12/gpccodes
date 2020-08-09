#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
double GCD(double a,double b){
    if(a<b){
        return GCD(b,a);
    }
    if(std::fabs(b) < 0.001){
        return a;
    }
    else{
        return (GCD(b,a-(std::floor(a/b)*b)));
    }
}
int main() {
    double a=1.20,b=22.5;
    printf("%.2f\n",(GCD(a,b)));
}
