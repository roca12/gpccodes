#include<bits/stdc++.h>
#include<cstdlib>
//---------------//
using namespace std;
double hexArea(double s){
    return (3*sqrt(3)*(s*s))/2;
}
int main() {
    double s=6;
    printf("%.8f\n",hexArea(6));
}
