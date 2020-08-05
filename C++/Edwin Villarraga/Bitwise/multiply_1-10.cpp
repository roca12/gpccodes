#include<bits/stdc++.h>
#include<cstdlib>
#define c(x) cout<<x<<endl;
#define cn(x) cout<<x;
#define l(c) cin>>t;
using namespace std;
static int multiplyByTwo(int n){
    return (n << 1);
}
static int multiplyByThree(int n){
    return((n << 1) + n);
}
static int multiplyByFour(int n){
    return (n << 2);
}
static int multiplyByFive(int n){
    return((n << 2) + n);
}
static int multiplyBySix(int n){
    return ((n<<4)-(n<<3))-((n<<2)-(n<<1));
}
static int multiplyBySeven(int n){
    return((n << 3) - n);
}
static int multiplyByEight(int n){
    return (n << 3);
}
static int multiplyByNine(int n){
    return ((n << 3)+n);
}
static int multiplyByTen(int n){
    return (n << 3)+(n<<1);
}
int main() {

}
