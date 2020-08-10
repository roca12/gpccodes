from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write


def binarytoGray(binary):
    gray = ''
    gray += binary[0]
    for i in range(1, len(binary)):
        gray += xor_c(binary[i-1], binary[i])
    return gray


def xor_c(a, b):
    return '0' if a == b else '1'


def flip(c):
    return '1' if c == '0' else '0'


def graytoBinary(gray):
    binary = ''
    binary += gray[0]
    for i in range(1, len(gray)):
        if gray[i] == '0':
            binary += binary[i-1]
        else:
            binary += flip(binary[i-1])
    return binary


b1 = '01001'
res = binarytoGray(b1)
wr(f'{b1} -> {res}\n')
res2 = graytoBinary(res)
wr(f'{res} -> {res2}')
