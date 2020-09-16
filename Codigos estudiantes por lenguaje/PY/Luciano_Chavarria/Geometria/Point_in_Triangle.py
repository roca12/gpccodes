from sys import stdin, stdout

def Area(x1,y1,x2,y2,x3,y3):
    return abs((x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2)

def isInside(x1,y1,x2,y2,x3,y3,x,y):
    A = Area(x1, y1, x2, y2, x3, y3)
    A1 = Area(x1, y1, x2, y2, x, y)
    A2 = Area(x1, y1, x3, y3, x, y)
    A3 = Area(x2, y2, x3, y3, x, y)
    return (A==A1+A2+A3)

x1,y1,x2,y2,x3,y3,x,y = 0,0,5,5,10,3,5,3
if isInside(x1, y1, x2, y2, x3, y3, x, y):
    stdout.write(f"el punto ({x},{y}) esta dentro del triangulo")
else:
    stdout.write(f"el punto ({x},{y}) no esta dentro del triangulo")
