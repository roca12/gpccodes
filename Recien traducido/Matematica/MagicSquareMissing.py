
def printFilledDiagonal(sq):  
  
    Sum = 0
    for i in range(0, 3):  
        for j in range(0, 3):  
            Sum += sq[i][j]  
 
    Sum = Sum // 2
  
    for i in range(0, 3):  
        rowSum = 0
        for j in range(0, 3):  
            rowSum += sq[i][j]  
 
        sq[i][i] = Sum - rowSum  
      
    for i in range(0, 3):  
        for j in range(0, 3):  
            print(sq[i][j], end=" ")  
        print() 
        
sq = [[0, 7, 6], 
    [9, 0, 1], 
    [4, 3, 0]]  

printFilledDiagonal(sq)  
      
