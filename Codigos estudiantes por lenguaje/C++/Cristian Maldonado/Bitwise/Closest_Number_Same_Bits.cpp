#include <iostream>
//----------//
#define FAST ios_base::sync_with_stdio(false);cout.tie(NULL);

using namespace std;

string decToBin(int n)
{
    if (n == 0)
        return "0";
    string bin = "";
    int ayuda = n;
    n = abs(n);
    while (n > 0)
    {
        bin = ((n & 1) == 0 ? '0' : '1')+bin;
        n >>= 1;
    }
    return (ayuda < 0) ? bin = '-'+bin: bin;
}

int getNext(int n){
    int c = n;
    int c0 = 0;
    int c1 = 0;
    while(((c & 1) == 0) && c!= 0){
        c0++;
        c>>=1;
    }
    while((c & 1) == 1){
        c1++;
        c >>=1;
    }
    if(c0 + c1 == 31 || c0 + c1 == 0){
        return -1;
    }
    int p = c0 + c1;
    n |= (1 << p);
    n &= ~((1 << p) - 1);
    n |= (1 << (c1 - 1))-1;
    return n;
}

int getPrev(int n){
    int temp = n;
    int c0 = 0;
    int c1 = 0;
    while((temp & 1) == 1){
        c1++;
        temp = temp >> 1;
    }
    if(temp == 0){
        return -1;
    }
    while(((temp & 1) == 0) && (temp != 0)){
        c0++;
        temp = temp >> 1;
    }
    int p = c0 + c1;
    n = n&((~0)<<(p + 1));
    int mask = (1 << (c1 + 1))-1;
    n = n | mask<<(c0 - 1);
    return n;
}

int main()
{
    FAST
    int n = 9;
    cout<<"Previo("<<n<<", "<<decToBin(n)<<"): "<<getPrev(n)<<endl;
    cout<<"Siguiente("<<n<<", "<<decToBin(n)<<"): "<<getNext(n)<<endl;
    return 0;
}
