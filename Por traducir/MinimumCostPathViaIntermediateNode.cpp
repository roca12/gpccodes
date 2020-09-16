#include <bits/stdc++.h> 
using namespace std;
#define MAXN 100005 

vector<pair<int, int> > v[MAXN];
int dist[MAXN];

void dijkstra(int source, int n) {
    for (int i = 0; i < n; i++)
        dist[i] = INT_MAX;
    bool vis[n];
    memset(vis, false, sizeof vis);
    dist[source] = 0;
    multiset<pair<int, int> > s;
    s.insert({0, source});
    while (!s.empty()) {
        pair<int, int> p = *s.begin();
        s.erase(s.begin());
        int x = p.second;
        int wei = p.first;
        if (vis[x])
            continue;

        vis[x] = true;

        for (int i = 0; i < v[x].size(); i++) {
            int e = v[x][i].first;
            int w = v[x][i].second; 
            if (dist[x] + w < dist[e]) {
                dist[e] = dist[x] + w;
                s.insert({dist[e], e});
            }
        }
    }
}

void add_edge(int s, int t, int weight) {
    v[s].push_back({t, weight});
    v[t].push_back({s, weight});
}

int solve(int source, int destination,
        int intermediate, int n) {
    int ans = INT_MAX;
    dijkstra(source, n);
    int dsource[n];
    for (int i = 0; i < n; i++)
        dsource[i] = dist[i];
    dijkstra(destination, n);
    int ddestination[n];
    for (int i = 0; i < n; i++)
        ddestination[i] = dist[i];
    dijkstra(intermediate, n);
    int dintermediate[n];
    for (int i = 0; i < n; i++)
        dintermediate[i] = dist[i];
    for (int i = 0; i < n; i++)
        ans = min(ans, dsource[i] + ddestination[i]
            + dintermediate[i]);
    return ans;
}


int main() {
    int n = 4;
    int source = 0, destination = 2, intermediate = 3;
    add_edge(0, 1, 1);
    add_edge(1, 2, 2);
    add_edge(1, 3, 3);
    cout << solve(source, destination, intermediate, n);
    return 0;
}
