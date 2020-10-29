#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;
static int jumpSearch(int arr[],int x,int n){
	int step=int(std::floor(std::sqrt(n)));
	int prev =0;
	while(arr[std::min(step,n)-1]<x){
		prev=step;
		step+=int(std::floor(std::sqrt(n)));
		if(prev>=n){
			return -1;
		}
	}
	while(arr[prev]<x){
		prev++;
		if(prev==std::min(step,n)){
			return -1;
		}
	}
	if(arr[prev]==x){
		return prev;
	}
	return -1;
			
}
int main(int argc, char const *argv[]) {
    int arr[] = {1, 2, 3, 4, 5};
    int n = sizeof (arr) / sizeof (arr[0]);
    int x=5;
    int result = jumpSearch(arr, x,n);
    if (result < 0) {
        cout << "El elemento no esta presente en el Array" << endl;
    } else {
        cout << "Elemento encontrado en el indice " << result << endl;
    }

    return 0;
}
