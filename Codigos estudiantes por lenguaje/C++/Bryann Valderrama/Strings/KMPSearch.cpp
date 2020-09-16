#include <cstdlib>
#include <bits/stdc++.h>
using namespace std;

void computeLPSArray(string pat, int M, int lps[])
{
    int len = 0;
    int i = 1;
    while (i < M)
    {
        if (pat[i] == pat[len])
        {
            len++;
            lps[i] = len;
            i++;
        }
        else
        {
            if (len != 0)
            {
                len = lps[len - 1];
            }
            else
            {
                lps[i] = len;
                i++;
            }
        }
    }
}

void KMPsearch(string pat, string txt)
{
    int M = pat.length();
    int N = txt.length();
    int lps[M];
    int j = 0;
    computeLPSArray(pat, M, lps);
    int i = 0;
    while (i < N)
    {
        if (pat[j] == txt[i])
        {
            i++;
            j++;
        }
        if (j == M)
        {
            cout << "Encontrado patron (" << pat << ") en el indice " << i - j << " - " << (i - j) + M - 1 << endl;
            j = lps[j - 1];
        }
        else if (i < N && pat[j] != txt[i])
        {
            if (j != 0)
            {
                j = lps[j - 1];
            }
            else
            {
                i++;
            }
        }
    }
}

void variasBusquedas(string arr[], string txt, int tam)
{
    for (int i = 0; i < tam; i++)
    {
        KMPsearch(arr[i], txt);
    }
}

int main(int argc, char const *argv[])
{
    string txt = "anita lava la tina";
    string arr[] = {"anita", "la"};
    int tam = (sizeof(arr) / sizeof(arr[0]));
    variasBusquedas(arr, txt, tam);
    return 0;
}
