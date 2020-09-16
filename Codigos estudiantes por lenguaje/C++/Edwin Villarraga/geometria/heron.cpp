#include<bits/stdc++.h>
#include<cstdlib>
#define point pair<double,double>
#define x first
#define y second
//---------------//
using namespace std;
/*
double heron(point a,point b,point c){
    double a =std::sqrt((a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y));
    double b =std::sqrt((b.x-c.x)*(b.x-c.x)+(b.y-c.y)*(b.y-c.y));
    double c =std::sqrt((c.x-a.x)*(c.x-a.x)+(c.y-a.y)*(c.y-a.y));
    double s=(a+b+c)/2;
    return (std::sqrt(s*(s-a)*(s-b)*(s-c)));

}
*/
double heron(double x1,double y1,double x2,double y2,double x3,double y3){
    double a =std::sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    double b =std::sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
    double c =std::sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));
    double s=(a+b+c)/2;
    return (std::sqrt(s*(s-a)*(s-b)*(s-c)));

}
int main() {
    cout<<heron(1,0,-1,0,0,2)<<endl;
}
