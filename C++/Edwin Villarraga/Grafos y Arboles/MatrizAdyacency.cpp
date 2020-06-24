#include <bits/stdc++.h>
#define MAX_V 101
using namespace std;
static int G[MAX_V][MAX_V];
int main()
{
    int V,E;
    cin>>V>>E;
    G[V][V];
    for(int i=0;i<E;++i)
        {
        int desde,hasta,peso;
        cin>>desde>>hasta;
        cin>>peso;
        G[desde][hasta]=peso;
        G[hasta][desde]-peso;
    }
    for(int i=0;i<V;++i)
    {
        for(int j=0;j<V;++j)
        {
        cout<<G[i][j]<<"\t";
        }
        cout<<endl;
    }
    return 0;
}
