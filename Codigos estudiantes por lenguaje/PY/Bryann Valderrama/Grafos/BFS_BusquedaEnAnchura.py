from sys import stdout
wr = stdout.write


def add_edge(v, w):
    ady[v].append(w)


def bfs(s):
    visited = [[] for i in range(V)]
    queue = []
    visited[s] = True
    queue.append(s)
    while len(queue) != 0:
        # queue.poll()
        s = queue[0]
        queue = queue[1:]
        
        wr(f'{str(s)} ')
        aux = ady[s]
        for j in range(len(aux)):
            n = aux[j]
            if(not visited[n]):
                visited[n] = True
                queue.append(n)


V = 4
ady = [[] for i in range(V)]
add_edge(0, 1)
add_edge(0, 2)
add_edge(1, 2)
add_edge(2, 0)
add_edge(2, 3)
add_edge(3, 3)
inicial = 0
wr(f'Siguiendo BFS desde el nodo {inicial}\n')
bfs(inicial)
