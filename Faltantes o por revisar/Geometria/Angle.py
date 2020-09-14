import math as math
class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y
 
    def equals(self, other):
        if (abs(self.x - other.x) < 1e-9 and (abs(self.y - other.y) < 1e-9)):
            return True
        return False
class Vec:
    def __init__(self, x, y):
        self.x = x
        self.y = y
def toVector(a, b):
    return Vec(b.x - a.x, b.y - a.y)
def angle(a, b, c):
    ba = toVector(b, a)
    bc = toVector(b, c)
    return math.acos((ba.x * bc.x + ba.y * bc.y) / math.sqrt((ba.x * ba.x + ba.y * ba.y) * (bc.x * bc.x + bc.y * bc.y)))


def DegToRad (d):
    return d * math.acos(-1.0) / 180.0


def RadToDeg(r): 
    return r * 180.0 / math.acos(-1.0)
puntos=[]
puntos.append(Point(0,-1))
puntos.append(Point(0,0))
puntos.append(Point(0,1))
res = angle(puntos[0], puntos[1], puntos[2]);
print(res)
print(RadToDeg(res))