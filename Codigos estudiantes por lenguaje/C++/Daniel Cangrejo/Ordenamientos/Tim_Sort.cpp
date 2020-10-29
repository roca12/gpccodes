#include <bits/stdc++.h>
#include <cstdlib>
#define MAX 256
typedef long long int ll;
using namespace std;
int RUN = 32;
void printArray(int arr[],int n){
	for(int i=0;i<n;i++){
		printf("%d ",arr[i]);
	}
}
void insertionSort(int arr[],int left,int rigth){
	for(int i=left+1;i<=rigth;++i){
		int temp = arr[i];
		int j=i-1;
		while(arr[j] > temp && j>=left){
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=temp;
	}
}
void merge(int arr[],int l,int m,int r){
	int len1=m- l + 1,len2=r - m;
	int left[len1];
	int rigth[len2];
	for(int x=0;x<len1;++x){
		left[x]=arr[l + x];
	}
	for(int x=0;x<len2;++x){
		rigth[x]=arr[m + 1 + x];
	}
	int i=0,j=0,k=l;
	while(i < len1 && j < len2){
		if(left[i]<=rigth[j]){
			arr[k]=left[i];
			i++;
		}else{
			arr[k]=rigth[j];
			j++;
		}
		k++;
	}
	while(i < len1){
		arr[k]=left[i];
		k++;
		i++;
	}
	while(j < len2){
		arr[k]=rigth[j];
		k++;
		j++;
	}
}
void timSort(int arr[],int n){
	for(int i=0;i<n;i+=RUN){
		insertionSort(arr,i,std::min((i+31),(n-1)));
	}
	for(int size=RUN;size<n;size=2 * size){
		for(int left=0;left<n;left+=2 * size){
			int mid = left + size - 1;
			int rigth=std::min((left + 2 * size - 1),(n - 1));
			merge(arr,left,mid,rigth);
		}
	}
	printArray(arr,n);
}
int main(int argc, char** argv) {
    int arr[]={3,4,5,6,3,1,1,23,5,546,34,3,2,2};
    int len=sizeof(arr)/sizeof(arr[0]);
    timSort(arr,len);
    return 0;
}
