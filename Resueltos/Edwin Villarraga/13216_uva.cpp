#include <bits/stdc++.h>
#include <cstdlib>
typedef long long int ll;
using namespace std;

int ans[6] = {76,16,56,96,36};
int main(int argc, char** argv) {
	ll t;
	cin>>t;
	for(int m=0;m<t;m++){
		string n;
		cin>>n;
		int res = n[0] - '0';
		if(n.size()==1){
			if(res == 0) cout<<"1\n";
            else if(res == 1) cout<<"66\n";
            else cout<<ans[res%5]<<"\n";
			}else{
            res = n[n.size()-1] - '0';
            res %= 5;
            cout<<ans[res]<<"\n";
        }
		}
	return 0;
}
