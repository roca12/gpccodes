import random as r
RUN = 5;
lowerBound = 0;
upperBound = 1000;
minSize = 10;
maxSize = 20;
def randomArray():
    for i in range (RUN):
        size = r.randint(minSize,maxSize)
        array=[0 for j in range(size)]
        print(size)
        str1=""
        for j in range (size):
            a = r.randint(lowerBound,upperBound)
            str1+=str(a)+" " 
        print(str1)
randomArray()        
        

    

