MAX = 100005
LOG2 = 17
#vector<edge> g[MAX];
g=[[]for i in range (MAX)]
dep=[0 for i in range (MAX)]
par=[[0 for j in range (MAX)]for i in range (LOG2)]
rmq=[[0 for j in range (MAX)]for i in range (LOG2)]
class edge:
   def __init__(self, v,w):
        self.v = v
        self.w = w
        
def lca(u, v):
    #int ans = -1;
    if (dep[u] < dep[v]):
        aux = u;
        u = v;
        v = aux;
    diff = dep[u] - dep[v];
    for i in range (LOG2-1,-1,-1):
        if ((diff & (1 << i)) > 0):
            #ans = max(ans, rmq[u][i]);
            u = par[u][i];
    #if (u == v) return ans;
    if (u == v):
        return u
    for i in range (LOG2-1,-1,-1):
        if (par[u][i] != par[v][i]):
            #ans = max(ans, max(rmq[u][i], rmq[v][i]));
            u = par[u][i]
            v = par[v][i]
    
    #return max(ans, max(rmq[u][0], rmq[v][0]));
    return par[u][0]

def dfs(u, p, d):
    dep[u] = d
    par[u][0] = p
    for v in g[u]:
        #v = ed.v;
        if (v != p):
            #rmq[v][0] = ed.w
            dfs(v, u, d + 1)
 

def build():
    for i in range (nodos):
        dep[i] = -1
    for i in range (nodos): 
        if (dep[i] == -1):
            #rmq[i][0] = -1;
            dfs(i, i, 0);
    for i in range (LOG2-1):
        for j in range (nodos):
            par[i][j + 1] = par[par[i][j]][j]
            #rmq[i][j+1] = max(rmq[ par[i][j] ][j], rmq[i][j]);
 

def init():
    g=[[]for i in range (MAX)]

nodos = 5
aristas = 4
init()
g[0].append(1)
g[0].append(2)
g[2].append(3)
g[3].append(4)
build();
print(lca(2, 1))