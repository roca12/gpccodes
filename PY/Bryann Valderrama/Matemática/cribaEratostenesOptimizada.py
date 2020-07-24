from sys import stdout
wr = stdout.write


MAX_SIZE = 1000001
isPrime = [True for x in range(MAX_SIZE)]
prime = []
SPF = [0 for x in range(MAX_SIZE)]


def manipuledSieve(n):
    global isPrime
    global prime
    global SPF
    isPrime[0] = False
    isPrime[1] = False
    for i in range(2, n):
        if(isPrime[i]):
            prime.append(i)
            SPF[i] = i
        j = 0
        while j < len(prime) and i * prime[j] < n and prime[j] <= SPF[i]:
            isPrime[i * prime[j]] = False
            SPF[i * prime[j]] = prime[j]
            j += 1


n = 100
for i in range(MAX_SIZE):
    SPF.append(2)

manipuledSieve(n)

# Calcula e Imprime los primeros 100 numeros primos
for i in range(len(prime)):
    wr(f'{prime[i]} ')

wr("\n")

# Calcula e Imprime el factor primo mas pequeño de los primeros n numeros
for i in range(2, n):
    wr(f"{i} : {SPF[i]} \n")
