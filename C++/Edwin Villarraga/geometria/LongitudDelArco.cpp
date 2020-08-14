#include<bits/stdc++.h>
#include<cstdlib>
#define PI 22/7
//---------------//
using namespace std;
typedef long double ld;
ld arcLen(ld diametro,ld angulo){
    ld arc;
    if(angulo>=360){
        cout<<"el angulo no puede ser formado"<<endl;
        return 0;
    }
    else{
        arc=(PI*diametro)*(angulo/360);
        return arc;
    }
}
ld DegToRad(ld d){
    return ((d * PI )/ 180);
}
ld RagToDeg(ld r){
    return ((r * 180 )/ PI);
}
int main() {
    ld d=5000;
    ld angle=140.5;
    printf("%.5llf",arcLen(d,angle));
}
