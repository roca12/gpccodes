#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
typedef long long int ll;
ll factorial(ll n){
    if(n==0){
        return 1;
    }
    return n*(factorial(n-1));
}
int main() {
    cout<<factorial(10)<<endl;
}
