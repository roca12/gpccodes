#include<bits/stdc++.h>
#include<cstdlib>
#define x first
#define y second
//---------------//
using namespace std;
typedef pair<int,int> point;
int orientation(point p,point q,point r){
    int val=(q.y-p.y)*(r.x-q.x)-(q.x-p.x)*(r.y-q.y);
    if(val==0){
        return 0;
    }
    return (val>0?1:2);
}
void convexHull(point po[],int n){
    if(n<3){
        return;
    }
    vector<point>hull;
    int l=0;
    for(int i=1;i<n;i++){
        if(po[i].x < po[l].x){
            l=i;
        }
    }
    int p=l,q;
    do{
        hull.push_back(po[p]);
        q=(p+1)%n;
        for(int i=0;i<n;i++){
            if (orientation(po[p],po[i],po[q])==2){
                q=i;
            }
        }
        p=q;
    }while(p!=l);
    for(point punto:hull){
        printf("{%d,%d}\n",punto.x,punto.y);
    }
}
int main() {
    point po[7];
    po[0]=make_pair(0,3);
    po[1]=make_pair(2,3);
    po[2]=make_pair(1,1);
    po[3]=make_pair(2,1);
    po[4]=make_pair(3,0);
    po[5]=make_pair(0,0);
    po[6]=make_pair(3,3);
    convexHull(po,7);
}
