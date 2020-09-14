class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y
 
    def equals(self, other):
        if (abs(self.x - other.x) < 1e-9 and (abs(self.y - other.y) < 1e-9)):
            return True
        return False
def area(P):
    result = 0.0
    for i in range (len(P)-1):
        result += ((P[i].x * P[i + 1].y) - (P[i + 1].x * P[i].y))
    return abs(result) / 2.0;
puntos=[]
puntos.append(Point(0, 0))
puntos.append(Point(0, 1))
puntos.append(Point(1, 1))
puntos.append(Point(1, 0))
puntos.append(Point(0, 0))
print(area(puntos))