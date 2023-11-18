#include <iostream>

using namespace std;

typedef long long int lli;

int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
    lli a;cin>>a;
    while(a!= 0){
		if(a == 1){
            cout<<1<<endl;
		}else{
            lli fibo1=1;
            lli fibo2=1;
            for(lli i=2;i<=a;i++){
                fibo2 = fibo1 + fibo2;
                fibo1 = fibo2 - fibo1;
            }
            cout<<fibo2<<endl;
        }
        cin>>a;
    }
    return 0;
}
