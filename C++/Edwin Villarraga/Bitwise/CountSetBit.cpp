#include<bits/stdc++.h>
#include<cstdlib>
//---------------//
using namespace std;
string toBinary(int n){
    string r;
    while(n!=0) {r=(n%2==0 ?"0":"1")+r; n/=2;}
    return r;
}
int countSetBitUtil(int x){
    if(x<=0){
        return 0;
    }
    return (x%2==0?0:1)+countSetBitUtil(x/2);
}
int countBitSetBits(int n){
    int bitCount=0;
    for(int i=1;i<=n;i++){
        cout<<i<<"->"<<toBinary(i)<<endl;
        bitCount+=countSetBitUtil(i);
    }
    return bitCount;
}
int main(){
    int n=4;
    cout<<countBitSetBits(n)<<endl;
}
