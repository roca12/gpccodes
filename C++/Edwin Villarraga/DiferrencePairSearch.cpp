#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;
static bool findPair(int arr[],int n,int size){
int i=0,j=1;
while(i<size && j < size){
	if(i!=j && arr[j]-arr[i] ==n){
		printf("par encontrado (%d %d)",arr[i],arr[j]);
		return true;
	}else if(arr[j]-arr[i] <n ){
		j++;
	}else{
		i++;
	}
}
printf("no hay par que de el numero");
return false;
}
int main(int argc, char const *argv[]) {
	int arr[]={1,8,30,40,100};
	int n=7;
	int size=sizeof(arr)/sizeof(arr[0]);
	findPair(arr,n,size);
	return 0;
}
