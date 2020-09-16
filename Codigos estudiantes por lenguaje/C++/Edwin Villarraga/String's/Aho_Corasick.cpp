#include<bits/stdc++.h>
#include<cstdlib>
#define MAXS 500    //maximo del texto
#define MAXC 26     //
using namespace std;
int out[MAXS];
int f[MAXS];
int g[MAXS][MAXC];
int MachingMachine(string arr[],int k){
    memset(out,0,sizeof out);
    memset(g,-1,sizeof g);
    int state =1;
    for(int i=0;i<k;i++){
        const string &word=arr[i];
        int currentState=0;
        for(int j=0;j<word.size();j++){
            int ch=word[j]-'a';
            if(g[currentState][ch]==-1){
                g[currentState][ch]=state++;
                 currentState=g[currentState][ch];
            }
        }
            out[currentState]|=(1<<i);

        }
        for(int ch=0;ch<MAXC;++ch){
            if(g[0][ch]==-1){
                g[0][ch]=0;
            }
        }
        memset(f,-1,sizeof f);
        queue<int>q;
        for(int ch=0;ch<MAXC;++ch){
            if(g[0][ch]!=0){
                f[g[0][ch]]=0;
                q.push(g[0][ch]);
            }
        }
        //DFS
        while(!q.empty()){
            int state=q.front();
            q.pop();
            for(int ch=0;ch<=MAXC;++ch){
                if(g[state][ch]!=-1){
                    int failure=f[state];
                    while(g[failure][ch]==-1){
                        failure=f[failure];
                    }
                    failure = g[failure][ch];
                    f[g[state][ch]] = failure;
                    out[g[state][ch]] |= out[failure];
                    q.push(g[state][ch]);
                }
            }
        }
        return state;
}
int findNextState(int currentState, char nextInput) {
    int answer = currentState;
    int ch = nextInput - 'a';
    while (g[answer][ch] == -1) {
        answer = f[answer];
    }
    return g[answer][ch];
}
void searchWords(string arr[], int k, string text) {
    MachingMachine(arr, k);
    int currentState = 0;
    for (int i = 0; i < text.size(); ++i) {
        currentState = findNextState(currentState, text[i]);
        if (out[currentState] == 0){
             continue;
        }

        for (int j = 0; j < k; ++j) {
            if (out[currentState] & (1 << j)) {
                cout << "palabra " << arr[j] << " encontrada entre "
                     << i - arr[j].size() + 1 << " y " << i << endl;
            }
        }
    }
}
int main() {
    string arr[] = {"he", "she", "hers", "his"};
    string text = "ahishers";
    int k = sizeof(arr)/sizeof(arr[0]);

    searchWords(arr, k, text);
}
