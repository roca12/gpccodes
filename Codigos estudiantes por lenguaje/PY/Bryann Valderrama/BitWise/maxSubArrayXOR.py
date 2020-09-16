from sys import stdin, stdout, maxsize
rl = stdin.readline
wr = stdout.write


def maxSubArrayXOR(arr, n):
    ans = -maxsize - 1
    for i in range(n):
        curr_xor = 0
        for j in range(i, n):
            curr_xor = curr_xor ^ arr[j]
            ans = max(ans, curr_xor)
    return ans


arr = [8, 1, 2, 12]
n = len(arr)
wr(f'Maximo SubArray XOR es {maxSubArrayXOR(arr,n)}')
