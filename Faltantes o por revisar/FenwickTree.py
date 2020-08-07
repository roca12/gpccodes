BITree = [0 for x in range (1000)]
def getSum(index):
    sum = 0
    index = index + 1
    while (index > 0):
        sum += BITree[index]
        index -= index & (-index)
    return sum

def updateBIT(n, index, val):
    index = index + 1
    while (index <= n):
        BITree[index] += val
        index += index & (-index)

def constructBITree(arr, n):
    for i in range (1, n + 1):
        BITree[i] = 0
    for i in range (n):
        updateBIT(n, i, arr[i])

freq = [2, 1, 1, 3, 2, 3, 4, 5, 6, 7, 8, 9]
n = len(freq)
constructBITree(freq, n);
print("Sum of elements in arr[0..5] is " + str(getSum(5)))
freq[3] += 6
updateBIT(n, 3, 6);
print("Sum of elements in arr[0..5] after update is " + str(getSum(5)))
