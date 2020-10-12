#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
int main () {
	ll c;
	cin>>c;
	while(c--){
		ll n,k,x,y;
		cin>>n>>k>>x>>y;
		ll cont[n]={0},aux=0;
		while(1){
			if(cont[x]){
				aux=1;
				break;
			}
			cont[x]++;
			x=(x+k)%n;
			if(cont[y]){
				aux=2;
				break;
			}
		}
		if(k==0||k==n){
			if(x==y)
				cout<<"YES\n";
			else
				cout<<"NO\n";
		}
		else if(aux==2)
		   cout<<"YES\n";
		   
		else
			cout<<"NO\n";
		
	}
	return 0;
}
