#include<iostream>
using namespace std;

int main (int argc, char *argv[]) {
	for(int i=0;i<=10;i++){
		int res = i^(1<<2);
		if(res!=0){
			cout<<i<<"->"<<res<<endl;
		}
	}
	return 0;
}

