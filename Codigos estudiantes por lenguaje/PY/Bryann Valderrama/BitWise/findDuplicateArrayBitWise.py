from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write


class BitArray:

    arr = []

    def __init__(self, n):
        self.arr = [0 for x in range((n >> 5)+1)]

    def get(self, pos):
        self.index = (pos >> 5)
        self.bitNo = (pos & 0x1f)
        return (self.arr[self.index] & (1 << self.bitNo)) != 0

    def set(self, pos):
        self.index = (pos >> 5)
        self.bitNo = (pos & 0x1f)
        self.arr[self.index] |= (1 << self.bitNo)

    def checkDuplicates(self, arr):
        for i in range(len(arr)):
            num = arr[i]-1
            if ba.get(num):
                wr(f'{num+1} ')
            else:
                ba.set(num)


arr = [10, 10, 10, 5, 58, 8, 1, 5, 3, 2, 16, 4, 4]
ba = BitArray(32000)
ba.checkDuplicates(arr)
