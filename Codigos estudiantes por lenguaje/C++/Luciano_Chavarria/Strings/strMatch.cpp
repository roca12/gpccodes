using namespace std;
#include<bits/stdc++.h>
#include<cstdlib>
#define FAST ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(0);
#define Afill(x,y) memset(x,y,sizeof x)
bool strMatch(string str,string pat,int n,int m){
    if(m==0){
        return n==0;
    }
    bool lookup[n+1][m+1];
    for(int i=0;i<n+1;i++){
        Afill(lookup[i],false);
    }
    lookup[0][0]=true;
    for(int j=1;j<=m;j++){
        if(pat[j-1]=='*'){
            lookup[0][j]=lookup[0][j-1];
        }
    }
    for(int i=1;i<=n;i++){
        for(int j=1;j<=m;j++){
            if(pat[j-1]=='*'){
                lookup[i][j]=lookup[i][j-1]||lookup[i-1][j];
            }else if(pat[j-1]=='?' || str[i-1]==pat[j-1]){
                lookup[i][j]=lookup[i-1][j-1];
            }else{
                lookup[i][j]=false;
            }
        }
    }
    return lookup[n][m];
}
int main() {
    FAST
    string str="baaaaababa";
    string pat="ba*******?";
    if(strMatch(str,pat,str.size(),pat.size())){
        cout<<"Si"<<endl;
    }else{
        cout<<"No"<<endl;
    }
}
