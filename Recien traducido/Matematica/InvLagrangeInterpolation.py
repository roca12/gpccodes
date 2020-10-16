class Data: 
    def __init__(self, x, y): 
        self.x = x 
        self.y = y 
  

def inv_interpolate(d, n,  y) : 
    x = 0
    for i in range(n): 
        xi = d[i].x 
        for j in range(n): 
            if j != i: 
                xi = (xi * (y - d[j].y) / 
                      (d[i].y - d[j].y)) 
        x += xi 
    return x 
d = [Data(1.27, 2.3),  
     Data(2.25, 2.95),  
     Data(2.5, 3.5),  
     Data(3.6, 5.1)] 

n = 4
y = 4.5
print("Value of x at y = 4.5 :",  
       round(inv_interpolate(d, n, y), 5)) 