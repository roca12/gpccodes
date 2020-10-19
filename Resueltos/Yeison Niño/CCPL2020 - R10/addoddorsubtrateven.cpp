#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;
int main(){
    int n;
    int a;
    int b;
    int r;
    int op;
    cin>>n;
    for (int i = 0; i < n; i++) {
        cin>>a;
        cin>>b;
        
        if ( a == b) {
            cout<<"0"<<endl;
            
        } else if (a < b) {
            op = b - a;
            r = op%2;
            if ( r != 0 ) {
                cout<<"1"<<endl;
                
            } else {
                cout<<"2"<<endl;
                
            }
        } else if (a > b) {
            op = a - b;
            r = op%2;
            if (r == 0) {
                cout<<"1"<<endl;
                
            } else {
                cout<<"2"<<endl;
                
            }
        }
    }
}
