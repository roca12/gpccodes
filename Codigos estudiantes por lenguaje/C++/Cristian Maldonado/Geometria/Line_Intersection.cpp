#include <iostream>
//----------------//
#define MAX_DOUBLE 1.79e308-1
#define x first
#define y second

using namespace std;

typedef pair <double, double> Point;

void displayPoint(Point p){
    cout<<"("<<p.x<<", "<<p.y<<")"<<endl;
}

Point lineIntersection(Point A, Point B, Point C, Point D){
    double a1 = B.y - A.y;
    double b1 = A.x - B.x;
    double c1 = a1 * (A.x) + b1 * (A.y);
    double a2 = D.y - C.y;
    double b2 = C.x - D.x;
    double c2 = a2 * (C.x)+b2*(C.y);
    double determinant = a1 * b2 - a2 * b1;
    if(determinant == 0){
        return Point(MAX_DOUBLE, MAX_DOUBLE);
    }else{
        double x = (b2 * c1 - b1 * c2) / determinant;
        double y = (a1 * c2 - a2 * c1) / determinant;
        return Point(x, y);
    }
}

int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
    Point A = make_pair(1, 1);
    Point B = make_pair(4, 4);
    Point C = make_pair(1, 8);
    Point D = make_pair(2, 4);
    Point intersection = lineIntersection(A, B, C, D);
    if(intersection.x == MAX_DOUBLE && intersection.y == MAX_DOUBLE){
        cout<<"La linea AB y CD son paralelas."<<endl;
    }else{
        cout<<"La interseccion de las lineas AB y CD es: ";
        displayPoint(intersection);
    }
    return 0;
}
