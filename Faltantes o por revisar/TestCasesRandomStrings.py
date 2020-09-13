import random as r
RUN=5
MAX=25
MAXLEN=100
def randString():
    for i in range(RUN):
        LEN=1+r.randint(0,MAXLEN)
        print(LEN)
        STR=""
        for j in range(LEN):
            STR+=chr(ord('a') + r.randint(0,MAX))
        print(STR)
        
randString()