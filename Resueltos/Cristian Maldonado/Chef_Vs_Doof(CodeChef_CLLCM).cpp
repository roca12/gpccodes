#include <iostream>

using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
    int casos;cin>>casos;
    while(casos--){
        int tam; cin>>tam;
        int arr[tam];
        bool flag = false;
        for(int i = 0; i < tam; i++){
            cin>>arr[i];
            if((arr[i] & 1) == 0){
                flag = true;
            }
        }
        if(flag){
            cout<<"NO"<<endl;
        }else{
            cout<<"YES"<<endl;
        }
    }
}
