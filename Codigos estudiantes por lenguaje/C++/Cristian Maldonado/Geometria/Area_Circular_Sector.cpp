#include <iostream>
#include <iomanip>

using namespace std;

typedef long double ld;

void setCir(ld radio, ld angle){
    if(angle >= 360){
        cout<<"Angulo no es posible"<<endl;
    }else{
        ld sector = ((22*radio*radio)/7)*(angle/360);
        cout<<sector<<endl;
    }
}

int main()
{
    //Los datos entran como grados
    ios_base::sync_with_stdio(false);cout.tie(NULL);cin.tie(NULL);
    cout.precision(22);
    ld radio, angulo; cin>>radio>>angulo;
    setCir(radio, angulo);
    return 0;
}
