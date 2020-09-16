#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
float squareRoot(float n){
    float x=n;
    float y=1;
    float e=0.000001f;
    while(x-y>e){
        x = (x + y)/2;
        y = n / x;
    }
    return x;
}
int findMaxH(int N){
    int n1=1+8*N;
    int maxH=(int)(-1+squareRoot(n1)/2);
    return maxH;
}
int main() {
    int N=6;
    cout<<findMaxH(N)<<endl;
}
