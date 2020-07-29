#include<bits/stdc++.h>
#include <cstdlib>
using namespace std;
typedef long long int ll;

int main() {
    ll cont=0;
    for(int k=0;;k++){
    string a;
    cin>>a;
    if(a=="0"){
        break;
    }
        ll len=a.size();
        for(int i=0;i<a.size();i++){
                if(a[i]==0){
                    continue;
                }
            cont+=((a[i]-'0')*(pow(2,len-i)-1));
        }
    cout<<cont<<endl;
    cont=0;
    }
    return 0;
}
