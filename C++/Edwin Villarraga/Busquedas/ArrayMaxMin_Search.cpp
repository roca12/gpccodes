#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;
struct pairMaxMin { 
  int min; 
  int max; 
};   
static pairMaxMin getMinMax(int arr[], int n) { 
pairMaxMin minmax;      
  int i; 
    
  if (n == 1) { 
     minmax.max = arr[0]; 
     minmax.min = arr[0];      
     return minmax; 
  }     
  if (arr[0] > arr[1])   {
      minmax.max = arr[0]; 
      minmax.min = arr[1]; 
  }   else{ 
      minmax.max = arr[1]; 
      minmax.min = arr[0]; 
  }     
  for (i = 2; i<n; i++) { 
    if (arr[i] >  minmax.max)   {
      minmax.max = arr[i]; 
	  }
    else if (arr[i] <  minmax.min)   {
      minmax.min = arr[i]; 
  	}
  } 
    
  return minmax; 
} 
int main(int argc, char** argv) {
	int arr[]={12,3,4,345,65,43};
	int len=sizeof(arr)/sizeof(arr[0]);
	pairMaxMin minmax = getMinMax (arr,len); 
	printf("el minimo elemento es %d\n", minmax.min); 
 	printf("el maximo elemento es %d\n", minmax.max); 
	return 0;
}
