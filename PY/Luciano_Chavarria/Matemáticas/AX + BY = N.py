from sys import stdout


def solution(a, b, n):
    i = 0
    while i * a <= n:
        if (n - (i * a)) % b == 0:
            stdout.write(f"x = {i} y = {(n-(i*a))/b}")
            return
        i += 1
    stdout.write("No tiene solución \n")

a, b, n = 2, 3, 7
solution(a, b, n)
