import random as r
RUN=5
MAX=25

def randomChars():
    for i in range(RUN):
        print(chr(ord('a')+r.randint(0,MAX)))
        
randomChars()