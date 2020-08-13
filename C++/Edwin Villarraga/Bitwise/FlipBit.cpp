#include<bits/stdc++.h>
#include<cstdlib>
//---------------//
using namespace std;
int SIZE(){
    int sizeOfInteger=8;
    return sizeOfInteger;
}
int flipBit(int a){
    if(~a==0){
        return 8*SIZE();
    }
    int currentlen=0,prevlen=0,maxlen=0;
    while(a!=0){
        if((a&1)==1){
            currentlen++;
        }
        else if((a&1)==0){
            prevlen=(a&2==0)?0:currentlen;
            currentlen=0;
        }
        maxlen=std::max(prevlen+currentlen,maxlen);
        a>>=1;
    }
    return maxlen+1;
}
string toBinary(int n){
    string r;
    while(n!=0) {r=(n%2==0 ?"0":"1")+r; n/=2;}
    return r;
}
int main(){
    int a=654321;
    cout<<a<<"->"<<toBinary(a)<<" : "<<flipBit(a)<<endl;

}
