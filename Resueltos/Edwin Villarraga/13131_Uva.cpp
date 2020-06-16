#include <bits/stdc++.h>
#include <cstdlib>
#define MAX 256
typedef long long int ll;
using namespace std;
int main(int argc, char** argv) {
    ll a, b,cont=0;
    int n;
    scanf("%d",&n);
    for(int j=0;j<n;++j){
        scanf("%lld %lld",&a,&b);
        vector <ll> vec;
        for(int i = 1; i <= sqrt(a); i++){
            if(a % i == 0){
                vec.push_back(i);
                if(i == a/i){
                    continue;
                }
                int aux=a/i;
                vec.push_back(aux);
            }
        }
        for(int i=0;i<vec.size();++i){
        	if(vec[i]%b!=0){
        		cont+=vec[i];
			}
		}
        printf("%lld\n",cont);
        cont=0;
    }
}
