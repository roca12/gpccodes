#include<bits/stdc++.h>
#include<cstdlib>
#define x first
#define y second
using namespace std;
typedef pair<double,double> point;
void section(point a,point b,point n){
    double x1 = ((n.y*a.x)+(n.x*a.y))/(n.x+n.y);
    double y1 = ((n.y*b.x)+(n.x*b.y))/(n.x+n.y);
    cout<<"("<<x1<<" , "<<y1<<")"<<endl;
}
int main() {
    point a=make_pair(2,0);
    point b=make_pair(5,5);
    point n=make_pair(3,2);
    section(a,b,n);
}

