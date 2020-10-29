#include <bits/stdc++.h>
using namespace std;
void print(bool arr[],int n){
    for(int i=0;i<=n;i++){
        cout<<i<<"->"<<arr[i]<<endl;
    }
}
void sieveErathostenes(int N){
    bool prime[N+1];
    memset(prime,true,sizeof prime);
    prime[0]=prime[1]=false;
    for(int p=2;p*p <= N ;p++){
        if(prime[p]){
            for(int i= p*p;i<= N;i+=p){
                prime[i]=false;
            }
        }
    }
    print(prime,N);
}
int main(){
    sieveErathostenes(100);
    return 0;
}
