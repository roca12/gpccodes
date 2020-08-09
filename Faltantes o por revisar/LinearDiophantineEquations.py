def gcd(a, b):
    if(a % b == 0):
        return abs(b)
    else:
        return gcd(b, a % b)

def isPossible(a, b, c):
    return (c % gcd(a, b) == 0)
a = 3
b = 6
c = 9
if (isPossible(a, b, c)):
    
    print("Possible" )
else:
    print("Not Possible") 
a = 3
b = 6
c = 8
if (isPossible(a, b, c)):
    print("Possible" )
else:
    print("Not Possible" )
a = 2;
b = 5;
c = 1;
if (isPossible(a, b, c)):
    print("Possible" )
else:
    print("Not Possible" )