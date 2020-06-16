#include <bits/stdc++.h>
#include <cstdlib>
#define MAX 256
typedef long long int ll;
using namespace std;
int main(int argc, char** argv) {
	ll c,aux=1;
	scanf("%lld",&c);
	while(c--){
		ll jump;
		ll arriba=0,abajo=0;
		scanf("%lld",&jump);
		ll vec[jump];
		for(int i=0;i<jump;++i){
			cin>>vec[i];
		}
		for(int i=0;i<jump-1;++i){
			if(jump==1){
				continue;
			}else if(vec[i]==vec[i+1]){
				continue;
			}else if(vec[i]<vec[i+1]){
				arriba++;
			}else if(vec[i]>vec[i+1]){
				abajo++;
			}
		}
		printf("Case %lld: %lld %lld\n",aux,arriba,abajo);
		aux++;
	}
	return 0;
}
