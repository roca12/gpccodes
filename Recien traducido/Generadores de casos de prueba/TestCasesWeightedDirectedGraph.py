import random as r
RUN=5
MAX_VERTICES=20
MAX_EDGES=20
MAXWEIGHT=200
class Pair:
    def __init__(self,first,second):
        self.first=first
        self.second=second
        
def getIndex(setin,value):
        result = 0;
        for entry in setin:
            if (entry==value):
                return result
            result+=1;
        return len(setin)+1;
    
container = {}
for i in range (RUN):
    VERTICES = 1 + r.randint(0,MAX_VERTICES)
    NUMEDGE = 1 + r.randint(0,MAX_EDGES)
    while (NUMEDGE > VERTICES * (VERTICES - 1) / 2):
        NUMEDGE = 1 + r.randint(0,MAX_EDGES)
    print(str(VERTICES)+" "+str(NUMEDGE)) 
    for j in range (NUMEDGE):
        a = 1 + r.randint(0,VERTICES);
        b = 1 + r.randint(0,VERTICES);
        p = Pair(a, b)
        while (getIndex(container, p) != len(container)+1):
            a = 1 + r.randint(0,VERTICES)
            b = 1 + r.randint(0,VERTICES)
            p = Pair()
            p.first=a
            p.second=b
        container[j]=p
    for p in container:
        wt = 1 + r.randint(0,MAXWEIGHT);
        print(str(container[p].first)+" "+str(container[p].second)+" "+str(wt))
    container.clear();
    print("")

