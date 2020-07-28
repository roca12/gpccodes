from sys import stdout

def printSubsets(sett):
    n = len(sett)
    for i in range(1<<n):
        stdout.write("{")
        for j in range(n):
            if (n&(1<<j))>0:
                stdout.write(f"{sett[j]} ")
    stdout.write("]\n")


conjunto = ["a","b","c"]
printSubsets(conjunto)
