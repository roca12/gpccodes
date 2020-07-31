#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
int gcd(int a,int b){
    if(a==0){
        return b;
    }
    return gcd(b%a,a);
}
int phi(int n){
    int result=1;
    for(int i=2;i<n;i++ ){
        if(gcd(i,n)==1){
            result++;
        }
    }
    return result;
}
int main() {
    for(int i=1;i<=10;i++){
        printf("el phi (%d) = %d\n",i,phi(i));
    }
}
