#include <cstdlib>
#include <bits/stdc++.h>
using namespace std;

bool strMatch(string str, string pattern, int n, int m)
{
    if (m == 0)
    {
        return n == 0;
    }
    bool lookup[n + 1][m + 1];
    memset(lookup, false, sizeof lookup);
    lookup[0][0] = true;
    for (int j = 1; j < m + 1; j++)
    {
        if (pattern[j - 1] == '*')
        {
            lookup[0][j] = lookup[0][j - 1];
        }
    }
    for (int i = 1; i < n + 1; i++)
    {
        for (int j = 1; j < m + 1; j++)
        {
            if (pattern[j - 1] == '*')
            {
                lookup[i][j] = lookup[i][j - 1] || lookup[i - 1][j];
            }
            else if (pattern[j - 1] == '?' || str[i - 1] == pattern[j - 1])
            {
                lookup[i][j] = lookup[i - 1][j - 1];
            }
            else
            {
                lookup[i][j] = false;
            }
        }
    }
    return lookup[n][m];
}

int main(int argc, char const *argv[])
{
    string str = "baaabab";
    string pattern = "b?*aba?";
    if (strMatch(str, pattern, str.size(), pattern.size()))
    {
        cout << "Si" << endl;
    }
    else
    {
        cout << "No" << endl;
    }
    return 0;
}
