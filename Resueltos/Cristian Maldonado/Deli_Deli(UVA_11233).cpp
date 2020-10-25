#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

vector <string> irregulares;
vector <string> plural;
vector <string> :: iterator it;

bool noVocales(char a){
    switch(a){
    case 'a':
        return false;
        break;
    case 'e':
        return false;
        break;
    case 'i':
        return false;
        break;
    case 'o':
        return false;
        break;
    case 'u':
        return false;
        break;

    }
    return true;
}

void verificar(string entrada){
    int fin = entrada.length() - 1;
    if(entrada[fin] == 'y' && noVocales(entrada[fin - 1])){
        entrada = entrada.substr(0, fin);
        cout<<entrada+"ies"<<endl;
        return;
    }
    if(entrada[fin] == 'o'){
        cout<<entrada+"es"<<endl;
        return;
    }else if(entrada[fin] == 's'){
        cout<<entrada+"es"<<endl;
        return;
    }else if(entrada[fin] == 'h' && entrada[fin - 1] == 'c'){
        cout<<entrada+"es"<<endl;
        return;
    }else if(entrada[fin] == 'h' && entrada[fin - 1] == 's'){
        cout<<entrada+"es"<<endl;
        return;
    }else if(entrada[fin] == 'x'){
        cout<<entrada+"es"<<endl;
        return;
    }else{
        cout<<entrada+"s"<<endl;
        return;
    }
}

int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
    int cantidad, consulta; cin>>cantidad>>consulta;
    for(int i = 0; i < cantidad; i++){
        string a, b; cin>>a>>b;
        irregulares.emplace_back(a);
        plural.emplace_back(b);
    }
    for(int i = 0; i < consulta; i++){
        string entrada; cin>>entrada;
        it = find(irregulares.begin(), irregulares.end(), entrada);
        int pos = it - irregulares.begin();
        if(pos == irregulares.size()){
            it = find(plural.begin(), plural.end(), entrada);
            int pos1 = it - plural.begin();
            if(pos1 != plural.size()){
                cout<<plural[pos1]<<endl;
            }else{
                verificar(entrada);
            }
        }else{
            cout<<plural[pos]<<endl;
        }
    }
    return 0;
}
