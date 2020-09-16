#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
const double PI =3.14159265358979323846;
const double E =2.71828182845904523536;
long FindDigitsKame(int n){
    if(n<0){
        return 0;
    }
    if(n<=1){
        return 1;
    }
    double x=(n*log10(n/E))+std::log10(2*PI * n)/2.0;
    return (long)(std::floor(x))+1;
}
int main() {
    cout<<FindDigitsKame(1000000)<<endl;
}
