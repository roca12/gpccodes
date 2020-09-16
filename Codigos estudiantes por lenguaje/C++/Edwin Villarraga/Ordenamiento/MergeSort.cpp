#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;
void merge(int arr[],int l,int m,int r){
	int n1= m - l +1 ;
	int n2= r - m;
	int L[n1];
	int R[n2];
	for(int i=0;i<n1;++i){
		L[i]=arr[l +i];
		for(int j=0;j<n2;j++){
			R[j]=arr[m+ 1 +j];
		}
	}
	int i=0,j=0;
	int k= l;
	while(i<n1 && j <n2){
		if(L[i] <=R[j]){
			arr[k]=L[i];
			i++;
		}else{
			arr[k]=R[j];
			j++;
		}
		k++;
	}
	while(i < n1){
		arr[k]=L[i];
		i++;k++;
	}
	while(j < n2){
		arr[k]=R[j];
		j++;k++;
	}
}
void printArray(int arr[],int n){
	for(int i=0;i<n;i++){
		printf("%d ",arr[i]);
	}
	cout<<"\n";
}
void sort(int arr[],int l,int r){
	if(l < r){
		int m=(l+r)/2;
		sort(arr,l,m);
		sort(arr,m+1,r);
		merge(arr,l,m,r);
	}
}
int main(){
	/*
	int arr[]={3,41,1,34,41,2,4,0};
	int n=sizeof(arr)/sizeof(arr[0]);
	sort(arr,0,n-1);
	printArray(arr,n);
	*/
		string str;
    getline(cin,str);
    string intermediate;
    vector<int> vec;
    stringstream check1(str);
      while(getline(check1, intermediate, ' ')) {
	  vec.push_back(atoi(intermediate.c_str()));
    }
    int arr[vec.size()];
    for(int i=0;i<vec.size();++i){
    	arr[i]=vec[i];
	}
	sort(arr,0,vec.size()-1);
	printArray(arr,vec.size());
	return 0;
}
