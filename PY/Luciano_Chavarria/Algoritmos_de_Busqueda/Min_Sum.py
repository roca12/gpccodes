def minAbsSumPair(arr,n):
    l,r,min_sum,sum,min_l,min_r = int(),int(),int(),int(),int(),int()
    if n<2:
        print("Array no tiene suficientes valores")
        return
    min_l = int(0)
    min_r = int (1)
    min_sum = arr[0]+arr[1]
    for l in range(n-1):
        for r in range(l+1,n):
            sum = arr[l]+arr[r]
            if abs(min_sum)>abs(sum):
                min_sum=sum
                min_l=l
                min_r=r
    print(f"la minima suma es: {arr[min_l]} y {arr[min_r]}")

arr = [1,60,-10,70,-80,85]
minAbsSumPair(arr,len(arr))
