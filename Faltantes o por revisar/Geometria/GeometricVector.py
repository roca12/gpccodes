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

a=Point(0,0)
b=Point(5,5)
segmento=toVector(a, b)