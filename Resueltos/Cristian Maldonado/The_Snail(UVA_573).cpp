#include <iostream>

using namespace std;

int main()
{
    float h, u, d, f, cnt, dist;
    while( cin>>h && h != 0){
        cin>>u>>d>>f;
        f = (f*u)/100;
        cnt = 0;
        dist = 0;
        while(!(dist < 0)){
            cnt++;
            if(cnt > 1 && u > 0)u -= f;
            dist += u;
            if( dist > h )break;
            dist -= d;
        }
        if ( dist < h){
            cout<<"failure on day "<<cnt<<endl;
        }else{
            cout<<"success on day "<<cnt<<endl;
        }
    }
    return 0;
}
