#include <bits/stdc++.h>
#include <cstdlib>

using namespace std;

int main(int argc, char** argv) {
	
	int vec[10];
	int tamanio = sizeof(vec)/sizeof(vec[0]);
	for(int i=0; i<10; i++){
		vec[i]=(i * i);
	}
	for(int i=0; i<tamanio; i++){
		cout<<vec[i]<<endl;
	}
}
