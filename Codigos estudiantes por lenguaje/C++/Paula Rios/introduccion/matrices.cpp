#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;
int main() {
	long matrix [8][7];
	int cont=1;
	for(int i=0;i<8;i++){
		for(int j=0;j<7;j++){
			matrix[i][j]=cont;
			cont++;
		}
	}
	for(int i=0;i<8;i++){
		for(int j=0;j<7;j++){
			cout<<matrix[i][j]<<"\t";
		}
		cout<<endl;
	}
}
