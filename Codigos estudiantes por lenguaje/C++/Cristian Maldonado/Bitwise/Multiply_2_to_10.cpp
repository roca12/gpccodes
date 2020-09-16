#include <iostream>
//-------------//
#define FAST ios_base::sync_with_stdio(false);cout.tie(NULL);

using namespace std;

int multiplyByTwo(int n){
    return (n << 1);
}

int multiplyByThree(int n){
    return ((n<<1)+n);
}

int multiplyByFour(int n){
    return (n << 2);
}

int multiplyByFive(int n){
    return ((n << 2) + n);
}

int multiplyBySix(int n){
    return ((n << 3) - (n << 1));
}

int multiplyBySeven(int n){
    return ((n << 3) - n);
}

int multiplyByEight(int n){
    return (n << 3);
}

int multiplyByNine(int n){
    return ((n << 3) + n);
}

int multiplyByTen(int n){
    return (n << 3) + (n << 1);
}

int main()
{
    FAST
    int a = 9;
    cout<<multiplyByTwo(a)<<endl;
    cout<<multiplyByThree(a)<<endl;
    cout<<multiplyByFour(a)<<endl;
    cout<<multiplyByFive(a)<<endl;
    cout<<multiplyBySix(a)<<endl;
    cout<<multiplyBySeven(a)<<endl;
    cout<<multiplyByEight(a)<<endl;
    cout<<multiplyByNine(a)<<endl;
    cout<<multiplyByTen(a)<<endl;
    return 0;
}
