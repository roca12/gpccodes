#include <iostream>
#include <vector>
#include <string.h>
#define MAX_SIZE 1000001

using namespace std;

typedef long long int lli;

vector <bool> isPrime(MAX_SIZE);
vector <lli> prime;
vector <lli> SPF(MAX_SIZE);



void manipuledSieve(lli N){
    isPrime[0] = isPrime[1] = false;
    for(lli i = 2; i < N; i++){
        if(isPrime[i]){
            prime.push_back(i);
            SPF[i] = i;
        }
        for(lli j = 0; j < prime.size() && i * prime[j] < N && prime[j] <= SPF[i]; j++){
            isPrime[i * prime[j]] = false;
            SPF[i * prime[j]] = prime[j];
        }
    }
}

int main()
{
    lli N = 11;
    for(lli i = 0; i <= MAX_SIZE; i++){
        isPrime[i] = true;
        SPF [i] = 2;
    }
    manipuledSieve(N + 1);
    cout << "Numeros primos desde 2 hasta "<<N <<":"<< endl;
    for(lli i = 0; i < prime.size(); i++){
        cout << prime[i] << " ";
    }
    cout<< "\nFactor primo mas pequenio de cada numero:"<<endl;
    for(lli i = 2; i <= N; i++){
        cout << i << ": "<<SPF[i] << endl;
    }
    return 0;
}
