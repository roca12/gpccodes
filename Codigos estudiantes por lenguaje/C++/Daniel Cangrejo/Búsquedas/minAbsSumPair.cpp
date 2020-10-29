#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;
void minAbsSumPair(int arr[],int n){
	int l,r,min_sum,sum,min_l,min_r;
	if(n<2){
		printf("Entrada no valida");
	}
	min_l=0;
	min_r=1;
	min_sum=arr[0]+arr[1];
	for(l=0;l<n-1;++l){
		for(r=l+1;r<n;++r){
			sum=arr[l]+arr[r];
			if(std::abs(min_sum)>std::abs(sum)){
				min_sum=sum;
				min_l=l;
				min_r=r;
			}
		}
	}
	printf("Los numero que tienen la minima suma son %d %d",arr[min_l],arr[min_r]);
}
int main(int argc, char const *argv[]) {
	int arr[]={1,-2,-10,70,-80,85};
	int n =sizeof(arr)/sizeof(arr[0]);
	minAbsSumPair(arr,n);

    return 0;
}
