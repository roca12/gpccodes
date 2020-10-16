#include <iostream>
#include <iomanip>

using namespace std;

typedef long double ld;

ld arcLength(ld diametro, ld angulo){
    ld pi = 22.0/7.0;
    ld arc;
    if(angulo >= 360){
        cout<<"Angulo no puede ser formado"<<endl;
        return 0;
    }else{
        arc = (pi * diametro) * (angulo / 360.0);
        return arc;
    }
}

int main()
{
    //Inicialmente manejado en grados
    ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
    cout.precision(22);
    ld diametro, angulo; cin>>diametro>>angulo;
    cout<<arcLength(diametro, angulo);
}
