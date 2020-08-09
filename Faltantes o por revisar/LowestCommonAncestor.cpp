
#include <cstdlib>
#include <bits/stdc++.h> 
using namespace std;
const int MAX = 100005;
const int LOG2 = 17;
//vector<edge> g[MAX];
vector<int> g[MAX];
int dep[MAX];
int par[MAX][LOG2];
int rmq[MAX][LOG2];
static int nodos, aristas;

struct edge {
    int v, w;

    edge(int _v, int _w) {
        v = _v;
        w = _w;
    }
};

int lca(int u, int v) {
    //int ans = -1;
    if (dep[u] < dep[v]) {
        int aux = u;
        u = v;
        v = aux;
    }
    int diff = dep[u] - dep[v];
    for (int i = LOG2 - 1; i >= 0; i--) {
        if ((diff & (1 << i)) > 0) {
            //ans = max(ans, rmq[u][i]);
            u = par[u][i];
        }
    }
    //if (u == v) return ans;
    if (u == v) {
        return u;
    }
    for (int i = LOG2 - 1; i >= 0; i--) {
        if (par[u][i] != par[v][i]) {
            //ans = max(ans, max(rmq[u][i], rmq[v][i]));
            u = par[u][i];
            v = par[v][i];
        }
    }
    //return max(ans, max(rmq[u][0], rmq[v][0]));
    return par[u][0];
}

void dfs(int u, int p, int d) {
    dep[u] = d;
    par[u][0] = p;
    for (int v /* edge ed*/ : g[u]) {
        //int v = ed.v;
        if (v != p) {
            //rmq[v][0] = ed.w;
            dfs(v, u, d + 1);
        }
    }
}

void build() {
    for (int i = 0; i < nodos; i++) {
        dep[i] = -1;
    }
    for (int i = 0; i < nodos; i++) {
        if (dep[i] == -1) {
            //rmq[i][0] = -1;
            dfs(i, i, 0);
        }
    }
    for (int j = 0; j < LOG2 - 1; j++) {
        for (int i = 0; i < nodos; i++) {
            par[i][j + 1] = par[par[i][j]][j];
            //rmq[i][j+1] = max(rmq[ par[i][j] ][j], rmq[i][j]);
        }
    }
}

void init() {
    for (int i = 0; i <= nodos; i++) {
        //        g[i] = new ArrayList<>();
    }
}

int main() {
    nodos = 5;
    aristas = 4;
    init();
    g[0].emplace_back(1);
    g[0].emplace_back(2);
    g[2].emplace_back(3);
    g[3].emplace_back(4);
    build();
    cout<<(lca(2, 1))<<endl;
}
