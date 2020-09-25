#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;

int main(){
    int cont=1;
    vector<vector<int> >matrix(3);//es mejor indicar el tam
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            matrix.at(i).push_back(cont);
            cont++;
        }
    }
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            cout<<matrix.at(i).at(j)<<"\t";
        }
        cout<<endl;
    }
    return 0;
}
