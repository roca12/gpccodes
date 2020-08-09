import random as r
requiredNumbers = 5
lowerBound = 0
upperBound = 1000

def randomNumbers():
    for i in range (requiredNumbers):
        a = r.randint(lowerBound,upperBound)
        print(a)
randomNumbers()