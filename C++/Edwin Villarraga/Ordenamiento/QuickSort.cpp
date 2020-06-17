#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;
int partition (int arr[], int low, int high) { 
    int pivot = arr[high];
    int i = (low - 1);
  
    for (int j = low; j <= high- 1; j++) { 
        if (arr[j] <= pivot) { 
            i++;
           int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
        } 
    } 
   int temp=arr[i+1];
	arr[i+1]=arr[high];
	arr[high]=temp;
    return (i + 1); 
} 
  

void quickSort(int arr[], int low, int high) { 
    if (low < high) { 

        int pi = partition(arr, low, high); 

        quickSort(arr, low, pi - 1); 
        quickSort(arr, pi + 1, high); 
    } 
} 
void print(int arr[],int n){
	for(int i=0;i<n;++i){
		printf("%d ",arr[i]);
	}
	cout<<"\n";
}
int main(int argc, char const *argv[]) {
	int arr[]={9,8,7,6,5,4,3,2,1,0};
	int n=sizeof(arr)/sizeof(arr[0]);
	quickSort(arr,0,n-1);
	print(arr,n);
	return 0;
}
