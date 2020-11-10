#include <iostream>
#include <cmath>
#include <math.h>

using namespace std;

double semiPerimetro(double a, double b, double c){
    return (a+b+c)/2.0;
}

int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
    double a, b, c;
    while((cin>>a>>b>>c) && !cin.eof()){
        double s = semiPerimetro(a, b, c);
        double areaT = sqrt(s*(s - a)*(s - b)*(s - c));
        double radioG = (a*b*c)/(4*areaT);
        double radioP = sqrt(((s - a)*(s - b)*(s - c))/s);
        double areaG = M_PI * pow(radioG, 2);
        double areaP = M_PI * pow(radioP, 2);
        printf("%.4lf %.4lf %.4lf\n", (areaG - areaT), (areaT - areaP), (areaP));
    }
    return 0;
}
