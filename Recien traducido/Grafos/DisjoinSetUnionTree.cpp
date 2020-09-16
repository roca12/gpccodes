#include<bits/stdc++.h> 

using namespace std;

#define N 100010 

struct Edge {
    int u, v;
};

int id[N], sz[N];

int Root(int idx) {
    int i = idx;
    while (i != id[i])
        id[i] = id[id[i]], i = id[i];
    return i;
}

void Union(int a, int b) {
    int i = Root(a), j = Root(b);
    if (i != j) {
        if (sz[i] >= sz[j]) {
            id[j] = i, sz[i] += sz[j];
            sz[j] = 0;
        }
        else {
            id[i] = j, sz[j] += sz[i];
            sz[i] = 0;
        }
    }
}

void UnionUtil(struct Edge e[], int W[], int q) {
    for (int i = 0; i < q; i++) {
        int u, v;
        u = e[i].u, v = e[i].v;
        u--, v--;
        if (W[u] % 2 == 0 && W[v] % 2 == 0)
            Union(u, v);
    }
}

int findMax(int n, int W[]) {
    int maxi = 0;
    for (int i = 1; i <= n; i++)
        if (W[i] % 2 == 0)
            maxi = max(maxi, sz[i]);

    return maxi;
}


int main() {
    int W[] = {1, 2, 6, 4, 2, 0, 3};
    int n = sizeof (W) / sizeof (W[0]); 
    for (int i = 0; i < n; i++)
        id[i] = i, sz[i] = 1;
    Edge e[] = {
        {1, 2},
        {1, 3},
        {2, 4},
        {2, 5},
        {4, 6},
        {6, 7}};
    int q = sizeof (e) / sizeof (e[0]);
    UnionUtil(e, W, q);. 
    int maxi = findMax(n, W);
    printf("Maximum size of the subtree with ");
    printf("even weighted nodes = %d\n", maxi);

    return 0;
} 