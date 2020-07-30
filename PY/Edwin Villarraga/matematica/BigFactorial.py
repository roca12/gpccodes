from sys import stdout
wr = stdout.write
def multiply(x,res,res_size):
    carry=0
    for i in range(res_size):
        prod=res[i]*x+carry
        res[i]=prod%10
        carry=prod//10
    while carry != 0:
        res[res_size]=carry%10
        carry//=10
        res_size+=1
    return res_size
def factorial(n):
    res=[0 for x in range(500)]
    res[0]=1
    res_size=1
    for i in range(2,n+1):
        res_size=multiply(i,res,res_size)
    wr(f'Factorial de{n} es : \n')
    for i in range(res_size-1,0,-1):
        wr(f'{res[i]}')
factorial(100)
