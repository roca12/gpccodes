#include<bits/stdc++.h>
#include<cstdlib>
#define PI 22/7
//---------------//
using namespace std;
typedef long double ld;
void setCir(ld radio,ld angle){
    if(angle>=360){
        cout<<"el angulo no es posible"<<endl;
    }else{
        ld sector=((22*radio*radio)/7)*(angle/360);
        printf("%.8llf\n",sector);
    }
}
int main() {
    ld radio=6;
    ld angle=22.7;
    setCir(radio,angle);
}
