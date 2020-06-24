while True:
    try:
        arr = [int(x) for x in input().split()]
        a = max(arr) + min(arr)
        arr.remove(max(arr))
        arr.remove(min(arr))
        b = 0
        for i in arr:
            b += i
        print(abs(a - b))
    except EOFError:
        break
