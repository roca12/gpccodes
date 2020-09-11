from sys import stdin, stdout

for _ in range(int(stdin.readline())):
    n = int(stdin.readline())
    names = list()
    for i in range(n):
    	names.append(stdin.readline())
    h, v, cont = 1, 1, 0
    while True:
        if cont == n:
            stdout.write("draw\n")
            break
        if names[cont].strip().endswith("man"):
        	h+=1
        else:
        	v+=1
        if h - 2 == v:
            stdout.write("superheroes\n")
            break
        elif v - 3 == h:
            stdout.write("villains\n")
            break
        cont += 1
