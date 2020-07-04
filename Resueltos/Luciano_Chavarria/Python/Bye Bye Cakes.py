sal = [-1 for x in range(8)]
while True:
    try:
        arr = [int(x) for x in input().split()]
        if arr == sal:
            break
        e,f,s,m = arr[0],arr[1],arr[2],arr[3]
        E,F,S,M = arr[4],arr[5],arr[6],arr[7]
        se,sf,ss,sm = 0,0,0,0
        while e>0 or f>0 or s>0 or m>0:
            e -= E
            if e < 0:
                se = e
            f -= F
            if f < 0:
                sf = f
            s -= S
            if s < 0:
                ss = s
            m -= M
            if m < 0:
                sm = m
        print(f"{abs(se)} {abs(sf)} {abs(ss)} {abs(sm)}")

    except EOFError:
        break
