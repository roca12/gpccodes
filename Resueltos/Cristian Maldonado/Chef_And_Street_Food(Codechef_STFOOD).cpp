#include <iostream>

using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
    int casos; cin>>casos;
    while(casos--){
        int MAX = 0;
        int tipos_Comida; cin>>tipos_Comida;
        for(int i = 0; i < tipos_Comida; i++){
            int tiendas, personas, precio; cin>>tiendas>>personas>>precio;
            if((tiendas+1)>personas){
                continue;
            }
            int result = (personas/(tiendas + 1))*precio;
            if(result > MAX){
                MAX = result;
            }
        }
        cout<<MAX<<endl;
    }
    return 0;
}
