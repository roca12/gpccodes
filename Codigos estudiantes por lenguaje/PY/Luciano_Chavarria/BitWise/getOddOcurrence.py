from sys import stdin, stdout, maxsize

def getOddOcurrence(arr,ar_size):
    i = int()
    res = 0
    for i in range(ar_size):
        res = res ^ arr[i]
    return res

arr = [2,3,5,4,5,2,4,3,5,2,4,4,2]
n = len(arr)
stdout.write(f"{getOddOcurrence(arr,n)}")
