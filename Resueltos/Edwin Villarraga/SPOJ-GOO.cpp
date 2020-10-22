#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
typedef long long int ll;
int main () {
	ll n, one;
	ll first,second;
	scanf("%lld",&n);
	while(n--){
		scanf("%lld",&one);
		first = pow(2,one-1);
		second = (first/2)*(one-1) + first;
		printf("%lld %lld\n",first,second);
	}
	return 0;
  }
