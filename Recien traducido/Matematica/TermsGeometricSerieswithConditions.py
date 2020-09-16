mpp=dict() 
  
def progression(b1, q, l, m, bad): 
    for i in range(m): 
        mpp[bad[i]] = 1
    if (abs(b1) > l): 
        print("0",end="") 
    elif (q == 0 or b1 == 0) : 
        if (0 not in mpp.keys()): 
            print("inf",end="") 
        elif (mpp[0] == 1 and b1 not in mpp.keys()) : 
            print("1",end="") 
        else: 
            print("0",end="") 
    elif (q == 1): 
        if (b1 not in mpp.keys()) : 
            print("inf",end="") 
        else: # else answer is 0 
            print("0",end="") 
  
    elif (q == -1): 
        if (b1 not in mpp.keys() or -1 * b1 not in mpp.keys()) : 
            print("inf",end="") 
        else :
            print("0",end="") 
    else :
        co = 0
        while (abs(b1) <= l): 
            if (b1 not in mpp.keys()): 
                co+=1
            b1 *= q 
        print(co,end="") 
  
  

b1 = 3
q = 2
l = 30
m = 4
  
bad=[6, 14, 25, 48] 
progression(b1, q, l, m, bad) 