#include <iostream>

using namespace std;

typedef unsigned long long int lli;

int main()
{
    ios_base::sync_with_stdio(false);cout.tie(NULL);cin.tie(NULL);
    lli casos; cin>>casos;
    while(casos--){
        lli entrada, contador = 0; cin>>entrada;
        string apoyo = to_string(entrada);
        for(lli i = 0; i < (lli)apoyo.size(); i++){
            if(apoyo[i]!= '0'){
                lli temp = apoyo[i]-'0';
                if(entrada % temp == 0){
                    contador++;
                }
            }else{
                continue;
            }
        }
        cout<<contador<<endl;
    }
    return 0;
}
