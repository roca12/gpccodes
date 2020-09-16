using namespace std;

#include <iostream>
#include <string.h>
#define FAST ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(0);

const int d = 256;

void rabinKarp(string pat, string txt, int q){
    int M = pat.size();
    int N = txt.size();
    int i, j, p = 0, t = 0, h = 1;
    for(i = 0; i < M - 1; i++){
        h = (h * d) % q;
    }
    for(i = 0; i < M; i++){
        p = (d * p + pat[i]) % q;
        t = (d * t + txt[i]) % q;
    }
    for(i = 0; i <= N - M; i++){
        if(p == t){
            for(j = 0; j < M; j++){
                if(txt[i + j] != pat[j]){
                    break;
                }
            }
            if(j == M){
                cout << "Patron encontrado en el indice " << i << " - "<<(i + M - 1)<<endl;
            }
        }
        if(i < N - M){
            t = (d * (t - txt[i] * h) + txt[i + M]) % q;
            if(t < 0){
                t += q;
            }
        }
    }
}

int main()
{
    FAST
    string txt = "anitalavalatinacontinaynita";
    string pat = "ni";
    rabinKarp(pat, txt, d);
    return 0;
}
