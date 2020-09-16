#include <iostream>
//------------------//
#define FAST ios_base::sync_with_stdio(false);cout.tie(NULL);

using namespace std;

typedef long long int lli;

lli square(lli n){
    if(n == 0){
        return 0;
    }
    if(n < 0){
        n = -n;
    }
    lli x = n >> 1;
    if((n & 1) > 0){
        return ((square(x)<<2) + (x<<2)+1);
    }else{
        return (square(x)<<2);
    }
}

int main()
{
    FAST
    for(lli i = -10 ; i <= 10; i++){
        lli a = i & 1;
        if(a > 0){
            cout<<"Impar"<<endl;
        }else{
            cout<<"Par"<<endl;
        }
        cout<<i<<" -> "<<square(i)<<endl;
        cout<<endl;
    }
    return 0;
}
