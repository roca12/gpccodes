#include <iostream>
#include <algorithm>

using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
    int casos; cin>>casos;
    while(casos--){
        int tam; cin>>tam;
        int arr[tam], aux[tam];
        int j = 1;
        for(int i = 0; i < tam; i++){
            cin>>arr[i];
            aux[i] = j;
            j++;
        }
        if(equal(arr, arr + tam, aux)){
            cout<<"no"<<endl;
            continue;
        }
        sort(arr, arr + tam);
        if(equal(arr, arr + tam, aux)){
            cout<<"yes"<<endl;
        }else{
            cout<<"no"<<endl;
        }
    }
    return 0;
}
