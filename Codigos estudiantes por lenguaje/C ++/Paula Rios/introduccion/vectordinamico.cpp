#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;
int main( ) {
	vector<int> lista;
	for(int i=0;i<10;i++){
		lista.push_back(i*i);
	}
	for(int i=0; i<lista.size();i++){
		cout<<lista[i]<<endl;
	}
	
}
