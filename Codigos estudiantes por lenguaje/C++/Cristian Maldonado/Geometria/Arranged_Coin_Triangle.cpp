#include <iostream>

using namespace std;

float squareRoot(float n){
    float x = n;
    float y = 1;
    float e = 0.000001f;
    while((x - y) > e){
        x = (x + y)/2;
        y = n / x;
    }
    return x;
}

int findMaximumHeight(int N){
    int n = 1 + 8 * N;
    int maxH = (int)(-1 + squareRoot(n))>>1;
    return maxH;
}

int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
    int N; cin>>N;
    cout<<findMaximumHeight(N)<<endl;
    return 0;
}
