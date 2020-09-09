#include <iostream>
using namespace std;
//Arranged_Coin_Triangle
int findMaxH(int);
float squareRoot(float);

int main() {	
	int N=12;
	//System.out.println(findMaxH(N));
	cout<<findMaxH(N)<<endl;
}

int findMaxH(int n) {
	int n1 = 1 + 8 * n;
	int maxh = (int) (-1 + squareRoot(n1) / 2);
	return maxh;
}

float squareRoot(float n) {
	float x=n;
	float y=1;
	float e = 0.0000001f;
	while (x-y > e) {
		x= (x+y)/2;
		y=n/x;
		
	}
	return x;
}

