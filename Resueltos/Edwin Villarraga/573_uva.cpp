#include <bits/stdc++.h>
using namespace std;
int main(){
    double H,U,D,F,total=0;
    while(cin>>H>>U>>D>>F && H){
        total=0;
        F=(U*F)/100;
        for(int k=1;;k++){
          total+=U;
          if(U>0){
            U-=F;
          }
           if(total>H){
                cout<<"success on day "<<k<<endl;
                break;
           }
            total-=D;
            if(total<0){
                cout<<"failure on day "<<k<<endl;
                break;
            }
        }
    }

}
