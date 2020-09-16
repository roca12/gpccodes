#include <cstdlib>
#include <bits/stdc++.h>
using namespace std;
#define MAXS 500
#define MAXC 26
int out[MAXS];
int f[MAXS];
int g[MAXS][MAXC];

int buildMatchingMachine(string arr[], int k)
{
    memset(out, 0, sizeof out);
    for (int i = 0; i < MAXS; i++)
    {
        for (int j = 0; j < MAXC; j++)
        {
            g[i][j] = -1;
        }
    }
    //memset(g, -1, sizeof g);
    int states = 1;
    for (int i = 0; i < k; i++)
    {
        string word = arr[i];
        int currentState = 0;
        for (int j = 0; j < word.size(); j++)
        {
            int ch = word[j] - 'a';
            if (g[currentState][ch] == -1)
            {
                g[currentState][ch] = states++;
            }
            currentState = g[currentState][ch];
        }
        out[currentState] |= (1 << i);
    }
    for (int ch = 0; ch < MAXC; ch++)
    {
        if (g[0][ch] == -1)
        {
            g[0][ch] = 0;
        }
    }
    memset(f, -1, sizeof f);
    queue<int> q;
    for (int ch = 0; ch < MAXC; ch++)
    {
        if (g[0][ch] != 0)
        {
            f[g[0][ch]] = 0;
            //offer()
            q.push(g[0][ch]);
        }
    }
    while (!q.empty())
    {
        //poll()
        int state = q.front();
        q.pop();
        for (int ch = 0; ch < MAXC; ch++)
        {
            if (g[state][ch] != -1)
            {
                int failure = f[state];
                while (g[failure][ch] == -1)
                {
                    failure = f[failure];
                }
                failure = g[failure][ch];
                f[g[state][ch]] = failure;
                out[g[state][ch]] |= out[failure];
                q.push(g[state][ch]);
            }
        }
    }
    return states;
}

int findNextState(int currentState, char nextInput)
{
    int answer = currentState;
    int ch = nextInput - 'a';
    while (g[answer][ch] == -1)
    {
        answer = f[answer];
    }
    return g[answer][ch];
}

void searchWords(string arr[], int k, string text)
{
    buildMatchingMachine(arr, k);
    int currentState = 0;
    for (int i = 0; i < text.size(); i++)
    {
        currentState = findNextState(currentState, text[i]);
        if (out[currentState == 0])
        {
            continue;
        }
        for (int j = 0; j < k; j++)
        {
            int aux = (out[currentState] & (1 << j));
            if (aux > 0)
            {
                cout << "La palabra (" << arr[j] << ") aparece de " << i - arr[j].size() + 1 << " - " << i << endl;
            }
        }
    }
}

int main(int argc, char const *argv[])
{
    string arr[] = {"he", "she", "hers", "his"};
    string text = "ahishersahishersahishis";
    int tam = sizeof(arr) / sizeof(arr[0]);
    searchWords(arr, tam, text);
    return 0;
}
