#include<cstring>
#include<bits/stdc++.h>
using namespace std;
int main(){
	int c;
	string a;
	cin>>c;
	for (int i = 1; i <= c; i++){
		string b;
		string a;
		cin>>a;
		int lengt=a.length();
		for(int j=1; j<=lengt;j++){
			string b="";
			string c=a.substr(0,j);
			int stleng=c.length();
			for(int k = 1;k<=lengt/stleng;k++){
				b+=c;
			}
			if(b==a){
				cout<<stleng<<endl;
				break;
				
			}
		}
		if(i!=c)cout<<endl;
		
	}
		return 0;
}
