#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
const int NO_OF_CHARS=256;
int MAX(int a,int b){
    return (a > b) ? a : b;
}
void badCharHeuristic(char str[],int siz,int badchar[]){
    int i;
    memset(badchar,-1,sizeof badchar);
    for(i=0;i<siz;i++){
        badchar[(int) str[i]]=i;
    }
}
void boyerMoore(char txt[],char pat[]){
    int m=strlen(pat);
    int n=strlen(txt);
    int badchar[NO_OF_CHARS];
    badCharHeuristic(pat,m,badchar);
    int s=0;
    while(s <=(n-m)){
        int j=m-1;
        while(j >=0 && pat[j]==txt[s+j]){
            j--;
        }
        if(j<0){
            cout<<"Patron encontrado encontrado en salto "<<s<<endl;
            s+=(s+m < m)? badchar[txt[s+m]] : 1 ;
        }else{
            s+= MAX(1,j-badchar[txt[s+j]]);
        }
    }
}
int main() {
        char txt[]="que hace aqui pvto";
        char pat[]="ha";
        boyerMoore(txt, pat);
}
