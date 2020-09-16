#include <iostream>

using namespace std;

int GCD(int a, int b){
    return b == 0 ? a: GCD(b, a % b);
}
int LCM(int a, int b){
    return a * (b / GCD(a, b));
}

int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);
    int a, b;
    cin >> a >> b;
    cout << "GCD de A y B es: "<<GCD(a, b)<<endl;
    cout << "LCM de A y B es: "<<LCM(a, b)<<endl;
    return 0;
}
