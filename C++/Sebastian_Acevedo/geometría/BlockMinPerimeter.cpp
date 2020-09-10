#include <iostream>
#include <Math.h>
//BlockMinPerimeter
using namespace std;
long minPerimeter(int n) {
	int resultraiz=(int)sqrt(n);
	int sq= resultraiz * resultraiz;
	if(sq==n) {
		return resultraiz * 4;
	}else {
		long row = n / resultraiz;
		long perimeter = 2*(resultraiz + row);
		if(n%resultraiz != 0) {
			perimeter +=2;
		}
		return perimeter;
	}
}
int main(int argc, char** argv) {
	int n=10;
	cout<<minPerimeter(n)<<endl;
	return 0;
}
