using namespace std;
#include<bits/stdc++.h>
#include<cstdlib>
#define FAST ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(0);cout<<setprecision(25);
int d=256;
void rabinKarp(string pat,string txt,int q){
    int M=pat.size();
    int N=txt.size();
    int i,j;//indices
    int p=0;
    int t=0;
    int h=1;//tamanio del hash
    for(i=0;i<M-1;i++){
        h=(h*d)%q;
    }
    for(i=0;i<M;i++){
        p=(d*p+pat[i])%q;
        t=(d*i+txt[i])%q;
    }
    for(i=0;i<=N-M;i++){
        if(p==t){
            for(j=0;j<M;j++){
                if(txt[i+j]!=pat[j]){
                    break;
                }
            }
            if(j==M){
                cout<<"Patron encontrado en el indice "<<i<<" "<<(i+M-1)<<endl;
            }
        }
        if(i<N-M){
            t=(d*(t-txt[i]*h)+txt[i+M])%q;
            if(t<0){
                t=(t+q);
            }
        }
    }
}
int main() {
    FAST
    string txt="anita lava la tina";
    string pat="la";
    rabinKarp(pat,txt,d);
}
