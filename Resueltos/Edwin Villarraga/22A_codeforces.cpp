#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;
int main(int argc, char** argv) {
	int c;
	scanf("%d",&c);
	if(c==1){
		cout<<"NO"<<endl;
		return 0;
	}
	set<int>myset;
	set<int>::iterator it;
	for(int i=0;i<c;++i){
	 int a;cin>>a;
		myset.insert(a);
	}
	if(myset.size()==1){
		cout<<"NO"<<endl;
		return 0;
	}
	it=myset.begin();
	*it++;
	cout<<*it<<endl;
	return 0;
}
