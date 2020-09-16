#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
int FindDigits(int n){
    if(n<0){
        return 0;
    }
    if(n==1){
        return 1;
    }
    double digits=0;
    for(int i=2;i<=n;i++){
        digits+=(std::log10(i));
    }
    return (int)(std::floor(digits))+1;
}
int main() {
    cout<<FindDigits(1000)<<endl;
    cout<<FindDigits(5)<<endl;
    cout<<FindDigits(20)<<endl;
    cout<<FindDigits(100)<<endl;
}
