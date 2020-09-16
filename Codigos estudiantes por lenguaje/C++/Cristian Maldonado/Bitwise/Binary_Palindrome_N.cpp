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

int isKThBitSet(int x, int k){
    return ((x & (1 << (k - 1)))>0) ? 1:0;
}

int leftMostSetBit(int x){
    int cont = 0;
    while(x > 0){
        cont++;
        x = x >> 1;
    }
    return cont;
}

int isPalindrome(int x){
    int l = leftMostSetBit(x);
    int r = 1;
    while(l > r){
        if(isKThBitSet(x, l) != isKThBitSet(x, r)){
            return 0;
        }
        l--;
        r++;
    }
    return 1;
}

int findNThPalindrome(int n){
    int pal_count = 0;
    int i = 0;
    for(i = 1 ; i <= INT_MAX; i++){
        if(isPalindrome(i) > 0){
            pal_count++;
        }
        if(pal_count == n){
            break;
        }
    }
    return i;
}

int main()
{
    ios_base::sync_with_stdio(false);cout.tie(NULL);
    int n = 14;
    int res = findNThPalindrome(n);
    cout<<res<<endl;
    cout<<decToBin(res)<<endl;
    return 0;
}
