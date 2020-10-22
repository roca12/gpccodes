#include<bits/stdc++.h>
#include<cstdlib>
typedef long long int ll;
using namespace std;
int main() {
    int n,total=0;
    scanf("%d",&n);
    while(n--){
        double a,b,c,impx=0.000000,impy=0.000000;
        cin>>a>>b>>c;
        double abcsisa=sqrt((pow(a,2))+(pow(b,2))-(pow(c,2)));
        double dir=atan(b/a)+atan(c/abcsisa);
        impx=abcsisa*cos(dir);
        impy=abcsisa*sin(dir);
        printf("%.6f %.6f\n",impx,impy);
    }
}
