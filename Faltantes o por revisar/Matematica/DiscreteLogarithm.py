import math; 

def powmod(x, y, p): 
	res = 1; 
	x = x % p;
	while (y > 0):  
		if (y & 1): 
			res = (res * x) % p; 
		y = y >> 1; # y = y/2 
		x = (x * x) % p; 
	return res; 

def discreteLogarithm(a, b, m): 
	n = int(math.sqrt(m) + 1); 
	value = [0] * m; 
	for i in range(n, 0, -1): 
		value[ powmod (a, i * n, m) ] = i; 
	for j in range(n): 
		cur = (powmod (a, j, m) * b) % m; 
		if (value[cur]): 
			ans = value[cur] * n - j; 
			if (ans < m): 
				return ans; 
	return -1; 

a = 2; 
b = 3; 
m = 5; 
print(discreteLogarithm(a, b, m)); 
a = 3; 
b = 7; 
m = 11; 
print(discreteLogarithm(a, b, m)); 
