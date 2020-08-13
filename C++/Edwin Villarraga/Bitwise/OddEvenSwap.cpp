#include<bits/stdc++.h>
#include<cstdlib>
//---------------//
using namespace std;
int swapBits(int x){
    int even_bits=x & 0xAAAAAAAA;
    int oddbits=x & 0x55555555;
    even_bits>>=1;
    oddbits<<=1;
    return (even_bits|oddbits);
}
string toBinary(int n){
    string r;
    while(n!=0) {r=(n%2==0 ?"0":"1")+r; n/=2;}
    return r;
}
int main(){
   int x=7;
   cout<<x<<"->"<<toBinary(x)<<endl;
   int y=swapBits(x);
   cout<<swapBits(x)<<"->"<<toBinary(y)<<endl;

}

