#include <iostream>
using namespace std;

int main(int argc, char *argv[]) {
	
	char c[1000];
	int i;	
	while(gets(c)) {
		for(i = 0; c[i]; i++)
			printf("%c", c[i]-7);
		cout<<""<<endl;
	}
	return 0;
}


