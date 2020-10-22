#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;

int main(int argc, char *argv[]) {
	
	int rep, tamanio;
	cin>>rep;
	char W='W',L='L',D='D',Q='?';
	for(int i=0; i<rep; i++){
		int teamA=0, teamB=0, matches=0;
		cin>>tamanio;
		for(int j=0; j<tamanio; j++){
			char letra;
			cin>>letra;
			if(letra==W)teamA+=3;
			else if(letra==L)teamB+=3;
			else if(letra==D){
				teamA+=1;
				teamB+=1;
			}
			else if(letra==Q)matches+=1;
		}
		if(matches>0){
			int cont =0;
			while(teamA <= teamB && matches !=0){
				teamA+=3;
				matches--;
				cont++;
			}    
			if(teamA<=teamB)cout<<"-1"<<endl;
			else cout<<cont<<endl;
		}else{
			if(teamA<=teamB)cout<<"-1"<<endl;
			else cout<<"0"<<endl;
		}        
	}    
	return 0;
}
