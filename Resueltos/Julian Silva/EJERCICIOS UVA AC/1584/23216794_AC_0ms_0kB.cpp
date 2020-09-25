#include <iostream>
#include <bits/stdc++.h>
#include <cstdlib>
#include<string.h>

using namespace std;

int main(int argc, char** argv) {
	int c;
	cin>>c;
	for(int i=0; i<c; i++){
		string b;
		cin>>b;
		int largo=b.size();
		string respuesta=b;
		b+=b;
		for(int j = 0; j < largo; j++){
			respuesta=min(respuesta,b.substr(j,largo));
		}
		cout<<respuesta<<endl;
	} 

	
}