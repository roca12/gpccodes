#include <cstdlib>
#include <bits/stdc++.h>
#define MAX 1024
using namespace std;
int main() {
	char key[]="`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
	char str[MAX];
	while(gets(str)){
		int n=strlen(str);
		for(int j=0;j<n;++j){
			if(str[j]==' '){
				printf(" ");
			}else{
				for(int k=0;k<strlen(key);k++){
					if(key[k]==str[j]){
						printf("%c",key[k-1]);
					}
				}
			}
		}
			printf("\n");
		
	}
	return 0;
}
