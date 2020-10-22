#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
typedef long long int ll;
int main() {
    int t;
    cin>>t;
    while(t--){
        string n;
        cin>>n;
        ll total=0;
        for(int i=0;i<n.size();i++){
            total+=(n[i]-'0');
        }
        cout<<total<<endl;
    }
}
