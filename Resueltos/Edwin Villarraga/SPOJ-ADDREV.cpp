#include<bits/stdc++.h>
#include<cstdlib>
//---------------//
using namespace std;
typedef long long int ll;
int main() {
    int t;
    cin>>t;
    while(t--){
        string a,b;
        cin>>a>>b;
        reverse(a.begin(),a.end());
        reverse(b.begin(),b.end());
        ll total=stoll(a)+stoll(b);
        string imp=to_string(total);
        reverse(imp.begin(),imp.end());
        total=stoll(imp);
        cout<<total<<endl;
    }
}
