#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;
static pair<int,int> getMinMax(int arr[],int n){
	pair <int,int> minmax;
	   int i;
  if (n == 1) { 
     minmax.second = arr[0]; 
     minmax.first = arr[0];      
     return minmax; 
  }     
  if (arr[0] > arr[1])   {
      minmax.second = arr[0]; 
      minmax.first = arr[1]; 
  }   else{ 
      minmax.second = arr[1]; 
      minmax.first = arr[0]; 
  }     
  for (i = 2; i<n; i++) { 
    if (arr[i] >  minmax.second)   {
      minmax.second = arr[i]; 
	  }
    else if (arr[i] <  minmax.first)   {
      minmax.first = arr[i]; 
  	}
  } 
    
  return minmax; 
}
int main(int argc, char** argv) {
	int arr[]={12,3,4,345,65,43};
	int len=sizeof(arr)/sizeof(arr[0]);
	pair <int,int>minmax (getMinMax(arr,len));
	printf("el minimo elemento es %d\n",minmax.first);
	printf("el maximo elemento es %d\n",minmax.second);
	return 0;
}
