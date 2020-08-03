#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
int paso=1;
void hanoi(int n,string from,string temp,string to){
    if(n==0){
        return;
    }
    hanoi(n-1,from,to,temp);
    cout<<paso<<" mover disco "<<n<<" de "<<from<<" a "<<to<<endl;
    paso++;
    hanoi(n-1,temp,from,to);
}
int main(){
    int n=8;
    hanoi(n,"Primer Torre","Segunda Torre","Tercer Torre");
    return 0;
}
