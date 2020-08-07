#include <cstdlib>
#include <bits/stdc++.h>
using namespace std;
#define PI  acos(-1.0)

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

double angle(Point a, Point b, Point c) {
    Vec ba = toVector(b, a);
    Vec bc = toVector(b, c);
    return acos((ba.x * bc.x + ba.y * bc.y) / sqrt((ba.x * ba.x + ba.y * ba.y) * (bc.x * bc.x + bc.y * bc.y)));
}

double DegToRad(double d) {
    return d * acos(-1.0) / 180.0;
}

double RadToDeg(double r) {
    return r * 180.0 / acos(-1.0);
}

int main() {
    vector<Point> puntos;
    Point a = {0, -1};
    Point b = {0, 0};
    Point c = {0, 1};
    puntos.emplace_back(a);
    puntos.emplace_back(b);
    puntos.emplace_back(c);
    double res = angle(puntos.at(0), puntos.at(1), puntos.at(2));
    cout << res << endl;
    cout << RadToDeg(res) << endl;
}