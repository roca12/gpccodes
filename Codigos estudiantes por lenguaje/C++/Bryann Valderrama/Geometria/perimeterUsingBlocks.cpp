#include <iostream>
#include <cmath>

using namespace std;

long minPerimeter(int n){
    int x = (int) sqrt(n);
    int sq = x * x;
    if(sq == n){
       return x << 2;
    }else{
        long row = n/x;
        long perimeter = (x+row)<<1;
        if(n % x != 0){
            perimeter += 2;
        }
        return perimeter;
    }
}

int main()
{
    ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);
    int n;cin>>n;
    cout<<minPerimeter(n)<<endl;
    return 0;
}
