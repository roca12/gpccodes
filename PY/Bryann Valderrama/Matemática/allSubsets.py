from sys import stdout
wr = stdout.write


def printSubsets(sset):
    n = len(sset)
    for i in range(1 << n):
        wr('{ ')
        for j in range(n):
            if (i & (1 << j)) > 0:
                wr(f'{sset[j]} ')
        wr('}\n')


conjunto = ['a', 'b', 'c', 'd']
printSubsets(conjunto)
