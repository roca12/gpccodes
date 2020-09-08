#include<bits/stdc++.h>
#include<cstdlib>
#define x first
#define y second
using namespace std;
typedef pair<int,int> point;
void lineFromPoints(point P,point Q){
    double a=Q.y-P.y;
    double b=P.x-Q.x;
    double c=a*(P.x)+b*(P.y);
    if(b < 0){
        cout<<"La linea que pasa a traves de los puntos P y Q es:"<<"("<<a<<"x) * ("<<b<<"y) = "<<c<<endl;
    }else{
        cout << "La linea que pasa a traves de los punto P y Q es:"<<a<<"x + " << b << "y = " << c << endl;
    }
}
int main() {
    point p=make_pair(3,2);
    point q=make_pair(2,6);
    lineFromPoints(p,q);
}
