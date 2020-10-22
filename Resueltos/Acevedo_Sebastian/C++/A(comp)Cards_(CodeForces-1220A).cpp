#include <iostream>
using namespace std;

int main(int argc, char *argv[]) {
	int rep;
	cin>>rep;
	int contZ=0, contE=0, contR=0, contO=0, contN=0;
	for (int i = 0; i < rep; i++) {
		char letra;
		cin>>letra;   
		if(letra=='z')contZ+=1;
		else if(letra=='e')contE+=1;
		else if(letra=='r')contR+=1;
		else if(letra=='o')contO+=1;
		else if(letra=='n')contN+=1;
		
	}
	int es=0;
	while(contO!=0 && contN!=0 && contE!=0){
		cout<<"1";
		contO-=1; contN-=1; contE-=1;
		if(contO!=0 && contN!=0 && contE!=0)cout<<" ";
		es=1;
	}
	if(contO!=0 && contZ!=0 && contE!=0 && contR!=0 && es ==1)cout<<" ";
	while(contZ!=0&& contE!=0 && contR!=0 && contO!=0){
		cout<<"0";
		contZ-=1; contE-=1; contR-=1; contO-=1;
		if(contZ!=0 && contE!=0 && contR!=0 && contO!=0)cout<<" ";
	}
	return 0;
}
