import math as math
class Point:
    def __init__(self,x,y):
        self.x=x
        self.y=y
        
def euclideanDistance(p1, p2):
    return math.hypot(p1.x - p2.x, p1.y - p2.y)

def perimeter(P):
    result = 0.0
    for i in range (len(P)-1):
        result += euclideanDistance(P[i], P[i + 1])
    return result;

polygon=[]
polygon.append(Point(0, 0));
polygon.append(Point(1, 0));
polygon.append(Point(1, 1));
polygon.append(Point(0, 1));
polygon.append(Point(0, 0));
print(perimeter(polygon))