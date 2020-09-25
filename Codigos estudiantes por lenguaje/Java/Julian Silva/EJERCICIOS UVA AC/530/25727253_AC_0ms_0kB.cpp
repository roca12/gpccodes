#include<bits/stdc++.h>
#include<cstdlib>

int main(){
	int x, y;
	while (scanf("%d%d", &x, &y) && x){
		if (x - y < y){
			y = x - y;
		}
		double res = 1;
		for (int i = x, j = 1; j <= y; j++,i--){
			res *= i;
			res /= j;
		}
		printf("%.0lf\n", res);
	}
}
