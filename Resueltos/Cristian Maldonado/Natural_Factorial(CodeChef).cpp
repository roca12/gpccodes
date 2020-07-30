#include <iostream>

using namespace std;

typedef long long ll;

int multiply(ll x, ll res[], ll res_size){
    ll carry = 0;
    for(ll i = 0; i < res_size; i++){
        ll prod = res[i] * x + carry;
        res[i] = prod % 10;
        carry = prod / 10;
    }
    while(carry != 0){
        res[res_size] = carry % 10;
        carry /= 10;
        res_size++;
    }
    return res_size;
}

void factorial(ll n)
{
    ll res[100000];
    res[0] = 1;
    ll res_size = 1;
    for(ll i = 2; i <= n; i++){
        res_size = multiply(i, res, res_size);
    }
    for(ll i = res_size - 1; i >= 0; i--){
        cout<<res[i];
    }
    cout<<endl;
}

int main()
{
    ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);
    ll casos; cin>>casos;
    for(ll i = 0; i < casos; i++){
        ll entrada;cin>>entrada;
        factorial(entrada);
    }
    return 0;
}
