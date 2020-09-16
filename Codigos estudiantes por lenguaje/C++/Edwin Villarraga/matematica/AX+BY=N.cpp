#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
void solution(int a,int b,int n){
    //bool v=false; //varias soluciones
    for(int i=0;i*a<=n;i++){
        if((n-(i*a))%b==0){
            printf("x= %d ,y= %d\n",i,((n-(i*a))/b));
            return;//quitar si se quieren todas las soluciones
            //v=true;
        }
    }
    cout<<"No hay solucion"<<endl;
    /*
    if(v==false){
        cout<<"No hay solucion"<<endl;
    }
    */
}
int main() {
    int a=2,b=3,n=12;
    solution(a,b,n);
}
