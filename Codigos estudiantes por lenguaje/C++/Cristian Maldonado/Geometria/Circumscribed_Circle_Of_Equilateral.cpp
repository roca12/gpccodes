#include <iostream>
#include <cmath>
#include <iomanip>

using namespace std;

typedef long double ld;

ld area_circumscribed(ld a){
    return (a * a *(M_PI / 3));
}

int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
    cout.precision(22);
    ld lado; cin>>lado;
    cout<<area_circumscribed(lado)<<endl;
    return 0;
}
