#include<bits/stdc++.h>
#include<cstdlib>
#define x first
#define y second
using namespace std;
typedef pair<int,int> point;
double area(point A,point B,point C){
    return std::abs((A.x*(B.y-C.y)+B.x*(C.y-A.y)+C.x*(A.y-B.y))/2.0);
}
bool isInside(point act,point A,point B,point C){
    //area triangle complete
    double AR=area(A,B,C);
    //sub area triangle 1
    double A1=area(A,B,act);
    //sub area triangle 2
    double A2=area(A,C,act);
    //sub area triangle 3
    double A3=area(B,C,act);
    return (AR==A1+A2+A3);
}
int main() {
    point A=make_pair(0,0);
    point B=make_pair(5,5);
    point C=make_pair(10,0);
    point act=make_pair(5,2);
    if(isInside(act,A,B,C)){
        cout<<"el punto esta dentro"<<endl;
    }else{
        cout<<"el punto esta fuera"<<endl;
    }

}
