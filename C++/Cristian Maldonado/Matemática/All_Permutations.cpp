#include <iostream>
#include <set>
#include <string.h>
#include <algorithm>

using namespace std;

int cont1 = 0;
int cont2 = 0;

void permWithOutRepetition(string str)
{
    char ayuda[str.size()];
    strcpy(ayuda, str.c_str());
    do{
        ++cont1;
        cout<<ayuda<<endl;
    }while(next_permutation(ayuda, ayuda + str.size()));
}

void permWithRepUtil(string str, char data [], int last, int index)
{
    int length = str.size();
    for(int i = 0; i < length; i++){
        data[index] = str[i];
        if(index == last){
            cont2++;
            string ayuda = data;
            cout<<ayuda<<endl;
        }else{
            permWithRepUtil(str, data, last, index + 1);
        }
    }
}

void permWithRep(string str)
{
    int length = str.size();
    char data[length + 1];
    char temp[length];
    strcpy(temp, str.c_str());
    sort(temp, temp+length);
    str = temp;
    permWithRepUtil(str, data, length - 1, 0);
}

int main()
{
    ios_base::sync_with_stdio(false); cout.tie(NULL);cin.tie(NULL);
    string entrada = "Terry";
    permWithOutRepetition(entrada);
    cout<<"Hay en total "<<cont1 <<" permutaciones sin repeticion de "<<entrada<<endl;
    cout<<"\n\n"<<endl;
    permWithRep(entrada);
    cout<<"Hay en total "<<cont2<<" permutaciones con repeticion de "<<entrada<<endl;
}
