n = 6
m = 8
visited = [[0 for i in range (m)]for j in range (n)]
result = [[0 for i in range (m)]for j in range (n)]
COUNT = 0
def is_valid(x, y, key, input):
    if (x < n and y < m and x >= 0 and y >= 0):
        if (visited[x][y] == False and input[x][y] == key):
            return True
        else:
            return False
    else:
        return False
    
def BFS(x, y, i, j, input):
    global COUNT
    if (x != y):
        return
    visited[i][j] = 1
    COUNT +=1
    x_move = [0, 0, 1, -1]
    y_move = [1, -1, 0, 0] 
    for u in range (4):
        if (is_valid(i + y_move[u], j + x_move[u], x, input)):
            BFS(x, y, i + y_move[u], j + x_move[u], input)
            
def reset_visited():
    visited = [[0 for i in range (m)]for j in range (n)]
    
def reset_result(key, input):
    for i in range (n):
        for j in range (m):
            if (visited[i][j] and input[i][j] == key):
                result[i][j] = visited[i][j]
            else:
                result[i][j] = 0
                
def print_result(res):
    print("The largest connected component of the grid is :" + str(res) + "\n")
    for i in range (n):
        for j in range (m):
            if (result[i][j]):
                print(str(result[i][j]) + " ")
            else:
                print(". ")
        print()
def computeLargestConnectedGrid(input):
    current_max = 2147483648
    for i in range (n):
        for j in range (m): 
            reset_visited()
            COUNT = 0
            if (j + 1 < m):
                BFS(input[i][j], input[i][j + 1], i, j, input)
            if (COUNT >= current_max):
                current_max = COUNT
                reset_result(input[i][j], input)
            reset_visited()
            COUNT = 0
            if (i + 1 < n):
                BFS(input[i][j], input[i + 1][j], i, j, input)
            if (COUNT >= current_max):
                current_max = COUNT
                reset_result(input[i][j], input)
    print_result(current_max)

    
input=[[ 1, 4, 4, 4, 4, 3, 3, 1],
        [ 2, 1, 1, 4, 3, 3, 1, 1],
        [ 3, 2, 1, 1, 2, 3, 2, 1],
        [ 3, 3, 2, 1, 2, 2, 2, 2],
        [ 3, 1, 3, 1, 1, 4, 4, 4],
        [ 1, 1, 3, 1, 1, 4, 4, 4]]
computeLargestConnectedGrid(input)
  
                
