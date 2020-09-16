#include<bits/stdc++.h>
#include<cstdlib>
//---------------//
using namespace std;
int GCD(int a,int b){
    if(a==0){
        return b;
    }
    return GCD(b%a,a);
}
void productReduce(int n,int num[],int den[]){
    int new_num=1,new_den=1;
    for(int i=0;i<n;i++){
        new_num*=num[i];
        new_den*=den[i];
    }
    int gcd = GCD(new_num,new_den);
    new_num/=gcd;
    new_den/=gcd;
    cout<<new_num<<"/"<<new_den<<endl;
}
int main() {
    int n=3;
    int num[]={1,2,5};
    int den[]={2,1,6};
    productReduce(n,num,den);
}
