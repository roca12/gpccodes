#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;

int main(int argc, char *argv[]) {
	
	int rep1, rep2;
	cin>>rep1;
	for(int i = 0; i < rep1; i++){
		int num = 0;
		cin>>rep2;
		for(int j = 0; j < rep2; j++){
		int aux;
		cin>>aux;
		num = num + aux;
		}
		int res = num/rep2;
		if(num%rep2 != 0)res+=1;
		cout<<res<<endl;
	}
	return 0;
}
