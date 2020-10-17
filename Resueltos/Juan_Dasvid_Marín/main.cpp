#include<iostream>
using namespace std;
int main(){
    int I,A,B;
    for(
        cin>>I;I--;
        cout<<(B?(B>0?2-(B&1):1+(-B&1)):0)<<endl
        )
        cin>>A>>B, B-=A;
}

// Iteración ternaria dentro de for 
// Si a=b entonces la respuesta es 0. De lo contrario, si a>b y a−b es par o a<b y b−a es impar