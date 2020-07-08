V = 4

def isBipartite(G, src):
    global V
    colorarr = [-1 for x in range(V)]
    colorarr[src] = 1
    q = []
    q.append(src)
    while not len(q) == 0:
        u = q.pop()
        if G[u][u] == 1:
            return False
    for v in range(V):
        if G[u][v] == 1 and colorarr[v] == -1:
            colorarr[v] = 1 - colorarr[u]
            q.append(v)
        elif G[u][v] and colorarr[v] == colorarr[u]:
            return False
    return True

if __name__ == '__main__':
    G = [[0, 1, 0, 1], [1, 0, 1, 0], [0, 1, 0, 1], [1, 0, 1, 0]]
    if isBipartite(G, 0):
        print("Es bipartitio")
    else:
        print("No es bipartitio")
