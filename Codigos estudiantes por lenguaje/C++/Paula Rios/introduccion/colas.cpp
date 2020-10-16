#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;

int main( ) {
	//crear cola
	queue<int>cola;
	for(int i=0;i<10;i++){
		cola.push(i);
	}
	while (!cola.empty()){
		//muestra el primero
		cout<<cola.front()<<" ";
		//elimina 
		cola.pop();
	}
	
}
