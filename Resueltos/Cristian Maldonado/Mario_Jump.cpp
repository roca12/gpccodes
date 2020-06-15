#include<iostream>
#include<bits/stdc++.h>

using namespace std;

int main (int argc, char *argv[]) {
	int casos = 0;
	scanf("%d", &casos);
	for (int i = 0; i < casos; i++){
		int tam = 0;
		int contadorAlto = 0, contadorBajo = 0;
		scanf("%d",&tam);
		int paredes [tam];
		int auxiliar = 0;
		for(int j = 0 ; j < tam; j++){
			scanf("%d", &paredes[j]);
		}
		auxiliar = paredes[0];
		for(int x = 1; x < tam ;x++){
			if(paredes[x] > auxiliar){
				contadorAlto++;
			}else if(paredes [x] < auxiliar){
				contadorBajo++;
			}
			auxiliar = paredes[x];
		}
		cout << "Case "<< (i+1)<<": "<<contadorAlto<<" "<<contadorBajo<<endl; 
	}
	return 0;
}
