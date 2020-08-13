from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write


def swapBits(x):
    evenBits = x & 0xaaaaaaaa
    oddBits = x & 0x55555555
    evenBits >>= 1
    oddBits <<= 1
    return (evenBits | oddBits)


x = int(rl())
wr(f'{x} -> {bin(x)[2:]}\n')
wr(f'{swapBits(x)} -> {bin(swapBits(x))[2:]}')
