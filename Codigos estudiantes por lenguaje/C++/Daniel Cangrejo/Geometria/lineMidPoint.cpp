#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
string midPoint(int x1,int y1,int x2,int y2){
    return (to_string((x1+x2)/2)+","+to_string((y1+y2)/2));
}
int main() {
    int x1,y1;
    int x2,y2;
    cin>>x1>>y1>>x2>>y2;
    string medio=midPoint(x1,y1,x2,y2);
    cout<<medio<<endl;
}
