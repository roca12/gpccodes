#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;

int main(int argc, char *argv[]) {
	
	int rep, tamanio;
	cin>>rep;
	for(int i=0; i<rep; i++){
		int numero=0;
		cin>>tamanio;
		for(int j=0; j<tamanio; j++){
			int entrada;
			cin>>entrada;
			numero = numero + entrada;
		}  
		int res = numero/tamanio;
		if(numero%tamanio != 0)res+=1;
		cout<<res<<endl;
	}    
	return 0;
}
