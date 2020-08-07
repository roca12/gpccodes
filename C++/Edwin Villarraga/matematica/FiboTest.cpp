#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
bool isPerfectSquare(int x){
    int s=(int)sqrt(x);
    return (s*s ==x);
}
bool isFibonacci(int n){
    return isPerfectSquare(5 * n * n + 4)||isPerfectSquare(5 * n * n - 4);
}
int main() {
    for(int i=0;i<10;i++){
        isFibonacci(i)?cout<<i<<"Es Binonacci"<<endl:cout<<i<<"No es fibonacci"<<endl;
    }
}
