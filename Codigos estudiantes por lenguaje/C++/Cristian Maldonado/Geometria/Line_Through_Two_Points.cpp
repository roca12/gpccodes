#include <iostream>
//-----------------//
#define x first
#define y second

using namespace std;

typedef pair<int,int> Pair;

void lineFromPoints(Pair p, Pair q){
    double a = q.y - p.y;
    double b = p.x - q.x;
    double c = a * (p.x) + b * p.y;
    if(b < 0){
        cout<<"La linea que pasa a traves de los puntos P y Q es:"<<endl;
        cout<<"("<<a<<"x) * ("<<b<<"y) = "<<c<<endl;
    }else{
        cout << "La linea que pasa a traves de los punto P y Q es:"<<endl;
        cout<<a<<"x + "<<b<< "y = "<<c<<endl;
    }
}

int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
    int a, b; cin>>a>>b;
    int c, d; cin>>c>>d;
    Pair p = make_pair(a, b);
    Pair q = make_pair(c, d);
    lineFromPoints(p, q);
    return 0;
}
