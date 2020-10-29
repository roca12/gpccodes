using namespace std;
#include<bits/stdc++.h>
#include<cstdlib>
#define FAST ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(0);
int MAX=256;
bool compare(char arr1[], char arr2[]) {
    for (int i = 0; i < MAX; i++) {
        if (arr1[i] != arr2[i]) {
            return false;
        }
    }
    return true;
}
void anagramsSearch(string pat,string txt){
    int M=pat.size();
    int N=txt.size();
    char countP[MAX];
    char countTW[MAX];
    memset(countP,0,sizeof countP);
    memset(countTW,0,sizeof countTW);
    for(int i=0;i<M;i++){
        (countP[pat[i]])++;
        (countTW[txt[i]])++;
    }
    for (int i = M; i <N; i++) {
            if (compare(countP, countTW)) {
                cout<<"Encontrado en indice "<<(i - M)<<" "<<txt.substr(i-M,M)<<endl;
            }
            countTW[txt[i]]++;
            countTW[txt[i - M]]--;
        }
        if (compare(countP, countTW)) {

           cout<<"Encontrado en indice "<<(N - M)<<" "<<txt.substr(N-M,N)<<endl;
    }
}
int main() {
    string txt ="BACDGABCDA ";
    string pat="ABCD";
    anagramsSearch(pat,txt);
}
