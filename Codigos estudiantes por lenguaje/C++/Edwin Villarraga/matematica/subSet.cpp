#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
void printSubset(char sets[],int n){
    for(int i=0;i < (1<<n) ; i++){
        cout<<"{";
        for(int j=0;j<n;j++){
            if((i&(1<<j))){
                cout<<sets[j]<<" ";
            }
        }
        cout<<"}"<<endl;
    }
}
int main() {
    char conjunto[]={'a','b','c'};
    int n=sizeof conjunto/sizeof conjunto[0];
    printSubset(conjunto,n);
}
