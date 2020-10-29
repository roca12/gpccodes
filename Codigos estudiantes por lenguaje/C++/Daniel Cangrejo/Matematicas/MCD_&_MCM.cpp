#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
int gcd(int a,int b){
    return (b==0?a:gcd(b,a%b));
}
int lcm(int a,int b){
    return (a*(b/gcd(a,b)));
}
int main() {
    int a=60;
    int b=70;
    cout<<"GCD : "<<(gcd(a,b))<<endl;
    cout<<"LCM : "<<(lcm(a,b))<<endl;
    cout<<"GCD Interno:"<<(__gcd(a,b))<<endl;
    return 0;
}
