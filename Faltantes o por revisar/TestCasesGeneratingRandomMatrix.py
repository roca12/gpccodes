import random as r
RUN = 5;
lowerBound = 0
upperBound = 1000
maxColumn = 10
minColumn = 1
minRow = 1
maxRow = 10
def randomMatrix():
    for i in range (RUN):
        row = r.randint(minRow,maxRow)
        column = r.randint(minColumn,maxColumn)
        matrix=[[0 for x in range(row)]for y in range (column)];
        print(str(row) + " " + str(column))
        str1=""
        for i in range (row):
            for j in range (column):
                a = r.randint(0,300)
                str1+=str(a)+" " 
            print(str1)
            str1=""
randomMatrix()
