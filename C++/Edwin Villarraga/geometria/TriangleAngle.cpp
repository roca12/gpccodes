#include<bits/stdc++.h>
#include<cstdlib>
#define x first
#define y second
#define PI 22/7
using namespace std;
typedef pair<int,int> point;
int lengthSquare(point p1,point p2){
    int xDiff=p1.x - p2.x;
    int yDiff=p1.y - p2.y;
    return xDiff * xDiff + yDiff * yDiff;
}
void printAngle(point A,point B,point C){
    int a2=lengthSquare(B,C);
    int b2=lengthSquare(A,C);
    int c2=lengthSquare(A,B);

    float a=(float) std::sqrt(a2);
    float b=(float) std::sqrt(b2);
    float c=(float) std::sqrt(c2);

    float alfa=(float) std::acos((b2 + c2 - a2)/(2*b*c));
    float beta=(float) std::acos((a2 + c2 - b2)/(2*a*c));
    float gamma=(float) std::acos((a2 + b2 - c2)/(2*a*b));

    alfa=(float)(alfa*180/PI);
    beta=(float)(beta*180/PI);
    gamma=(float)(gamma*180/PI);

    cout<<"alfa: "<<alfa<<endl;
    cout<<"beta: "<<beta<<endl;
    cout<<"gamma: "<<gamma<<endl;
}
int main() {
    point A=make_pair(0,0);
    point B=make_pair(0,1);
    point C=make_pair(1,0);
    printAngle(A,B,C);
}
