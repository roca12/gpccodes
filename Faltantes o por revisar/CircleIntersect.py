def circle(x1, y1, x2,y2, r1,  r2):
    distSq = (x1 - x2) * (x1 - x2)+(y1 - y2) * (y1 - y2)
    radSumSq = (r1 + r2) * (r1 + r2)
    if (distSq == radSumSq):
        return 1
    elif (distSq > radSumSq):
        return -1
    else: 
        return 0

x1 = -10
y1 = 8
x2 = 14
y2 = -24
r1 = 30
r2 = 10
t = circle(x1, y1, x2,y2, r1, r2)
if (t == 1):
    print("Circle touch to each other.")
elif (t < 0):
    print("Circle not touch to each other.")
else:
    print("Circle intersect to each other.")
