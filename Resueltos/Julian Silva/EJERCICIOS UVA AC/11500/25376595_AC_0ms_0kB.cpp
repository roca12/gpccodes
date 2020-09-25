#include <stdio.h>
#include <math.h>

double jugador(int n1, int n2, int at){
	double dado;
	if(at == 3){
		return (double)n1/(double)(n1+n2);
	}else{
		dado = 1.0 - (6-at)/6.0;
		dado = (1 - dado)/dado;
		return (1.0 - pow(dado,n1))/(1.0 - pow(dado,n1+n2));
	}
}
	
	int main(){
		int x, y, z, c, aux;
		
		double p;
		
		for(;;){
			scanf("%d %d %d %d",&x,&y,&z,&c);
			
			if(x == 0 && y == 0 && z == 0 && c == 0) break;
			
			aux = x;
			x = 0;
			while(aux > 0){
				aux -= c;
				x++;
			}
			aux = y;
			y = 0;
			while(aux > 0){
				aux -= c;
				y++;
			}
			
			p = jugador(x,y,z);            
			
			printf("%.1f\n",p*100);
		}
		return 0;
	}
