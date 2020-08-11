#include<bits/stdc++.h>
#include<cstdlib>
//---------------//
using namespace std;
string cardinalNumber(int n){
    if(n%10==1 && n%100!=11){
        return "st";
    }if(n%10==2 && n%100!=12){
        return "nt";
    }if(n%10==3 && n%100!=13){
        return "st";
    }
    return "th";
}
int main(){
    for(int i=1;i<=10;i++){
        cout<<i<<" : "<<cardinalNumber(i)<<endl;
    }
}
