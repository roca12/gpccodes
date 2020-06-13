for i in range(int(input())):
    linea = input()
    x, y, n = linea.split()
    x, y, n = int(x), int(y), int(n)
    for i in range(1, n+1):
        if(i % x == 0 and i % y == 0):
            print('FizzBuzz')
        elif(i % x == 0):
            print('Fizz')
        elif(i % y == 0):
            print('Buzz')
        else:
            print(i)
