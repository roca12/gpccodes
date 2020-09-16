#include "bits/stdc++.h" 
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

    Vec(double _x, double _y) {
        x = _x;
        y = _y;
    }
};
static Vec toVector(Point a, Point b) {
    return Vec(b.x - a.x, b.y - a.y);
}
double angle(Point a, Point b, Point c) {
    Vec ba = toVector(b, a);
    Vec bc = toVector(b, c);
    return acos((ba.x * bc.x + ba.y * bc.y) / sqrt((ba.x * ba.x + ba.y * ba.y) * (bc.x * bc.x + bc.y * bc.y)));
}
double cross(Vec a, Vec b) {
    return a.x * b.y - a.y * b.x;
}

bool ccw(Point p, Point q, Point r) {
    return cross(toVector(p, q), toVector(p, r)) > 0;
}

bool inPolygon(Point pt, vector<Point> P) {
    if (P.empty()) {
        return false;
    }
    double sum = 0;
    for (int i = 0; i < P.size() - 1; i++) {
        if (ccw(pt, P[i], P[i + 1])) {
            sum += angle(P[i], pt, P[i + 1]);
        } else {
            sum -= angle(P[i], pt, P[i + 1]);
        }
    }
    if (abs(abs(sum) - 2 * acos(-1.0)) < 1e-9) {
        return true;
    }
    return false;
}

bool collinear(Point p, Point q, Point r) {
    return abs(cross(toVector(p, q), toVector(p, r))) < 1e-9;
}

int main() {
    vector<Point> polygon;
    polygon.emplace_back(Point(0, 0));
    polygon.emplace_back(Point(2, 0));
    polygon.emplace_back(Point(2, 2));
    polygon.emplace_back(Point(0, 2));
    polygon.emplace_back(Point(0, 0));
    Point punto = Point(1, 1);
    if (inPolygon(punto, polygon)) {
        cout<<"Si"<<endl;
    } else {
        cout<<"No"<<endl;
    }
}
