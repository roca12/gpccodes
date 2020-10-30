#include<bits/stdc++.h>
#include<cstdlib>
using namespace std;
void computeLPSArray(string pat,int M,int lps[]){
    int len=0;
    int i=1;
    lps[0]=0;
    while(i<M){
        if(pat[i]==pat[len]){
            len++;
            lps[i]=len;
            i++;
        }else{
            if(len !=0){
                len=lps[len-1];
            }
            else{
                lps[i]=len;
                i++;
            }
        }
    }
}
void KMPsearch(string pat,string txt){
    int M=pat.size();
    int N=txt.size();
    int lps[M];
    int j=0;
    computeLPSArray(pat,M,lps);
    int i=0;
    while(i<N){
        if(pat[j]==txt[i]){
            j++;
            i++;
        }
        if(j==M){
            printf("Patron encontrado en el indice %d - %d\n",(i-j),i);
            j=lps[j-1];
        }else if(i<N && pat[j]!=txt[i]){
            if(j!=0){
                j = lps[j-1];
            }else{
                i++;
            }
        }
    }
}
int main () {
    string txt="ABCABCABCABC";
    string pat="ABC";
    KMPsearch(pat,txt);
}
