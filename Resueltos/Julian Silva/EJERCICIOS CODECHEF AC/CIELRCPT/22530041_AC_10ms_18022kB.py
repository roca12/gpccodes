def funcion(n):
    prices = 11
    total = 0
    while n != 0:
        if(n / 2 **prices >= 1):
            n -= 2**prices
            total+=1
        else:
            prices-=1
    return total
    
for i in range(int(input())):
    n=int(input())
    answer=funcion(n)
    print(answer)