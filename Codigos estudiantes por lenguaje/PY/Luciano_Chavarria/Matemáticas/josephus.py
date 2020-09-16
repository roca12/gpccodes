from sys import stdout, stdin
import math

def josephus(n,k):
    d = [int for x in range(n+1)]
    d[0] = -1
    for i in range(1,n+1):
        d[i] = i
    i = n
    a = 0
    while i != 1:
        i-=1
        a=nextt(a,k,d)
        d[a] = -1
        a+=1
    i = 0
    while d[i] == -1:
        i+=1
    return d[i]

def nextt(a,k,d):
    j = a - 1
    i = 0
    while i < k:
        j = (j+1)%len(d)
        if d[j] != -1:
            i+=1
    stdout.write(f"next = {j} \n")
    return j

stdout.write(f"{josephus(5,2)}")
