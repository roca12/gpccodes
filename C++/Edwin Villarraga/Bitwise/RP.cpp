#include<bits/stdc++.h>
#include<cstdlib>
//---------------//
using namespace std;
int RP(int a,int b){
    int res=0;
    while(b>0){
        if((b&1)!=0){
            res+=a;
        }
        a <<=1;
        b >>=1;
    }
    return res;
}
int main(){
    cout<<(RP(2,18))<<endl;
}

