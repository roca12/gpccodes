#include <iostream>
#include <bits/stdc++.h>
#include <cstdlib>
#include<string.h>

using namespace std;

int main(int argc, char** argv) {
	int t;
	cin>>t;
	for(int i=0; i<t; i++){
		string s;
		cin>>s;
		int largo=s.size();
		string respuesta=s;
		s+=s;
		for(int j = 0; j < largo; j++){
			respuesta=min(respuesta,s.substr(j,largo));
		}
		cout<<respuesta<<endl;
	} 

	
}

