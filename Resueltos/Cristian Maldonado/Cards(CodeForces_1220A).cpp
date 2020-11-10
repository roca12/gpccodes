#include <iostream>
#include <algorithm>

using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
    long tam;cin>>tam;
    string entrada; cin>>entrada;
    int z = count(entrada.begin(), entrada.end(), 'z');
    int o = count(entrada.begin(), entrada.end(), 'o')-z;
    for(int i = 0; i < o; i++){
        cout<<1<<" ";
    }
    for(int i = 0; i < z; i++){
        if(i == z - 1){
            cout<<0<<endl;
            break;
        }
        cout<<0<<" ";
    }
    return 0;
}
