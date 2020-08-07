 
c = [0] * 100 
def coef(n): 
    c[0] = 1 
    for i in range(n): 
        c[1 + i] = 1 
        for j in range(i, 0, -1): 
            c[j] = c[j - 1] - c[j] 
        c[0] = -c[0] 
		
def isPrime(n): 
    coef(n) 
    c[0] = c[0] + 1 
    c[n] = c[n] - 1 
    i = n 
    while (i > -1 and c[i] % n == 0): 
        i = i - 1 
    return True if i < 0 else False 

n = 37; 
if (isPrime(n)): 
    print("Prime") 
else: 
    print("Not Prime")
	

