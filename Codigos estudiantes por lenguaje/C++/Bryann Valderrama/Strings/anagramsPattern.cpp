#include <cstdlib>
#include <bits/stdc++.h>
using namespace std;
#define NO_OF_CHARS 256

bool compare(char arr1[], char arr2[])
{
    for (int i = 0; i < NO_OF_CHARS; i++)
    {
        if (arr1[i] != arr2[i])
        {
            return false;
        }
    }
    return true;
}

void anagramsSearch(string pat, string txt)
{
    int M = pat.size();
    int N = txt.size();
    char countP[NO_OF_CHARS];
    char countTW[NO_OF_CHARS];
    //Inicializar los arreglos
    memset(countP, 0, sizeof countP);
    memset(countTW, 0, sizeof countTW);
    for (int i = 0; i < M; i++)
    {
        countP[pat[i]]++;
        countTW[txt[i]]++;
    }
    for (int i = M; i < N; i++)
    {
        if (compare(countP, countTW))
        {
            cout << "Encontrado en indice " << i - M << " | Anagrama: " << txt.substr(i - M, M) << endl;
        }
        countTW[txt[i]]++;
        countTW[txt[i - M]]--;
    }
    if (compare(countP, countTW))
    {
        cout << "Encontrado en indice " << N - M << " | Anagrama: " << txt.substr(N - M, N) << endl;
    }
}

int main(int argc, char const *argv[])
{
    string txt = "anitalavalatina";
    string pat = "la";
    anagramsSearch(pat, txt);
    return 0;
}
