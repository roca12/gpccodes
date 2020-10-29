#include<iostream>
#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;

int mod(int n){
	int aux = 0, cont = 0;
	int x = n;
	while(n > 0){
		aux = n % 10;
		n /= 10;
		if(aux != 0){
		  if(x%aux == 0){
			cont++;
		  }
		}
	}
	return cont;
}


int main (int argc, char *argv[]) {
	
	int rep=0;
	cin>>rep;
	for(int i=0; i < rep; i++){
		int num = 0;
		cin>>num;
		cout<<mod(num)<<endl;
	}
	
	return 0;
}
