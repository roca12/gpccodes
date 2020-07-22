from sys import stdout


def isPrime(x):
    if (x % 2 == 0 and x > 2) or x < 2:
        return False
    if x == 2:
        return True
    i = 3
    while i * i <= x:
        if x % i == 0:
            return False
        i += 1
    return True


def main():
    n = int(13)
    if isPrime(n):
        stdout.write("es primo")
    else:
        stdout.write("no es primo")

if __name__ == '__main__':
    main()
