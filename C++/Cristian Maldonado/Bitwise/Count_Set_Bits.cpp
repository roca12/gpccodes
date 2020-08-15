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

int countSetBitsUtil(int x){
    if(x<=0){
        return 0;
    }
    return ((x&1) == 0 ? 0: 1) + countSetBitsUtil(x >> 1);
}

int countSetBit(int n){
    int bitCount = 0;
    for(int i = 0; i <= n; i++){
        cout<<i<<" ->"<<decToBin(i)<<endl;
        bitCount += countSetBitsUtil(i);
    }
    return bitCount;
}

int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
    int a; cin>>a;
    cout<<countSetBit(a)<<endl;
    return 0;
}
