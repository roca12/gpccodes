#include<iostream>
using namespace std;

bool findPair(int arr[], int n, int size){
	int i = 0, j = 1;
	while(i < size && j <size){
		if(i!=j && arr[j]-arr[i] == n){
			cout << "Par encontrado: ("<<arr[i]<<", "<<arr[j]<<")"<<endl;
			return true;
		}else if(arr[j]-arr[i]<n){
			j++;
		}else{
			i++;
		}
	}
	cout<<"Par no encontrado"<<endl;
	return false;
}

int main (int argc, char *argv[]) {
	int arr[] = {1,8,30,40,100};
	int resultadodeseado = 10;
	findPair(arr,resultadodeseado, sizeof(arr)/sizeof(0));
	return 0;
}
