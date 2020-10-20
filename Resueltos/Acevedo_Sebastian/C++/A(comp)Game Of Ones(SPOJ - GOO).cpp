#include <bits/stdc++.h>
#include <cstdlib>

using namespace std;

int main(int argc, char** argv) {
int rep;
	long bits;
	cin>>rep;
	for (int i = 0; i < rep; i++) {
		cin>>bits;
		long result=1;
		long numBits=1;
		if(bits!=1) {
			result =(long)pow(2, bits-1);
			numBits = result+(result/2)*(bits-1);
		}
		cout<<result<<endl;
		cout<<numBits<<endl;
	}
}
