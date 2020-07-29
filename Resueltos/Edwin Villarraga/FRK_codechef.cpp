#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;
int main(int argc, char** argv) {
	int n,cont=0;
	cin>>n;
	while(n>=0){
		string str;
		getline(std::cin,str);
		for(int i=0;i<str.size();i++){
			if(str[i]=='c'&&str[i+1]=='h'){
				cont++;
				break;
			}else if(str[i]=='h'&&str[i+1]=='e'){
				cont++;
				break;
			}else if(str[i]=='e'&&str[i+1]=='f'){
				cont++;
				break;
			}
		}
		n--;
	}
	cout<<cont<<"\n";
	return 0;
}
