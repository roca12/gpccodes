#include <cstdlib>
#include <bits/stdc++.h>
using namespace std;

int main(int argc, char const *argv[])
{
    string s;
    while (getline(cin, s))
    {
        int num;
        char chr;
        int len = s.size();
        vector<int> arr;
        for (int i = 0; i < len; i++)
        {
            num = s[i];
            num = num - 7;
            arr.push_back(num);
        }
        for (int i = 0; i < arr.size(); i++)
        {
            chr = arr[i];
            cout << chr;
        }
        cout << endl;
    }
    return 0;
}
