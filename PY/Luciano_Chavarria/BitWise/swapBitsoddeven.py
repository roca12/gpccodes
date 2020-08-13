from sys import stdin, stdout, maxsize


def swapBits(x):
    evenbits = int(x & 0xAAAAAAAA)
    oddbits = int(x & 0x55555555)
    evenbits>>=1
    oddbits<<=1
    return evenbits | oddbits

x = 7
stdout.write(f"{x} -> {bin(x)[2:]}\n")
stdout.write(f"{swapBits(x)} -> {bin(swapBits(x))[2:]}\n")
