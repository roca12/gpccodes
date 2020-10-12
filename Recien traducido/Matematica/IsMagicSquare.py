
N = 3

def isMagicSquare(mat): 
    s = 0 
    for i in range(0, N): 
        s = s + mat[i][i] 

    s2 = 0
    for i in range(0, N): 
        s2 = s2 + mat[i][N-i-1] 
  
    if(s != s2): 
        return False
 
    for i in range(0, N): 
        rowSum = 0;      
        for j in range(0, N): 
            rowSum += mat[i][j] 
         
        if (rowSum != s): 
            return False

    for i in range(0, N): 
        colSum = 0
        for j in range(0, N): 
            colSum += mat[j][i] 
        if (s != colSum): 
            return False
  
    return True
   
mat = [[2, 7, 6], 
    [9, 5, 1], 
    [4, 3, 8]] 
      
if (isMagicSquare(mat)): 
    print("Magic Square") 
else: 
    print("Not a magic Square") 