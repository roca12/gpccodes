#include <iostream>

using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
    int casos; cin>>casos;
    while(casos--){
        int x, r, k; cin>>x>>r>>k;
        if(x == r){
            cout<<1<<endl;
        }else{
            cout<<k<<endl;
        }
    }
    return 0;
}
