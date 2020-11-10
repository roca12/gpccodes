#include <iostream>

using namespace std;

typedef long long int lli;

bool verify(lli a, lli b){
    return a > b ? true: false;
}

int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
    lli casos; cin>>casos;
    while(casos--){
        lli a, b; cin>>a>>b;
        if(a==b){
            cout<<0<<endl;
            continue;
        }
        if((a % 2 != 0 && b%2 != 0) && verify(a, b)){
            cout<<1<<endl;
            continue;
        }else if((a % 2 != 0 && b%2 != 0) && verify(a, b) == false){
            cout<<2<<endl;
            continue;
        }
        if((a % 2 == 0 && b%2 == 0) && verify(a, b)){
            cout<<1<<endl;
            continue;
        }else if((a % 2 == 0 && b%2 == 0) && verify(a, b) == false){
            cout<<2<<endl;
            continue;
        }
        if((a % 2 == 0 && b%2 != 0) && verify(a, b)){
            cout<<2<<endl;
            continue;
        }else if((a % 2 == 0 && b%2 != 0) && verify(a, b) == false){
            cout<<1<<endl;
            continue;
        }
        if((a % 2 != 0 && b%2 == 0) && verify(a, b)){
            cout<<2<<endl;
            continue;
        }else if((a % 2 != 0 && b%2 == 0) && verify(a, b) == false){
            cout<<1<<endl;
            continue;
        }
    }
    return 0;
}
