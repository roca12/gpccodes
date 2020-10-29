#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;
struct Node { 
    int key; 
    struct Node *left, *right; 
}; 
struct Node *newNode(int item) { 
    struct Node *temp = new Node; 
    temp->key = item; 
    temp->left = temp->right = NULL; 
    return temp; 
} 
void storeSorted(Node *root, int arr[], int &i) { 
    if (root != NULL) { 
        storeSorted(root->left, arr, i); 
        arr[i++] = root->key; 
        storeSorted(root->right, arr, i); 
    } 
} 
Node* insert(Node* node, int key) { 
    if (node == NULL){
		return newNode(key); 
	}
    if (key < node->key){
    	node->left  = insert(node->left, key); 
	}
    else if (key > node->key){
		node->right = insert(node->right, key); 
	}
    return node; 
} 
void printArray(int arr[],int n){
	for(int i=0;i<n;++i){
		printf("%d ",arr[i]);
	}
}
void treeSort(int arr[], int n) { 
    struct Node *root = NULL; 
  
    root = insert(root, arr[0]); 
    for (int i=1; i<n; i++) 
        root = insert(root, arr[i]); 
        
    int i = 0; 
    storeSorted(root, arr, i);
    printArray(arr,n);
} 
int main() {
	/*
	int arr[]={2,3,5,1,32,4,50};
	int n = sizeof(arr)/sizeof(arr[0]);
	treeSort(arr,n);
	*/
	string str;
    getline(cin,str);
    string intermediate;
    vector<int> vec;
    stringstream check1(str);
      while(getline(check1, intermediate, ' ')) {
	  vec.push_back(atoi(intermediate.c_str()));
    }
    int arr[vec.size()];
    for(int i=0;i<vec.size();++i){
    	arr[i]=vec[i];
	}
	treeSort(arr,vec.size());
	return 0;
}
