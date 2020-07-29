#include <cstdlib>
#include <bits/stdc++.h>
#define FAST                          \
    ios_base::sync_with_stdio(false); \
    cin.tie(NULL);
using namespace std;

void primeFactors(int num)
{
    int nega = 0;
    int posi = 0;
    vector<int> lista;
    if (num < 0)
    {
        nega = num;
        num = num * -1;
    }
    else
    {
        posi = num;
    }
    for (long p = 2; p * p <= num; p++)
    {
        while (num % p == 0)
        {
            lista.push_back(p);
            num /= p;
        }
    }
    if (num > 1)
    {
        lista.push_back(num);
    }
    if (nega < 0)
    {
        printf("%d = -1 x ", nega);
        int cont = 1;
        while (cont < lista.size())
        {
            for (int i = 0; i < lista.size() - 1; i++)
            {
                printf("%d x ", lista[i]);
                cont++;
            }
        }
        printf("%d\n", lista[lista.size() - 1]);
    }
    else
    {
        printf("%d = ", posi);
        int cont = 1;
        while (cont < lista.size())
        {
            for (int i = 0; i < lista.size() - 1; i++)
            {
                printf("%d x ", lista[i]);
                cont++;
            }
        }
        printf("%d\n", lista[lista.size() - 1]);
    }
}

int main(int argc, char const *argv[])
{
    FAST;
    int num;
    while (scanf("%d", &num) && num != EOF)
    {
        if (num == 0)
        {
            break;
        }
        primeFactors(num);
    }
    return 0;
}
