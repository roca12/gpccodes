class Data: 
    def __init__(self, x, y): 
        self.x = x 
        self.y = y 
  

def interpolate(f, xi, n): 
    result = 0.0
    for i in range(n): 
        term = f[i].y 
        for j in range(n): 
            if j != i: 
                term = term * (xi - f[j].x) / (f[i].x - f[j].x) 
        result += term 
  
    return result 
f = [Data(0, 2), Data(1, 3), Data(2, 12), Data(5, 147)] 

print("Value of f(3) is :", interpolate(f, 3, 4)) 