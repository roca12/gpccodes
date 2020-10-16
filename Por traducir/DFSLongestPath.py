# Python3 program to find the longest  
# cable length between any two cities.  
  
# visited[] array to make nodes visited  
# src is starting node for DFS traversal  
# prev_len is sum of cable length till  
# current node max_len is pointer which  
# stores the maximum length of cable 
# value after DFS traversal  
def DFS(graph, src, prev_len, 
        max_len, visited): 
      
    # Mark the src node visited  
    visited[src] = 1
  
    # curr_len is for length of cable  
    # from src city to its adjacent city  
    curr_len = 0
  
    # Adjacent is pair type which stores  
    # destination city and cable length  
    adjacent = None
  
    # Traverse all adjacent  
    for i in range(len(graph[src])): 
          
        # Adjacent element  
        adjacent = graph[src][i]  
  
        # If node or city is not visited  
        if (not visited[adjacent[0]]): 
              
            # Total length of cable from 
            # src city to its adjacent  
            curr_len = prev_len + adjacent[1]  
  
            # Call DFS for adjacent city  
            DFS(graph, adjacent[0], curr_len, 
                max_len, visited) 
  
        # If total cable length till  
        # now greater than previous  
        # length then update it  
        if (max_len[0] < curr_len):  
            max_len[0] = curr_len  
  
        # make curr_len = 0 for next adjacent  
        curr_len = 0
  
# n is number of cities or nodes in  
# graph cable_lines is total cable_lines   
# among the cities or edges in graph  
def longestCable(graph, n): 
      
    # maximum length of cable among 
    # the connected cities  
    max_len = [-999999999999]  
  
    # call DFS for each city to find  
    # maximum length of cable 
    for i in range(1, n + 1): 
          
        # initialize visited array with 0  
        visited = [False] * (n + 1)  
  
        # Call DFS for src vertex i  
        DFS(graph, i, 0, max_len, visited) 
  
    return max_len[0] 
  
# Driver Code 
if __name__ == '__main__': 
  
    # n is number of cities  
    n = 6
  
    graph = [[] for i in range(n + 1)] 
  
    # create undirected graph  
    # first edge  
    graph[1].append([2, 3])  
    graph[2].append([1, 3])  
  
    # second edge  
    graph[2].append([3, 4])  
    graph[3].append([2, 4])  
  
    # third edge  
    graph[2].append([6, 2])  
    graph[6].append([2, 2])  
  
    # fourth edge  
    graph[4].append([6, 6])  
    graph[6].append([4, 6])  
  
    # fifth edge  
    graph[5].append([6, 5])  
    graph[6].append([5, 5])  
  
    print("Maximum length of cable =", 
          longestCable(graph, n)) 