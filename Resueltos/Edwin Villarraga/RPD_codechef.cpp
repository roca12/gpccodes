#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;
typedef long long int ll;
int main(int argc, char** argv) {
	ll n,total=0;
	vector<ll>vec;
	scanf("%lld",&n);
	for(int i=0;i<n;++i){
		ll k;
		scanf("%lld",&k);
		ll arr[k];
		for(int j=0;j<k;++j){
			cin>>arr[j];
		}
		for(int j=0;j<k;j++){
			for(int q=j+1;q<k;++q){
				total=arr[j]*arr[q];
				stringstream str1;
    			str1 << total;
  				string num = str1.str();
  				ll op=0;
  				for(int aux=0;aux<num.size();aux++){
  					op+=num[aux]-'0';
				  	}
				vec.push_back(op);
				}
			}
		sort(vec.begin(),vec.end());
		printf("%lld\n",vec.back());
		vec.clear();
		total=0;
	}
	return 0;
}
