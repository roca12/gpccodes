#include <iostream>
#include <math.h>
using namespace std;
//PointInsideTriangle
double area(int x1, int y1, int x2, int y2, int x3, int y3) {
	return fabs((x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2.0);
}
bool isinside(int x1, int y1, int x2, int y2, int x3, int y3, int x, int y) {
	double A = area(x1,y1,x2,y2,x3,y3);
	double A1 = area(x1,y1,x2,y2,x,y);
	double A2 = area(x1,y1,x3,y3,x,y);
	double A3 = area(x2,y2,x3,y3,x,y);
	return (A==A1+A2+A3);
}

int main() {		
	int x1=0,x2=5,x3=10,y1=0,y2=5,y3=3,puntox=5, puntoy=3;
	if(isinside(x1, y1, x2, y2, x3, y3, puntox, puntoy)) {
		cout<<"Esta dentro"<<endl;
	}else cout<<"Esta fuera"<<endl;
}
