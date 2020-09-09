#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
typedef long long int ll;
ll minPerimetro(int n){
    int l= (int) std::sqrt(n);
    int sq= l*l;
    if(sq==n){
        return l*4;
    }else{
        ll row=n/l;
        ll perimeter = 2*(l+row);
        if(n%l!=0){
            perimeter+=2;
        }
        return perimeter;
    }
}
int main() {
    int n=10;
    cout<<minPerimetro(n)<<endl;
}

