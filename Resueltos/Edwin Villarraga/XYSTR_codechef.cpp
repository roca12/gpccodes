#include<bits/stdc++.h>
#include<cstdlib>
//---------------//
using namespace std;
void solve(){
    string a;
    int cont=0;
    getline(std::cin,a);
    char ax[a.size()];
    for(int i=0;i<a.size()-1;i++){
        if(a[i]!=a[i+1]){
            cont++;
            i++;
        }
    }
    cout<<cont<<endl;
}
int main() {
    int a;
    cin>>a;
    cin.ignore();
    while(a--){
        solve();
    }
}
