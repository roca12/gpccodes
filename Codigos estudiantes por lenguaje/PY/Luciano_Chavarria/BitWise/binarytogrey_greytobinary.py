from sys import stdout, stdin


def binarytogrey(binary):
    grey = ""
    grey += binary[0]
    for i in range(1, len(binary)):
        grey += xor_c(binary[i - 1], binary[i])
    return grey


def xor_c(a, b):
    return '0' if a == b else '1'


def graytobinary(grey):
    binary = ""
    binary += grey[0]
    for i in range(1, len(grey)):
        if grey[i] == '0':
            binary += binary[i - 1]
        else:
            binary += flip(binary[i - 1])
    return binary

def flip(c):
    return '1' if c=='0' else '0'

b1 = "01001"
res = binarytogrey(b1)
stdout.write(f"{res}\n")
res2 = graytobinary(res)
stdout.write(f"{res2}")
