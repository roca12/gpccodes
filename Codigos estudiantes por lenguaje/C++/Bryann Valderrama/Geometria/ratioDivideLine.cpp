#include <iostream>
//-----------------//
#define x first
#define y second

using namespace std;

typedef pair <double, double> Pair;

void section(Pair p, Pair q, Pair n){
    double x = ((n.y * p.x)+(n.x * p.y))/(n.x + n.y);
    double y = ((n.y * q.x)+(n.x * q.y))/(n.x + n.y);
    cout<<"("<<x<<", "<<y<<")"<<endl;
}

int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
    double px, py; cin>>px>>py;
    double qx, qy; cin>>qx>>qy;
    double nx, ny; cin>>nx>>ny;
    Pair p = make_pair(px, py);
    Pair q = make_pair(qx, qy);
    Pair n = make_pair(nx, ny);
    section(p, q, n);
    return 0;
}
