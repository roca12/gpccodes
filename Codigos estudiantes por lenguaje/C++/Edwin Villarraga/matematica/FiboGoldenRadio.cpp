#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
const double phi=1.6180339;
int f[]={0,1,1,2,3,5};
int fib(int n){
    if(n<6){
        return f[n];
    }
    int t=5;
    int fn =5;
    while (t<n){
        fn=(int)round(fn*phi);
        t++;
    }
    return fn;
}
int main() {
    for(int i=0;i<10;i++){
        cout<<fib(i)<<endl;
    }
}
