from sys import stdin,stdout

# m = ((x1+x2)/2 , (y1+y2)/2)

def midpoint(x1,y1,x2,y2):
    res = str(((x1+x2)/2))+" , "+str(((y1+y2)/2))
    return res

x1,y1,x2,y2 = stdin.readline().strip().split()

x1,y1,x2,y2 = int(x1),int(y1),int(x2),int(y2)

medio = midpoint(x1, y1, x2, y2)

stdout.write(f"el punto medio es: {medio}")
