# -*- coding: cp1252 -*-

for i in range(int(input())):
    b = int(input())
    k,l=0,0
    index = [int(x) for x in input().split()]
    for j in index:
        k^=j
    print(k*2)
