import random as r

RUN=5
MAX=25
MAXLEN=25
def randPalindrome():
    container=[]
    for i in range(RUN):
        LEN=1+r.randint(0,MAXLEN)
        print(LEN)
        if LEN%2==1:
            container.append(chr(ord('a')+r.randint(0,MAX)))
        for j in range (1,LEN/2+1):
            ch=chr(ord('a')+r.randint(0,MAX))
            container.append(ch)
            container.insert(0,ch)
        palin=str(container)
        palin=palin.replace("[", "")
        palin=palin.replace("]", "")
        palin=palin.replace("'", "")
        palin=palin.replace(",", "")
        palin=palin.replace(" ", "")
        print(palin)
        
randPalindrome()
