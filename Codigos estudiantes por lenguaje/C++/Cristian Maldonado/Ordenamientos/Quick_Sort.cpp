#include<bits/stdc++.h>
#include<cstdlib>

using namespace std;

int partition (int arr [], int low, int high){
	int pivot = arr[high];
	int i = low - 1;
	for(int j = low; j < high; j++){
		if(arr[j] <= pivot){
			i++;
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	int temp = arr[i + 1];
	arr[i + 1] = arr[high];
	arr[high] = temp;
	return i + 1;
}
void quickSort(int arr[], int low, int high){
	if(low < high){
		int pivot = partition(arr, low, high);
		quickSort(arr, low, pivot - 1);
		quickSort(arr, pivot + 1, high);
	}
}

int main (int argc, char *argv[]) {
	string entrada;
	getline(cin, entrada);
	string intermediate;
    vector<int> vec;
    stringstream check1(entrada);
    while(getline(check1, intermediate, ' ')) {
	  vec.push_back(atoi(intermediate.c_str()));
    }
    int arr[vec.size()];
	for(int i = 0; i < vec.size(); i++){
        arr[i] = vec[i];
	}
	quickSort(arr, 0, sizeof(arr)/sizeof(arr[0])-1);
	for(int j = 0; j < vec.size(); j++){
		cout << arr[j] << " ";
	}
	return 0;
}
