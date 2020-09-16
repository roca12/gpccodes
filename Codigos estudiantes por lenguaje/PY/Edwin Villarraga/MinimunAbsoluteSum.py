def MinimunSumPair(arr,n):
    l,r,min_sum,suma,min_l,min_r= int(),int(),int(),int(),int(),int()
    if n<2:
        print("Entrada invalida")
    min_l=0
    min_r=1
    min_sum=arr[0]+arr[1]
    for l in range (int(n-1)):
        for r in range (int(n)):
            sum=arr[l]+arr[r]
            if abs(min_sum)>abs(sum):
                min_sum=sum
                min_l=l
                min_r=r
    print(f"los dos elementos con la minima suma son {arr[min_l]} {arr[min_r]}")
arr=[1,2,-1,2,4,5,2,-43]
n=len(arr)
MinimunSumPair(arr,n)
