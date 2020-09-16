#include <iostream>
#include <string.h>
#define MAX 101
using namespace std;

bool prime[MAX];

void sieveEratosthenes(int N){
    memset(prime, true, N + 1);
    prime[0] = prime[1] = false;
    for(int p = 2; p * p <= N; p++){
        if(prime[p]){
            for(int i = p * p; i <= N; i+=p){
                prime[i] = false;
            }
        }
    }
}

int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);
    int N;
    cin >> N;
    sieveEratosthenes(N);
    for(int i = 0; i <= N; i++){
        cout << i << ": "<<prime[i] << endl;
    }
    return 0;
}
