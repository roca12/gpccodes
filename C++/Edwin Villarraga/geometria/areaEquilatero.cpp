#include<bits/stdc++.h>
#include<cstdlib>
#define PI 22/7
//---------------//
using namespace std;
typedef long double ld;
ld areaEquilatero(ld lado){
    return (lado*lado*(PI/3));
}
int main() {
    ld a=6;
    printf("%.8llf",areaEquilatero(a));
}
