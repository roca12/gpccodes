#include<bits/stdc++.h>
#include<cstdlib>
//---------------//
using namespace std;
string unit[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};
string ten[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
string hnd[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
int valor(char ch){
    switch(ch){
    case 'I':
        return 1;
    case 'V':
        return 5;
    case 'X':
        return 10;
    case 'L':
        return 50;
    case 'C':
        return 100;
    case 'D':
        return 500;
    case 'M':
        return 1000;
    }
    return 0;
}
string toRoman(int n){
    int a;
    string sb="";
    if(n>=1000){
        a = n/1000;
        for(int i=1;i<=a;i++){
            sb+="M";
        }
        n%=1000;
    }
    sb+=(hnd[n/100]);
    n%=100;
    sb+=(ten[n/10]);
    sb+=(unit[n%10]);
    return sb;
}
int toDecimal(string num){
    int sum=0;
    int last=0;
    int next;
    for(int i=num.size()-1;i>=0;i--){
        next=valor(num[i]);
        if(last<=next){
            sum+=next;
        }else{
            sum-=next;
        }
        last=next;
    }
    return sum;
}
int main(){
    cout<<toRoman(122)<<endl;
    cout<<toRoman(1)<<endl;
    cout<<toRoman(2323)<<endl;
    cout<<toRoman(343)<<endl;

    cout<<toDecimal("CXXII")<<endl;
    cout<<toDecimal("I")<<endl;
    cout<<toDecimal("MMCCCXXIII")<<endl;
    cout<<toDecimal("CCCXLIII")<<endl;
}
