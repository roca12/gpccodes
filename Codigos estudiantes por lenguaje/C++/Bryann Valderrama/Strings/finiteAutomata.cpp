#include <cstdlib>
#include <bits/stdc++.h>
using namespace std;
#define NO_OF_CHARS 256

int getNextState(char pat[], int M, int state, int x)
{
    if (state < M && x == pat[state])
    {
        return state + 1;
    }
    int ns, i;
    for (ns = state; ns > 0; ns--)
    {
        if (pat[ns - 1] == x)
        {
            for (i = 0; i < ns - 1; i++)
            {
                if (pat[i] != pat[state - ns + 1 + i])
                {
                    break;
                }
            }
            if (i == ns - 1)
            {
                return ns;
            }
        }
    }
    return 0;
}

void computeTF(char pat[], int M, int TF[NO_OF_CHARS][NO_OF_CHARS])
{
    int state, x;
    for (state = 0; state <= M; state++)
    {
        for (x = 0; x < NO_OF_CHARS; x++)
        {
            TF[state][x] = getNextState(pat, M, state, x);
        }
    }
}

void finiteAutomata(char pat[], char txt[])
{
    int M = strlen(pat);
    int N = strlen(txt);
    int TF[M + 1][NO_OF_CHARS];
    computeTF(pat, M, TF);
    int i, state = 0;
    for (i = 0; i < N; i++)
    {
        state = TF[state][txt[i]];
        if (state == M)
        {
            cout << "Patron encontrado en indice " << i - M + 1 << " - " << i << endl;
        }
    }
}

int main(int argc, char const *argv[])
{
    char pat[] = {"looloolo"};
    char txt[] = {"olo"};
    finiteAutomata(txt, pat);
    return 0;
}
