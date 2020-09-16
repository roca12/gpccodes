#include <cstdlib>
#include <bits/stdc++.h>
using namespace std;
int cont = 0;

void printSubsets(string set[], int n)
{
    for (int i = 0; i < (1 << n); i++)
    {
        cout << "{";
        for (int j = 0; j < n; j++)
        {
            if ((i & (i << j)) > 0)
            {
                cout << set[j] << " ";
            }
        }
        cout << "}" << endl;
        cont++;
    }
}

int main(int argc, char const *argv[])
{
    string letras[] = {"a", "b", "c", "d"};
    int n = sizeof(letras) / sizeof(letras[0]);
    printSubsets(letras, n);
    cout << "Total: " << cont << endl;
    return 0;
}
