#include<bits/stdc++.h>
#include<cstdlib>
#define c(x) cout<<x<<endl;
#define cn(x) cout<<x;
#define l(c) cin>>t;
using namespace std;
int square(int n){
    if(n==0){
        return 0;
    }
    if(n<0){
        n=-n;
    }
    int x=n>>1;
    if((n&1)>0){
        return ((square(x)<<2)+(x<<2)+1);
    }else{
        return (square(x)<<2);
    }
}
int main() {
    for(int i=0;i<10;i++){
        c(square(i));
    }
}
