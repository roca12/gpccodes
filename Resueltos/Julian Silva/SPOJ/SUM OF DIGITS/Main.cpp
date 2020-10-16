#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
int vec[200];
int main (int argc, char *argv[]) {
	string srt;
	int c,total=0;
	cin>>c;
	for(int j=0;j<c;j++){
		cin>>srt;
		for(int i=0;i<srt.size();i++){
			total+=srt[i]-48;
		}
		cout<<total<<endl;
		total=0;

	}
	
}
