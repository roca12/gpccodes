N=100010
class Edge:
    def __init__(self,u,v):
        self.u=u
        self.v=v

id=[0 for i in range(N)]
sz=[0 for i in range(N)]

def Root(idx):
    i = idx
    while (i != id[i]):
        id[i] = id[id[i]]
        i = id[i]
    return i

def Union(a, b):
    i = Root(a)
    j = Root(b)
    if (i != j):
        if (sz[i] >= sz[j]):
            id[j] = i
            sz[i] += sz[j]
            sz[j] = 0;
        else:
            id[i] = j
            sz[j] += sz[i]
            sz[i] = 0;
 

def UnionUtil(e, W, q):
    for i in range (q):
        u = e[i].u
        v = e[i].v
        u-=1
        v-=1
        if (W[u] % 2 == 0 and W[v] % 2 == 0):
            Union(u, v)

def findMax(n, W):
    maxi = 0
    for i in range (1,n):
        if (W[i] % 2 == 0):
            maxi = max(maxi, sz[i])
    return maxi;


W= [1, 2, 6, 4, 2, 0, 3]
n = len(W);
for i in range (n):
    id[i] = i
    sz[i] = 1

e = [Edge(1, 2), Edge(1, 3),
    Edge(2, 4), Edge(2, 5),
    Edge(4, 6), Edge(6, 7)]
q = len(e);
UnionUtil(e, W, q);
maxi = findMax(n, W);
print("Maximum size of the subtree with ")
print("even weighted nodes = ", maxi);