#include <bits/stdc++.h>
#include <cstdlib>
typedef long long int ll;
using namespace std;
int main(int argc, char** argv) {
	ll c;
	scanf("%lld",&c);
	while(c--){
		ll X,Y,N;
		scanf("%lld %lld %lld",&X,&Y,&N);
		for(int i=1;i<=N;++i){
			if(i%X==0 && i%Y==0){
				cout<<"FizzBuzz\n";
			}else if(i%X==0){
				cout<<"Fizz\n";
			}else if(i%Y==0){
				cout<<"Buzz\n";
			}else{
				cout<<i<<"\n";
			}
		}
	}
	return 0;
}
