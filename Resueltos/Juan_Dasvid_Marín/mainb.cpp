#include <iostream>
using namespace std;

int arr[105][2];
int c = 1000000007;

int main()
{
    int f;
    int k;
    int y;
    arr[0][0] = 1;
    scanf("%i %i %i", &f, &k, &y);
    for(int i = 0; i < f; i++)
    {
        for(int j = 1; j <= k && i + j <= f; j++)
        {
            if(y > j) arr[i + j][0] = (arr[i + j][0] % c + arr[i][0] % c) % c;
            else
            arr[i + j][1] = (arr[i + j][1] % c + arr[i][0] % c) % c;
            arr[i + j][1] = (arr[i + j][1] % c + arr[i][1] % c) % c;
        }
    }
    printf("%d\n", arr[f][1]);
}

// PUTA F ERA N