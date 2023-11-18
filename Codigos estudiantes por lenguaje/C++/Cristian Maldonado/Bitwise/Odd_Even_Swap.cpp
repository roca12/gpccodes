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

int swapBits(int x){
    int evenBits = x & 0xAAAAAAAA;
    int oddBits = x & 0x55555555;
    evenBits >>= 1;
    oddBits <<= 1;
    return (evenBits | oddBits);
}

int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
    int x; cin>>x;
    cout<<x<<" -> "<<decToBin(x)<<endl;
    int res = swapBits(x);
    cout<<res<<" -> "<<decToBin(res)<<endl;
    return 0;
}
