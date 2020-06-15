#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int main (int argc, char *argv[]) {
	int casos  = 0;
	scanf("%d",&casos);
	for (int i = 0; i < casos ; i++){
		int divisor1 = 0; 
		int divisor2 =0;
		int numero = 0;
		scanf("%i",&divisor1);
		scanf("%i",&divisor2);	
		scanf("%i",&numero);
		for(int j = 1; j <=numero; j++){
			if(j%divisor1 == 0 && j % divisor2 ==0){
				cout << "FizzBuzz"<<endl;
			}else if(j % divisor1 ==0){
				cout << "Fizz"<<endl;
			}else if(j % divisor2 == 0){
				cout << "Buzz"<<endl;
			}else{
				cout << j << endl;
			}
		}
	
	}
	return 0;
}
