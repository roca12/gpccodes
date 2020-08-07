import math
class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y
 
    def equals(self, other):
        if (abs(self.x - other.x) < 1e-9 and (abs(self.y - other.y) < 1e-9)):
            return True
        return False
def euclideanDistance1(p1, p2):
    return math.hypot(p1.x - p2.x, p1.y - p2.y);


def euclideanDistance(x1, y1, x2, y2):
    return math.hypot(x2 - x1, y2 - y1)
print(euclideanDistance1(Point(0, 0), Point(20, 20)))
print(euclideanDistance(0, 0, 20, 20))