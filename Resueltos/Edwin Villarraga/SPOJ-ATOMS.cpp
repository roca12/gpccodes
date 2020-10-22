#include<bits/stdc++.h>
#include<cstdlib>
typedef long long int ll;
using namespace std;
int main () {
	ll n;
	scanf("%lld",&n);
	ll a,b,c;
	while(n--){
		scanf("%lld %lld %lld",&a,&b,&c);
		ll cont=0;
		while(a<=c/b){
			a*=b;
			cont++;
		}
		printf("%lld\n",cont);
		cont=0;
	}
}
