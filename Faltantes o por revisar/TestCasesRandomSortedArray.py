import random as r
RUN =5
MAX=100000
MAXNUM=100

def randSortedArray():
    for i in range(RUN):
        NUM=1+r.randint(0,MAXNUM)
        arr=[]
        print(NUM)
        for j in range(NUM):
            arr.append(r.randint(0,MAX))
        arr.sort()
        print(arr)
        
randSortedArray()
        
        