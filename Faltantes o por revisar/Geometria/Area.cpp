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

double area(vector<Point> P) {
    double result = 0.0;
    for (int i = 0; i < P.size() - 1; i++) {
        result += ((P.at(i).x * P.at(i + 1).y) - (P.at(i + 1).x * P.at(i).y));
    }
    return abs(result) / 2.0;
}

int main() {
    vector<Point> puntos;
    puntos.emplace_back(Point(0, 0));
    puntos.emplace_back(Point(0, 1));
    puntos.emplace_back(Point(1, 1));
    puntos.emplace_back(Point(1, 0));
    puntos.emplace_back(Point(0, 0));
    cout << area(puntos) << endl;
}