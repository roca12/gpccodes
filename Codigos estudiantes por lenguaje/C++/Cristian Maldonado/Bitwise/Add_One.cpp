#include <iostream>

using namespace std;

string decToBin(int n)
{
    if (n == 0)
        return "0";
    string bin = "";
    int ayuda = n;
    n = abs(n);
    while (n > 0){
        bin = ((n & 1) == 0 ? '0' : '1') + bin;
        n >>= 1;
    }

    return (ayuda < 0 ? bin = '-'+bin: bin);
}

int addOne(int x){
    return (-(~x));
}

int main()
{
    int a = 13;
    cout<<a<<" --> "<<decToBin(a)<<endl;
    a = addOne(a);
    cout<<a<<" --> "<<decToBin(a)<<endl;
    return 0;
}
