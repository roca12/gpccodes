
#include <stdio.h>
#include <string.h>

int main() {
	char x[1005];
	int T;
	while(scanf("%d", &T) == 1) {
		while(T--) {
			scanf("%s", x);
			int tam = strlen(x);
			if(!tam%2) puts("NUTANT");
			else if(tam == 1) {
				puts(x[0] == 'A' ? "SIMPLE" : "MUTANT");
			} else {
				if(x[0] == 'B' && x[tam-1] == 'A')
					puts("MUTAGENIC");
				else if(x[tam-1] == 'B' && x[tam-2] == 'A')
					puts("FULLY-GROWN");
				else
					puts("MUTANT");
			}
		}
	}
	return 0;
}