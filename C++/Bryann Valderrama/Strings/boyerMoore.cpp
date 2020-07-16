#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;
#define NO_OF_CHARS 256

int maximo(int a, int b)
{
    return (a > b) ? a : b;
}
//string str
void badCharHeuristic(char str[], int tam, int badchar[])
{
    int i;
    for (i = 0; i < NO_OF_CHARS; i++)
    {
        badchar[i] = -1;
    }

    for (i = 0; i < tam; i++)
    {
        badchar[(int)str[i]] = i;
    }
}
//string txt  string pat
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
        while (j >= 0 && pat[j] == txt[s + j])
        {
            j--;
        }
        if (j < 0)
        {
            cout << "Patron encontrado encontrado en salto " << s << endl;
            s += (s + m < m) ? m - badchar[txt[s + m]] : 1;
        }
        else
        {
            s += maximo(1, j - badchar[txt[s + j]]);
        }
    }
}

int main(int argc, char const *argv[])
{
    string txt1 = "holacomoestasholahola";
    int n = txt1.length();
    char txt[n + 1];
    strcpy(txt, txt1.c_str());
    string pat1 = "hola";
    int n2 = pat1.length();
    char pat[n2 + 1];
    strcpy(pat, pat1.c_str());
    //Directamente con arreglo de char
    // char txt[] = "holacomoestasholahola";
    // char pat[] = "hola";
    boyerMoore(txt, pat);
    return 0;
}
