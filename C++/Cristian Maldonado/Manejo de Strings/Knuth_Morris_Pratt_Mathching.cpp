#include <iostream>
#include <string.h>

using namespace std;

void computeLPSArray(string pat, int M, int lps[]){
    int len = 0, i = 1;
    lps[0] = 0;
    while(i < M){
        if(pat[i] == pat[len]){
            len++;
            lps[i] = len;
            i++;
        }else{
            if(len != 0){
                len = lps[len - 1];
            }else{
                lps[i] = len;
                i++;
            }
        }
    }
}

void KMPSearch(string pat, string txt){
    int M = pat.size();
    int N = txt.size();
    int lps[M];
    int j = 0;
    computeLPSArray(pat, M, lps);
    int i = 0;
    while(i < N){
        if(pat[j] == txt[i]){
            i++;
            j++;
        }
        if(j == M){
            cout << "Encontrado patron (" << pat<<") en el indice "<<(i - j)<<"-"<<(i - j)+ (M - 1)<<endl;
            j = lps[j - 1];
        }else if(i < N && pat[j] != txt[i]){
            if(j != 0){
                j = lps[j - 1];
            }else{
            i++;
            }
        }
    }
}

void variasBusquedas(string arr[], string txt, int tam){
    for(int i = 0; i < tam; i++){
        KMPSearch(arr[i], txt);
    }
}

int main()
{
    string txt = "anitalavalatinacontinaynita";
    string arr[] = {"ani", "nita", "la", "tin"};
    variasBusquedas(arr, txt, sizeof(arr)/sizeof(arr[0]));
    return 0;
}
