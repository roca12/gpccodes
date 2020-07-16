#include <cstdlib>
#include <bits/stdc++.h>
using namespace std;
#define d 256

void rabinKarp(string pat, string txt, int q)
{
    int M = pat.size();
    int N = txt.size();
    int i, j;
    int p = 0;
    int t = 0;
    int h = 1;
    for (i = 0; i < M - 1; i++)
    {
        h = (h * d) % q;
    }
    for (i = 0; i < M; i++)
    {
        p = (d * p + pat[i]) % q;
        t = (d * t + txt[i]) % q;
    }
    for (i = 0; i <= N - M; i++)
    {
        if (p == t)
        {
            for (j = 0; j < M; j++)
            {
                if (txt[i + j] != pat[j])
                {
                    break;
                }
            }
            if (j == M)
            {
                cout << "Patron encontrado en el indice " << i << " - " << i + M - 1 << endl;
            }
        }
        if (i < N - M)
        {
            t = (d * (t - txt[i] * h) + txt[i + M]) % q;
            if (t < 0)
            {
                t = (t+q);
            }
        }
    }
}

int main(int argc, char const *argv[])
{
    string txt = "Anita lava la tina";
    string pat = "la";
    rabinKarp(pat, txt, d);
    return 0;
}
