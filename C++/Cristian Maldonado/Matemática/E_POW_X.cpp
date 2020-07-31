#include <iostream>
#include <iomanip>

using namespace std;

double exp(int n, double x){
    double sum = 1;
    for(int i = n - 1; i >0 ; i--){
        sum = 1 + x * sum / i;
    }
    return sum;
}

int main()
{
    ios_base::sync_with_stdio(false);cout.tie(NULL);
    int n = 10;
    double x = 2;
    cout<<"exp: "<<setprecision(25)<<exp(n, x)<<endl;
    cout<<"exp: "<<setprecision(25)<<exp(n + 10, x)<<endl;
    return 0;
}
