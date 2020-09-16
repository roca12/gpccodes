#include <bits/stdc++.h>
#include <cstdlib>
typedef long long int ll;
using namespace std;
void printArray(vector <int> myvec,int n){
	for(int i=0;i<n;++i){
		printf("%d ",myvec[i]);
		}
	}
int sort(vector <int> myvec,int n){
	for(int gap = n/2;gap>0;gap/=2){
		for(int i=gap;i<n;i+=1){
			int temp=myvec[i];
			int j;
			for(j=i;j>=gap && myvec[j - gap] > temp;j-=gap){
				myvec[j]=myvec[j-gap];
			}
		 	myvec[j]=temp;
		}
	}
	printArray(myvec,n);
	return 0;
}
int main(int argc, char** argv) {
	int arr[]={3,4,1,3,54,6,6,4,3,2,3,1,21};
	int n=sizeof(arr)/sizeof(arr[0]);
	vector<int> myvec;
	myvec.insert(myvec.begin(),arr,arr+n);
	sort(myvec,n);
    return 0;
}
