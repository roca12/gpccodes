#include<bits/stdc++.h>
#include<cstdlib>
//---------------//
using namespace std;
typedef long long int ll;
ll makeEqualLength(string &str1, string &str2) {
    ll len1 = str1.size();
    ll len2 = str2.size();
    if (len1 < len2) {
        for (ll i = 0 ; i < len2 - len1 ; i++)
            str1 = '0' + str1;
        return len2;
    }
    else if (len1 > len2) {
        for (ll i = 0 ; i < len1 - len2 ; i++)
            str2 = '0' + str2;
    }
    return len1;
}
string addBitStrings( string first, string second ) {
    string result;
    ll length = makeEqualLength(first, second);
    ll carry = 0;
    for (ll i = length-1 ; i >= 0 ; i--) {
        ll firstBit = first.at(i) - '0';
        ll secondBit = second.at(i) - '0';
        ll sum = (firstBit ^ secondBit ^ carry)+'0';
        result = (char)sum + result;
        carry = (firstBit&secondBit) | (secondBit&carry) | (firstBit&carry);
    }
    if (carry){
        result = '1' + result;
    }
    return result;
}
ll multiplyiSingleBit(string a, string b) {
     return (a[0] - '0')*(b[0] - '0');
}
ll karatsuba(string X, string Y) {
    ll n = makeEqualLength(X, Y);
    if (n == 0) return 0;
    if (n == 1) return multiplyiSingleBit(X, Y);
    ll fh = n/2;
    ll sh = (n-fh);
    string Xl = X.substr(0, fh);
    string Xr = X.substr(fh, sh);
    string Yl = Y.substr(0, fh);
    string Yr = Y.substr(fh, sh);
    ll P1 = karatsuba(Xl, Yl);
    ll P2 = karatsuba(Xr, Yr);
    ll P3 = karatsuba(addBitStrings(Xl, Xr), addBitStrings(Yl, Yr));
    return P1*(1<<(2*sh)) + (P3 - P1 - P2)*(1<<sh) + P2;
}
string toBinary(ll n){
    string r;
    while(n!=0) {r=(n%2==0 ?"0":"1")+r; n/=2;}
    return r;
}
int main(){
    ll a;
    ll b;
    cin>>a;
    cin>>b;
    string x=toBinary(a);
    string y=toBinary(b);
    cout<<karatsuba(x,y)<<endl;
}

