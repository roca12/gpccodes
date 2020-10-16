def is_geometric(li): 
    if len(li) <= 1: 
        return True
    ratio = li[1]/float(li[0]) 
     
    for i in range(1, len(li)): 
        if li[i]/float(li[i-1]) != ratio:  
            return False
    return True
  
print(is_geometric([2, 6, 18, 54])) 