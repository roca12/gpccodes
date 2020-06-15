for j in range(int(input())):
    x,y,n = input().split()
    x,y,n = int(x),int(y),int(n)
    for i in range(1,n+1):
        if i%x==0 and i%y==0:
            print("FizzBuzz")
            continue
        if i%x==0:
            print("Fizz")
            continue
        if i%y==0:
            print("Buzz")
            continue
        else:
            print(i)
