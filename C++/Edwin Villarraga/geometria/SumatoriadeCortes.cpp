#include<bits/stdc++.h>
#include<cstdlib>
//---------------//
using namespace std;
int findMaxSum(int n){
    return 1 + n* (n+1) / 2;
}
int main() {
    int a=5;
    cout<<findMaxSum(a)<<endl;
}
