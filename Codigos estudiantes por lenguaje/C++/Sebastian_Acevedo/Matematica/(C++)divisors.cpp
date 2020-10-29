#include<bits/stdc++.h>
#include<cstdlib>
//---------------//
using namespace std;
int divisors(int x){
    int nDiv=1;
    for(int i=2;i*i<=x;i++){
        int cnt=0;
        while(x%i==0){
            ++cnt;
            x/=i;
        }
        nDiv*=cnt+1;
    }
    if(x>1){
        nDiv*=2;
    }
    return nDiv;
}
int main() {
    cout<<divisors(10);
}
