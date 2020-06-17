# -*- coding: cp1252 -*-

while(True):
    try:
        a = int(input())
        arr = []
        if a==0:
            break
        arr = [int(x) for x in input().split()]
        arr.sort()
        print(*arr)
        
    except EOFError:
        break
