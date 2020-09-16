#include "bits/stdc++.h" 
using namespace std;

struct Point {
    double x, y;

    Point() {
        x = y = 0.0;
    }

    Point(double _x, double _y) : x(_x), y(_y) {
    }

};
double euclideanDistance(Point p1, Point p2) {
    return hypot(p1.x - p2.x, p1.y - p2.y);
}

double perimeter(vector<Point> P) {
    double result = 0.0;
    for (int i = 0; i < P.size() - 1; i++) {
        result += euclideanDistance(P[i], P[i + 1]);
    }
    return result;
}



double euclideanDistance(double x1, double y1, double x2, double y2) {
    return hypot(x2 - x1, y2 - y1);
}

int main() {
    vector<Point> polygon;
    polygon.emplace_back(Point(0, 0));
    polygon.emplace_back(Point(1, 0));
    polygon.emplace_back(Point(1, 1));
    polygon.emplace_back(Point(0, 1));
    polygon.emplace_back(Point(0, 0));
    cout<<perimeter(polygon)<<endl;
}
