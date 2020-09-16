def minimumSwaps(a,n):
    maxx = -1
    minn = a[0]
    l = 0
    r = 0
    for i in range (n):
        if (a[i] > maxx):
            maxx = a[i]
            l = i
        if (a[i] <= minn):
            minn = a[i]
            r = i;
    if (r < l):
        print(l + (n - r - 2))
    else:
        print(l + (n - r - 1))

a= [5, 6, 1, 3]
n = len(a)
minimumSwaps(a, n)
        
        