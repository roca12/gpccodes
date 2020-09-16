#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
void modEquation(int a,int b){
    if(a<b){
        cout<<"no hay solucion"<<endl;
        return;
    }
    if(a==b){
        cout<<"infinitas soluciones"<<endl;
        return;
    }
    int cont=0;
    int n=a-b;
    int y=std::sqrt(a-b);

    for(int i=1;i<=y;i++){
        if(n%i==0){
            if(n/i>b){
                cont++;
                cout<<(n/i)<<" ";
            }
            if(i>b){
                cont++;
                cout<<i<<" ";
            }
        }
    }
    cout<<endl;
    if(y*y==n && y>b){
        cont--;
    }
    cout<<cont<<endl;

}
int main() {
    //a%x=b;
    int a=21,b=5;
    modEquation(a,b);

}
