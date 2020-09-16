from collections import defaultdict
from sys import stdout
wr = stdout.write


class Graph:

    def __init__(self):
        self.graph = defaultdict(list)

    def addEdge(self, u, v):
        self.graph[u].append(v)
        # print(self.graph)  # print statement

    def DFSUtil(self, v, visited):
        visited[v] = True
        wr(f'{v} ')
        for i in self.graph[v]:
            if visited[i] == False:
                self.DFSUtil(i, visited)

    def DFS(self, v):
        visited = [False for x in range(max(self.graph)+1)]
        self.DFSUtil(v, visited)


g = Graph()
g.addEdge(0, 1)
g.addEdge(0, 2)
g.addEdge(1, 2)
g.addEdge(2, 0)
g.addEdge(2, 3)
g.addEdge(3, 3)

inicial = 2
wr(f'Siguiendo el DFS desde el nodo {inicial}:\n')
g.DFS(inicial)
