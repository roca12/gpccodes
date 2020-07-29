#include <cstdlib>
#include<bits/stdc++.h>
#define MAX 256
using namespace std;
#include <bits/stdc++.h>
#include <cstdlib>
//recursivo vale verga :3
using namespace std; 
typedef long long int ll;
int main(){
	int c;
	cin>>c;
	while(c--){
		int cont=0;
		int len;
		cin>>len;
		int arr[len];
		for(int i=0;i<len;++i){
			cin>>arr[i];
			}
		for(int j=0;j<len;j++){
			for(int i=0;i<len-1;i++){
			if(arr[i]>arr[i+1]){
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				cont++;
					}	
				}
			}
		cout<<"Optimal train swapping takes "<<cont<<" swaps."<<endl;
		cont=0;
	}
    return 0; 
}
