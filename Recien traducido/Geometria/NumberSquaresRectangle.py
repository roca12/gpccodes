def countSquares(m, n): 
    if(n < m): 
        temp = m 
        m = n 
        n = temp 
    return ((m * (m + 1) * (2 * m + 1) / 
           6 + (n - m) * m * (m + 1) / 2)) 
  
m = 4 
n = 3
print("Count of squares is ",countSquares(m, n)) 