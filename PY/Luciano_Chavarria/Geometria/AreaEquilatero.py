from sys import stdout, stdin
import math

def areaEquilatero(a):
	return a**2*(math.pi/3)

stdout.write(f"{areaEquilatero(6)}")
