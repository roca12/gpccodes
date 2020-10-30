from sys import stdin,stdout

mi_set = set()

for i in range(10):
    entrada = int(stdin.readline())
    if entrada in mi_set:
        stdout.write("Este dato ya existe en mi set\n")
        continue
    mi_set.add(entrada)

print()

it = iter(mi_set)

for i in it:
    stdout.write(f"{i}\n")
