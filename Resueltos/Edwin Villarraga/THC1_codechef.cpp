#include <bits/stdc++.h>
using namespace std;
typedef long long int ll;
int main(){
    ios_base::sync_with_stdio(false);cin.tie(NULL);
    string t;cin>>t;
    for(int i=0;i<stoi(t);i++){
        string n;
        cin>>n;
        int a=n[n.size()-1]-'0';
        if(a%2==0 || a==0)
            if(n.size()>2){
                if(stoi(n.substr(n.size()-3,n.size()))%8==0){
                    cout<<"YES"<<endl;
                    continue;
                }
            }else{
                if(stoi(n)%8==0){
                    cout<<"YES"<<endl;
                    continue;
                }
            }

        cout<<"NO"<<endl;
    }
}
