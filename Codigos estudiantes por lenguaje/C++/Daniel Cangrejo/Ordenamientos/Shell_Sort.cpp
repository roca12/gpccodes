#include <bits/stdc++.h>
#include <cstdlib>
typedef long long int ll;
using namespace std;
void printArray(int arr[],int n){
	for(int i=0;i<n;++i){
		printf("%d ",arr[i]);
		}
	}
int sort(int arr[],int n){
	for(int gap = n/2;gap>0;gap/=2){
		for(int i=gap;i<n;i+=1){
			int temp=arr[i];
			int j;
			for(j=i;j>=gap && arr[j - gap] > temp;j-=gap){
				arr[j]=arr[j-gap];
			}
		 	arr[j]=temp;
		}
	}
	return 0;
}
int main(int argc, char** argv) {
	int arr[]={3,4,1,3,54,6,6,4,3,2,3,1,21};
	int n=sizeof(arr)/sizeof(arr[0]);
	sort(arr,n);
	printArray(arr,n);
    return 0;
}
