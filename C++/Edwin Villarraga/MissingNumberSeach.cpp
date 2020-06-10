#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;
static int MissingNoSearch(int arr[],int n){
int x1=arr[0];
int x2=1;
	for(int i=1;i<n;++i){
		x1=x1^arr[i];
	}
	for(int i=2;i<=n+1;++i){
		x2=x2^i;
	}
return (x1^x2);
}
int main(int argc, char const *argv[]) {
    int arr[]={1,3,4,5,6,7};
    int n=sizeof(arr)/sizeof(arr[0]);
    printf("El numero faltante es : %d",MissingNoSearch(arr,n));
	return 0;
}
