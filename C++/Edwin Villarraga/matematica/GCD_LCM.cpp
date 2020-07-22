#include<bits/stdc++.h>
#include<cstdlib>
//---------------//
using namespace std;
int GCD(int a,int b){
    return b==0?a:GCD(b,a%b);
}
int LCM(int a ,int b){
    return a*(b/GCD(a,b));
}

int main() {
    int a=8;
    int b=12;
    cout<<"GCD de a y b es: "<<GCD(a,b)<<endl;
    cout<<"LCM de a y b es: "<<LCM(a,b)<<endl;
}
