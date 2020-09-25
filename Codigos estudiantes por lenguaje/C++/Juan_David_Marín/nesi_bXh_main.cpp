#include<stdio.h>
int main(){
	int espaci;
	scanf("%d",&espaci);
	for(int t=1;t<=espaci;t++){
		int altura,ancho;
		scanf("%d%d",&ancho,&altura);
		printf("%d\n",(ancho/3)*(altura/3));
	}
	return 0;
}