from sys import stdin,stdout
from functools import reduce

for _ in range(int(stdin.readline())):
    num = int(stdin.readline())
    stdout.write(f"{1 if num <= 1 else reduce(lambda x,y: x*y, list(range(2,num+1)))}\n")
