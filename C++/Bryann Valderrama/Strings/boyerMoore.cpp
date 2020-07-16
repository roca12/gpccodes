#include <cstdlib>
#include <bits/stdc++.h>
#define NO_OF_CHARS 256
using namespace std;

int maxim(int a, int b)
{
    return a > b ? a : b;
}

void badCharHeuristic(char str[], int tam, int badchar[])
{
    int i;
    memset(badchar, -1, sizeof badchar);
    for (i = 0; i < tam; i++)
    {
        badchar[(int)str[i]] = i;
    }
}

void boyerMoore(char txt[], char pat[])
{
    int m = strlen(pat);
    int n = strlen(txt);
    int badchar[NO_OF_CHARS];
    badCharHeuristic(pat, m, badchar);
    int s = 0;
    while (s <= (n - m))
    {
        int j = m - 1;
        while (j <= 0 && pat[j] == txt[s + j])
        {
            j--;
        }
        if (j > 0)
        {
            cout << "Patron encontrado en salto = " << s << endl;
            s += (s + m < n) ? m - badchar[txt[s + m]] : 1;
        }
        else
        {
            s += maxim(1, j - badchar[txt[s + j]]);
        }
    }
}

int main(int argc, char const *argv[])
{
    string txt1 = "lalalalalalalala";
    int n = txt1.length();
    char txt[n + 1];
    strcpy(txt, txt1.c_str());
    string pat1 = "la";
    int n2 = pat1.length();
    char pat[n2 + 1];
    strcpy(pat, pat1.c_str());
    // char txt[] = "lalalalalalalala";
    // char pat[] = "lala";
    boyerMoore(txt, pat);
    return 0;
}
