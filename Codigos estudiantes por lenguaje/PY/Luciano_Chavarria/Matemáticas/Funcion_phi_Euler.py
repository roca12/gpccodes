from sys import stdout, stdin
import math


def gcd(a, b):
    if a == 0:
        return b
    return gcd(b % a, a)

def phi(n):
	result = 1
	for i in range(2,n):
		if gcd(i, n) == 1:
			result+=1

	return result


for i in range(1,10+1):
	stdout.write(f"phi {i} = {phi(i)} \n")
