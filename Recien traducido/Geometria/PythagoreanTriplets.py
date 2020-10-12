def pythagoreanTriplets(limits) : 
    c, m = 0, 2
    while c < limits : 
        for n in range(1, m) : 
            a = m * m - n * n 
            b = 2 * m * n 
            c = m * m + n * n 
            if c > limits : 
                break
  
            print(a, b, c) 
  
        m = m + 1
        
limit = 20
pythagoreanTriplets(limit) 