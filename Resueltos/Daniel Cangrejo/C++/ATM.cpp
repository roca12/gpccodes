#include<iostream>
#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;

int main (int argc, char *argv[]) {
	
	int Retiro;
	float DineroB;
	float DineroS;
	
	cin>>Retiro, scanf("%f",&DineroB);
	if ((Retiro%5==0)&&(Retiro<=DineroB)){
		DineroS=(DineroB-(Retiro+0.50));
		printf("%.2f \n",DineroS);
	}else{
		printf("%.2f \n",DineroB);
	}
	
	
	
	
	return 0;
}
