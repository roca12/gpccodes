from sys import stdout

def PrimeFactors(n):
    i = int(2)
    while i**2 <= n:
        while n % i == 0:
            stdout.write(str(i)+"\n")
            n //= i
        i+=1
    if n>1:
        stdout.write(str(n))


def main():
    PrimeFactors(20)

if __name__ == '__main__':
    main()
