#include <cstdlib>
#include <bits/stdc++.h>
using namespace std;

int main(int argc, char const *argv[])
{

    int casos, aux = 1;
    cin >> casos;
    for (int i = 0; i < casos; i++)
    {
        vector<int> lista;
        int muros, num, c1 = 0, c2 = 0;
        cin >> muros;
        for (int j = 0; j < muros; j++)
        {
            cin >> num;
            lista.push_back(num);
        }

        for (int k = 1; k < lista.size(); k++)
        {
            if (lista[k] > lista[k - 1])
            {
                c1++;
            }
            else if (lista[k - 1] > lista[k])
            {
                c2++;
            }
        }
        cout << "Case " << aux << ": " << c1 << " " << c2 << endl;
        lista.clear();
        aux++;
    }
    return 0;
}
