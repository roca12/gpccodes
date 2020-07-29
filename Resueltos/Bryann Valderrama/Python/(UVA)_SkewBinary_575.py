while True:
    try:
        n = int(input())
        if n == 0:
            break
        b = str(n)
        k = 0
        arr = []
        for i in b:
            arr.append(int(i)*((2**(len(b)-k))-1))
            k += 1
        suma = 0
        for i in arr:
            suma += i
        print(suma)
    except EOFError:
        break
