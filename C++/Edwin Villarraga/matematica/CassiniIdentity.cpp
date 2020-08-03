#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
int cassini(int n){
    return (n&1)!=0? -1 : 1;
}
int main(){
    int n=5;
    printf("%d\n",cassini(n));
}
