#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
    double a, b;
    char ope;
    string entrada, operador;
    while(getline(cin, entrada)){
        cout<<entrada<<endl;
        sscanf(entrada.c_str(), "%lf %c %lf", &a, &ope, &b);
        if(a > INT_MAX)cout<<"first number too big"<<endl;
        if(b > INT_MAX)cout<<"second number too big"<<endl;
        if(ope == '+' && (a+b) > INT_MAX){
            cout<<"result too big"<<endl;
        }
        if(ope == '*' && (a*b) > INT_MAX){
            cout<<"result too big"<<endl;
        }
    }
    return 0;
}
