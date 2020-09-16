N = 1000000
dist=[0 for i in range (N)]
visited = [0 for i in range (N)]

def addEdge(graph,u,v):
    graph[u].append(v)
    graph[v].append(u)

def multisourceBFS(graph,q):
    while (len(q)!=0):
        k = q[0]
        q=q[1:]
        for i in graph[k]:
            if (visited[i]==False):
                q.append(i)
                dist[i] = dist[k] + 1
                visited[i] = True
  
def nearestTown(graph, n, sources,s):
    q = []
    for i in range(s):
        q.append(sources[i])
        visited[sources[i]] = True
    multisourceBFS(graph, q)
    for i in range (1,n+1):
        print(str(i) + " " + str(dist[i]))
        
        
n = 6
graph= [[] for i in range (n+1)]
addEdge(graph, 1, 2);
addEdge(graph, 1, 6);
addEdge(graph, 2, 6);
addEdge(graph, 2, 3);
addEdge(graph, 3, 6);
addEdge(graph, 5, 4);
addEdge(graph, 6, 5);
addEdge(graph, 3, 4);
addEdge(graph, 5, 3);
sources = [1, 5]
S = len(sources)
nearestTown(graph, n, sources, S);