#include <bits/stdc++.h>
#include <cstdlib>

using namespace std;
void print(bool arr[])
{
    for (int i = 0; i < 13; i++)
    {
        cout << i << ": " << arr[i] << endl;
    }
}

void divisibility(int num)
{
    stringstream ss;
    ss << num;
    string M;
    ss >> M;
    int n = M.size();
    bool isMultipleOf[13];
    memset(isMultipleOf, false, sizeof isMultipleOf);
    int sum = 0;
    for (int i = 0; i < n; i++)
    {
        sum += (M[i] - '0');
    }
    int lastDigit = M[n - 1] - '0';
    isMultipleOf[0] = false;
    isMultipleOf[1] = true;
    isMultipleOf[2] = lastDigit % 2 == 0;
    isMultipleOf[3] = sum % 3 == 0;
    if (n > 1)
    {
        isMultipleOf[4] = stoi(M.substr(n - 2, n)) % 4 == 0;
    }
    else
    {
        isMultipleOf[4] = lastDigit % 4 == 0;
    }
    isMultipleOf[5] = lastDigit == 0 || lastDigit == 5;
    isMultipleOf[6] = isMultipleOf[2] && isMultipleOf[3];
    int altSum = 0;
    int pattern[] = {1, 3, 2, -1, -3, -2};
    int j = 0;
    for (int i = n - 1; i >= 0; i--)
    {
        altSum += pattern[j] * (M[i] - '0');
        j = (j + 1) % 6;
    }
    isMultipleOf[7] = abs(altSum) % 7 == 0;
    if (n > 2)
    {
        isMultipleOf[8] = stoi(M.substr(n - 3, n)) % 8 == 0;
    }
    else
    {
        isMultipleOf[8] = stoi(M) % 8 == 0;
    }
    isMultipleOf[9] = sum % 8 == 0;
    isMultipleOf[10] - lastDigit == 0;
    altSum = 0;
    int s = 1;
    for (int i = n - 1; i >= 0; i--)
    {
        altSum += s * (M[i] - '0');
        s = -s;
    }
    isMultipleOf[11] = abs(altSum) % 11 == 0;
    isMultipleOf[12] = isMultipleOf[3] && isMultipleOf[4];
    print(isMultipleOf);
}

int main(int argc, char const *argv[])
{
    divisibility(123);
    return 0;
}
