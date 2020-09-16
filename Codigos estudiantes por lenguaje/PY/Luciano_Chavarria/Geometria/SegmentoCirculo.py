from sys import stdout, stdin
import math

def setCirc(radio,angle):
    if angle >= 360:
        stdout.write("angulo no es posible")
    else:
        sector = (math.radians(angle)*(radio**2))/2
        return sector

r = 6
a = 22.7
stdout.write(f"{setCirc(r,a)}")
