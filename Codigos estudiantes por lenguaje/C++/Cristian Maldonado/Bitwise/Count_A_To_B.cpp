#include <iostream>

using namespace std;

string decToBin(int n)
{
    if (n == 0)
        return "0";
    string bin = "";
    while (n > 0)
    {
        bin = ((n & 1) == 0 ? '0' : '1')+bin;
        n >>= 1;
    }
    return bin;
}

int countSetBits(int n){
    int cont = 0;
    while(n != 0){
        cont += n&1;
        n>>=1;
    }
    return cont;
}

int flippedCount(int a, int b){
    return countSetBits(a^b);
}

int main()
{
    //Cuantos Bits requiero mover para que el numero A sea igual a B
    ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
    int a, b; cin>>a>>b;
    cout<<a<<" ->"<<decToBin(a)<<endl;
    cout<<b<<" ->"<<decToBin(b)<<endl;
    cout<<flippedCount(a, b);
    return 0;
}
