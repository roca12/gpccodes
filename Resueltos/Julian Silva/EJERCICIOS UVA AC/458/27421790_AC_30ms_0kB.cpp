#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;

int main (int argc, char *argv[]) {
	char str;
	while(scanf("%c",&str) != EOF){
		if(str!='\n'){
			printf("%c",str-7);
		}
		else {
			printf("\n");
		}
	}
	
}
