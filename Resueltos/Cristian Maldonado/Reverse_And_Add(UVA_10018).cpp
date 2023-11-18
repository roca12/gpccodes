#include <iostream>
#include <algorithm>

using namespace std;

typedef long long int lli;

int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
    lli casos; cin>>casos;
    for(int i = 0; i < casos; i++){
        lli iterador = 0;
        lli numero; cin>>numero;
        while(true){
            string reverso = std::to_string(numero);
            reverse(reverso.begin(), reverso.end());
            numero += stoll(reverso, nullptr, 10);
            string againReverse = std::to_string(numero);
            string normal = againReverse;
            reverse(againReverse.begin(), againReverse.end());
            iterador++;
            if(normal == againReverse){
                cout<<iterador<<" "<<againReverse<<endl;
                break;
            }
        }
    }
    return 0;
}
