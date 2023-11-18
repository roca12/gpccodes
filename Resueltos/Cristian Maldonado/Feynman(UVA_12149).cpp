#include <iostream>

using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
    int a;
    while((cin>>a)&& !cin.eof()){
        if(a == 0)break;
        cout<<((a*(a+1) * (2*a+1))/6)<<endl;
    }
    return 0;
}
