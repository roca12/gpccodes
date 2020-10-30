#include <iostream>
#include <string.h>

using namespace std;

const int MAX = 256;

bool compare(char arr1[], char arr2[]){
	for(int i = 0; i < MAX; i++){
		if(arr1[i] != arr2[i]){
			return false;
		}
	}
	return true;
}

void anagramsSearch(string pat, string txt){
	int M = pat.size();
	int N = txt.size();
	char countP[MAX];
	char countTX[MAX];
	memset(countP,0 , MAX);
	memset(countTX, 0, MAX);
	for(int i = 0; i < M; i++){
		countP[pat[i]]++;
		countTX[txt[i]]++;
	}
	for(int i = M; i < N; i++){
		if(compare(countP, countTX)){
			cout << "Encontrado en el indice "<<(i - M)<<" Anagrama: "<<txt.substr(i - M, M)<<endl;
		}
		countTX[txt[i]]++;
		countTX[txt[i - M]]--;
	}
	if(compare(countP, countTX)){
		cout<<"Encontrado en el indice "<<(N - M) <<" Anagrama: "<< txt.substr(N - M, N) << endl;
	}
}

int main()
{
	string txt = "anitalavalatinaanilegustviajarnitatani";
	string pat = "anita";
	anagramsSearch(pat, txt);
	return 0;
}
