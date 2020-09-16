from sys import stdout


def GCD(a, b):
    return a if b == 0 else GCD(b, a % b)


def LCM(a, b):
    return a * (b // GCD(a, b))


def main():
    a = int(8)
    b = int(12)
    stdout.write(f"GCD de a y b es : {GCD(a,b)}\n")
    stdout.write(f"LCM de a y b es : {LCM(a,b)}\n")

if __name__ == '__main__':
    main()
