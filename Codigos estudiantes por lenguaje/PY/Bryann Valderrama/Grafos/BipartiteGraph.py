V = 4


def isBipartite(G, src):
    colorArr = [-1 for x in range(V)]
    colorArr[src] = 1
    q = []
    q.append(src)
    while not len(q) == 0:
        u = q.pop()
        if (G[u][u] == 1):
            return False
        for v in range(V):
            if (G[u][u] == 1 and colorArr[v] == 1):
                colorArr[v] = 1 - colorArr[u]
                q.append(v)
            elif (G[u][v] == 1 and colorArr[v] == colorArr[u]):
                return False
    return True


if __name__ == '__main__':
    G = [[0, 1, 0, 1],
         [1, 0, 1, 0],
         [0, 1, 0, 1],
         [1, 0, 1, 0]]
    if (isBipartite(G, 0)):
        print('Es bipartito')
    else:
        print('No es Bipartito')
