
def mod(num, a): 
	res = 0 
	for i in range(0, len(num)): 
		res = (res * 10 + int(num[i])) % a; 
	return res 

num = "9564784542"; 
print(mod(num, 10)) 

