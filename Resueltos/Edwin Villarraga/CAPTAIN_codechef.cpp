#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
typedef long long ll;
int combinatory(vector<int> arr,int c){
}
int main() {
	int t;
	cin >> t;
	while(t--) {
		bool v=false;
		int c;
		cin >> c;
		vector<int> arr;
		for(int i = 0; i < c; i++){
		int a;cin>>a;
		arr.push_back(a);
		}
		sort(arr.begin(),arr.end());
		if (c<3){cout<<"No"<<endl;continue;}
		for(int i=0;i<c-2;i++){
			if((arr[i] + arr[i+1]) > arr[i+2]){
				v=true;
				cout<<"Yes"<<endl;
				break;
			}
		}
		if(v==false){
		cout<<"No"<<endl;
		}
		v=false;
	}
}
