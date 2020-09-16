#include<bits/stdc++.h> 
#include <cstdlib> 
using namespace std;
int main() {
    string str;
    getline(cin,str);
    string intermediate;
    vector<int> vec;
    stringstream check1(str);
    //tokenizer el cual podemos cambiar en el tercer parametro
      while(getline(check1, intermediate, ' ')) {
	  vec.push_back(atoi(intermediate.c_str()));
    }
    for(int i=0;i<vec.size();++i){
    	printf("%d ",vec[i]);
	}
    return 0;
}
