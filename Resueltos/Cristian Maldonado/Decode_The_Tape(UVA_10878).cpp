#include <bits/stdc++.h>

using namespace std;

bool isO(char ch){
    return (ch == 'o');
}

bool zeros(char ch){
    return (ch == ' ');
}

bool linesOrPoint(char ch){
    return (ch == '|' || ch == '.');
}

int binaryToDecimal(string n)
{
    string num = n;
    int dec_value = 0;
    int base = 1;
    int len = num.length();
    for (int i = len - 1; i >= 0; i--) {
        if (num[i] == '1')
            dec_value += base;
        base = base * 2;
    }
    return dec_value;
}

void replaceTest(string entrada){
    replace_if(entrada.begin(),entrada.end(), zeros,'0');
    entrada.erase(remove_if(entrada.begin(), entrada.end(), linesOrPoint), entrada.end());
    replace_if(entrada.begin(),entrada.end(), isO ,'1');
    char value = binaryToDecimal(entrada);
    cout<<value;
}

int main()
{
    ios_base::sync_with_stdio(false);cout.tie(NULL);cin.tie(NULL);
    string entrada; getline(cin, entrada);
    string match = "___________";
    if(entrada == match){
        while(getline(cin, entrada) && entrada != match){
            replaceTest(entrada);
        }
    }
    return 0;
}
