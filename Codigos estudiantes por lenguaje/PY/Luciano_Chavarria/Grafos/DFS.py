class Grafo:
    V = 0
    adj = [[],[],[],[],[],[]]
    def addEdge(self,v,w):
        self.adj[v].append(w)
    def DFSUtil(self,v,visited = []):
        visited[v] = True
        print(v," ")
        for i in range(len(self.adj[v])):
            n = self.adj[v][i]
            if not visited[n]:
                self.DFSUtil(n,visited)
    def DFS(self,v):
        visited = [False,False,False,False,False,False]
        self.DFSUtil(v,visited)

g = Grafo()
g.V=4
g.addEdge(0,1)
g.addEdge(0,2)
g.addEdge(1,2)
g.addEdge(2,0)
g.addEdge(2,3)
g.addEdge(3,3)

inicial = 0
print(f"Nodo inicial {inicial}")
g.DFS(inicial)
