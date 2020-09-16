import math 
class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y
 
    def compare(self, other):
        if (abs(self.x - other.x) < 1e-9 and (abs(self.y - other.y) < 1e-9)):
            return True
        return False
    
class Vec :
    def __init__(self, x, y):
        self.x = x
        self.y = y
   
def toVector(a,b) :
    return Vec(b.x - a.x, b.y - a.y)

def angle(a, b, c):
    ba = toVector(b, a)
    bc = toVector(b, c)
    return math.acos((ba.x * bc.x + ba.y * bc.y) / math.sqrt((ba.x * ba.x + ba.y * ba.y) * (bc.x * bc.x + bc.y * bc.y)))

def cross(a, b):
    return a.x * b.y - a.y * b.x


def ccw(p, q,  r) :
    return cross(toVector(p, q), toVector(p, r)) > 0

def inPolygon(pt,P):
    if (len(P)==0):
        return false;
    sum = 0;
    for i in range (len(P)-1):
        if (ccw(pt, P[i], P[i + 1])):
            sum += angle(P[i], pt, P[i + 1])
        else:
            sum -= angle(P[i], pt, P[i + 1])
    if (abs(abs(sum) - 2 * math.acos(-1.0)) < 1e-9):
        return True
    return False

def collinear(p, q, r):
    return abs(cross(toVector(p, q), toVector(p, r))) < 1e-9

polygon=[]
polygon.append(Point(0, 0));
polygon.append(Point(2, 0));
polygon.append(Point(2, 2));
polygon.append(Point(0, 2));
polygon.append(Point(0, 0));
punto = Point(1, 1)
if (inPolygon(punto, polygon)):
    print("Si")
else:
    print("No")