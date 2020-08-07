
from collections import defaultdict 

class Graph: 
	def __init__(self,vertices): 
		self.V= vertices 
		self.graph = defaultdict(list)
		self.Time = 0
	def addEdge(self,u,v): 
		self.graph[u].append(v) 
		self.graph[v].append(u) 
	def APUtil(self,u, visited, ap, parent, low, disc): 
		children =0
		visited[u]= True
		disc[u] = self.Time 
		low[u] = self.Time 
		self.Time += 1
		for v in self.graph[u]: 
			if visited[v] == False : 
				parent[v] = u 
				children += 1
				self.APUtil(v, visited, ap, parent, low, disc) 
				low[u] = min(low[u], low[v]) 
				if parent[u] == -1 and children > 1: 
					ap[u] = True
				if parent[u] != -1 and low[v] >= disc[u]: 
					ap[u] = True			 
			elif v != parent[u]: 
				low[u] = min(low[u], disc[v]) 
	def AP(self): 
		visited = [False] * (self.V) 
		disc = [float("Inf")] * (self.V) 
		low = [float("Inf")] * (self.V) 
		parent = [-1] * (self.V) 
		ap = [False] * (self.V) 
		for i in range(self.V): 
			if visited[i] == False: 
				self.APUtil(i, visited, ap, parent, low, disc) 
		for index, value in enumerate (ap): 
			if value == True: print index, 
g1 = Graph(5) 
g1.addEdge(1, 0) 
g1.addEdge(0, 2) 
g1.addEdge(2, 1) 
g1.addEdge(0, 3) 
g1.addEdge(3, 4) 
print "Puntos de articulacion en el grafo "
g1.AP() 
g2 = Graph(4) 
g2.addEdge(0, 1) 
g2.addEdge(1, 2) 
g2.addEdge(2, 3) 
print "Puntos de articulacion en el grafo "
g2.AP() 
g3 = Graph (7) 
g3.addEdge(0, 1) 
g3.addEdge(1, 2) 
g3.addEdge(2, 0) 
g3.addEdge(1, 3) 
g3.addEdge(1, 4) 
g3.addEdge(1, 6) 
g3.addEdge(3, 5) 
g3.addEdge(4, 5) 
print "Puntos de articulacion en el grafo "
g3.AP() 

