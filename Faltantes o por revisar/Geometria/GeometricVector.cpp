#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;

struct Point {
    double x, y;

    Point() {
        x = y = 0.0;
    }

    Point(double _x, double _y) : x(_x), y(_y) {
    }

    bool operator==(Point other) const {
        return (fabs(x - other.x) < 1e-9 && (fabs(y - other.y) < 1e-9));
    }
};

struct Vec {
    double x, y;

    Vec(double _x, double _y) : x(_x), y(_y) {
    }
};

Vec toVector(Point a, Point b) {
    return Vec(b.x - a.x, b.y - a.y);
}

int main(){
    Point a={0,0};
    Point b={5,5};
    Vec segmento =toVector(a,b);
}