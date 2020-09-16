from math import log2
 
MAX = 500
lookup = [[0 for i in range(500)] 
    for j in range(500)] 


class Query: 
    def __init__(self, l, r): 
        self.L = l 
        self.R = r 

def preprocess(arr: list, n: int): 
    global lookup 
    for i in range(n): 
        lookup[i][0] = i 
    j = 1
    while (1 << j) <= n: 
        i = 0
        while i + (1 << j) - 1 < n: 
            if (arr[lookup[i][j - 1]] < 
                arr[lookup[i + (1 << (j - 1))][j - 1]]): 
                lookup[i][j] = lookup[i][j - 1] 
            else: 
                lookup[i][j] = lookup[i +
                    (1 << (j - 1))][j - 1] 

            i += 1
        j += 1

def query(arr: list, L: int, R: int) - > int: 
    global lookup 
    j = int(log2(R - L + 1)) 
    if (arr[lookup[L][j]] <=
        arr[lookup[R - (1 << j) + 1][j]]): 
        return arr[lookup[L][j]] 
    else: 
        return arr[lookup[R - (1 << j) + 1][j]] 
def RMQ(arr: list, n: int, q: list, m: int): 
    preprocess(arr, n) 
    for i in range(m): 
        L = q[i].L 
        R = q[i].R 
        print("Minimum of [%d, %d] is %d" %
              (L, R, query(arr, L, R))) 


a = [7, 2, 3, 0, 5, 10, 3, 12, 18] 
n = len(a) 
q = [Query(0, 4), Query(4, 7), 
    Query(7, 8)] 
m = len(q) 
RMQ(a, n, q, m) 

