#include <cstdlib>
#include <bits/stdc++.h>
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

double euclideanDistance(Point p1, Point p2) {
    return hypot(p1.x - p2.x, p1.y - p2.y);
}

double euclideanDistance(double x1, double y1, double x2, double y2) {
    return hypot(x2 - x1, y2 - y1);
}

int main() {
    cout << euclideanDistance(Point(0, 0), Point(20, 20)) << endl;
    cout << euclideanDistance(0, 0, 20, 20) << endl;

}