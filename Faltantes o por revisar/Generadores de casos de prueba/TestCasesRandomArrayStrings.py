import random as r
RUN = 1000 
MAX = 25 
MAXNUM = 20
MAXLEN =  20 
def randomStrArr():
    for i in range (1,RUN+1):
        NUM = r.randint(1,MAXNUM)
        print(NUM)
        for k in range (1,NUM):
            LEN = r.randint(1,MAXLEN)
            str1=""
            for J in range (1,LEN):
                str1+=chr(ord('a')+r.randint(0,MAX))+"";
            print (str1)
            str1=""

randomStrArr()