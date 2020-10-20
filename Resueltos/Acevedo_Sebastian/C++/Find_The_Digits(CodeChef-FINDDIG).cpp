#include <iostream>
using namespace std;

int mod(int num){
	int aux=0, count=0;
	int x=num;
	while(num>0){
		aux = num%10;
		num /=10;
		if(aux!=0){
			if(x%aux==0)count++;
		}		
	}
	return count;
}

int main(int argc, char *argv[]) {
	
	int rep;
	cin>>rep;
	for(int i=0; i<rep; i++){
		int num;
		cin>>num;
		cout<<mod(num)<<endl;
	}	
	return 0;
}
