#include <iostream>
#include <vector>

using namespace std;

typedef long long int lli;

const lli MAX_SIZE = 102400;

vector<lli> isPrime(MAX_SIZE, true);
vector<lli> prime;
vector<lli> SPF(MAX_SIZE);
vector<lli> hexaPrime;

void manipuledSieve(int N){
    isPrime[0] = isPrime[1] = false;
    for(lli i = 2; i < N; i++){
        if(isPrime[i]){
            prime.emplace_back(i);
            SPF[i] = i;
        }
        for(lli j = 0; j < (lli)prime.size() && i * prime[j] < N && prime[j] <= SPF[i]; j++){
            isPrime[i*prime[j]] = false;
            SPF[i*prime[j]] = prime[j];
        }
    }
}

int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
    lli N; cin>>N;
    manipuledSieve(N);
    for(lli i = 0; i < (lli)prime.size() && prime[i] <= N; i++){
        cout<<prime[i]<<" ";
    }
    cout<<endl;
    return 0;
}
