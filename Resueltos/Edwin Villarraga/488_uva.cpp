#include<bits/stdc++.h>
#include <cstdlib>
using namespace std;
typedef long long int ll;
int main() {
    int t;cin>>t;
    string a3;
    cin.ignore();
    getline(cin,a3);
    for(int k=0;k<t;k++){
        if(k!=0){
            cout<<endl;
        }
        int a,b;
        cin>>a>>b;
        for(int e=0;e<b;e++){
            if(e!=0){
                    cout<<endl;
            }
            for(int i=1;i<=a;i++){
                for(int j=1;j<=i;j++){
                    cout<<i;
                }
                cout<<endl;
            }
                for(int i=a-1;i>=1;i--){
                    for(int j=1;j<=i;j++){
                        cout<<i;
                    }
                    cout<<endl;
                }
            }
        }
    return 0;
}
