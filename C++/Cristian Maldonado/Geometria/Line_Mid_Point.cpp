#include <iostream>

using namespace std;

string midPoint(int x1, int x2, int y1, int y2){
    string res1 = std::to_string((x1+x2)>>1);
    string res2 = std::to_string((y1+y2)>>1);
    return (res1+", "+res2);
}

int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
    int x1, x2; cin>>x1>>x2;
    int y1, y2; cin>>y1>>y2;
    cout<<midPoint(x1, x2, y1, y2)<<endl;
    return 0;
}
