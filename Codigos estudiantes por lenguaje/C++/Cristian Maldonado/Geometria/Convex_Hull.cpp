#include <iostream>
#include <iomanip>
#include <vector>
//----------------//
#define x first
#define y second

using namespace std;

typedef long long int lli;
typedef pair <lli, lli> Point;

lli orientation(Point p, Point q, Point r){
    lli val = (q.y - p.y)*(r.x - q.x) - (q.x - p.x) * (r.y - q.y);
    if(val == 0){
        return 0;
    }
    return (val > 0) ? 1:2;
}

void convexHull(Point points[], lli n){
    if(n < 3){
        return;
    }
    vector <Point> hull;
    lli l = 0;
    for(lli i = 1; i < n; i++){
        if(points[i].x < points[l].x){
            l = i;
        }
    }
    lli p = l, q;
    do{
        hull.push_back(points[p]);
        q = (p + 1) % n;
        for(lli i = 0; i < n; i++){
            if(orientation(points[p], points[i], points[q]) == 2){
                q = i;
            }
        }
        p = q;
    }while(p != l);
    for(Point temp : hull){
        cout<<"("<<temp.x<<", "<<temp.y<<")"<<endl;
    }
}

int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
    lli numberOfPoints; cin>>numberOfPoints;
    Point points [numberOfPoints];
    for(lli i = 0; i < numberOfPoints; i++){
        lli _x, _y; cin>>_x>>_y;
        points[i] = make_pair(_x, _y);
    }
    convexHull(points, numberOfPoints);
    return 0;
}
