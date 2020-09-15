class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y
 
    def compare(self, other):
        if (abs(self.x - other.x) < 1e-9 and (abs(self.y - other.y) < 1e-9)):
            return True
        return False
    
A=Point(0,0)