#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;
int main(){
    vector<vector<double> >mat(5);//hay que tener el tam de la lista
    for(int i=0;i<4;i++){
        for(int j=0;j<5;j++){
            mat[i].push_back(rand() % 100);
        }
    }
    for(int i=0;i<4;i++){
        for(int j=0;j<5;j++){
            cout<<mat[i][j]<<"\t";
        }
        cout<<endl;
    }
}