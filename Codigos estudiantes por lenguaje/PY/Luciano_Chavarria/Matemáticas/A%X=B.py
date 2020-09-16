from sys import stdout
import math


def modEquation(a, b):
    if a < b:
        stdout.write("NO hay soluciones")
    if a == b:
        stdout.write("Tiene infinitas soluciones")
    cont, n = 0, a - b
    y = int(math.sqrt(a - b))
    for i in range(1, y + 1):
        if n % i == 0:
            if n / i > b:
                cont += 1
                stdout.write(str(n / i)+"\n")
            if i > b:
                cont += 1
                stdout.write(str(i)+"\n")
    if y**2 == n and y > b:
        cont -= 1
    stdout.write(str(cont))


a, b = 21, 5
modEquation(a, b)
