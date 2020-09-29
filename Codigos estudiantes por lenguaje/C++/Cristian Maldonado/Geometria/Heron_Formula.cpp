#include <iostream>
#include <cmath>

using namespace std;

typedef long double ld;

ld heron(ld x1, ld y1, ld x2, ld y2, ld x3, ld y3){
    ld a = sqrt((x1 - x2)*(x1 - x2)+(y1 - y2)*(y1 - y2));
    ld b = sqrt((x1 - x3)*(x1 - x3)+(y1 - y3)*(y1 - y3));
    ld c = sqrt((x3 - x2)*(x3 - x2)+(y3 - y2)*(y3 - y2));
    ld s = (a + b + c)/2.0;
    ld A = sqrt(s *(s - a)*(s - b)*(s - c));
    return A;
}

int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
    cout.precision(22);
    ld x1, y1, x2, y2, x3, y3; cin>>x1>>y1>>x2>>y2>>x3>>y3;
    cout<<heron(x1, y1, x2, y2, x3, y3)<<endl;
    return 0;
}
