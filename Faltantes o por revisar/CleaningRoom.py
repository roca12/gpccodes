# Python3 code to find whether 
# house can be cleaned or not 
  
# Matrix A stores the string 
A = [[0 for i in range(105)] for j in range(105)] 
  
# ans stores the pair of indices 
# to be cleaned by the machine 
ans = [] 
  
# Function for printing the 
# vector of pair 
def printt(): 
      
    print("Yes, the house can be cleaned.") 
    for i in range(len(ans)): 
        print(ans[i][0], ans[i][1]) 
          
# Function performing calculations 
def solve(n): 
    global ans 
      
    # push every first cell in 
    # each row containing '.' 
    for i in range(n): 
        for j in range(n): 
            if (A[i][j] == '.'): 
                ans.append([i + 1, j + 1]) 
                break
              
    # If total number of cells are 
    # n then house can be cleaned 
    if (len(ans) == n): 
        printt() 
        return 0
          
    ans = [] 
      
    # push every first cell in 
    # each column containing '.' 
    for i in range(n): 
        for j in range(n): 
            if (A[j][i] == '.'): 
                ans.append([i + 1, j + 1]) 
                break
              
    # If total number of cells are 
    # n then house can be cleaned 
    if (len(ans) == n): 
        printt() 
        return 0
    print("house cannot be cleaned.") 
  

n = 3
s = "" 
s += ".**"
s += ".**"
s += ".**"
k = 0
  
# Loop to insert letters from 
# string to array 
for i in range(n): 
    for j in range(n): 
        A[i][j] = s[k] 
        k += 1
  
solve(n) 
