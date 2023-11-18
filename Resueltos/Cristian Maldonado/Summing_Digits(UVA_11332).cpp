#include <iostream>

using namespace std;

typedef long long int lli;

lli digital_root(lli Z) {
    return --Z % 9 + 1;
}

int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
    while(!cin.eof()){
        lli entrada; cin>>entrada;
        if(entrada == 0){
            break;
        }
        cout<<digital_root(entrada)<<endl;
    }
}
