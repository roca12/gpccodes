'''Criba Eratostenes Optimizada'''

from sys import stdout
wr = stdout.write

MAX = 100001  # Limite de Busqueda
isPrime = [True] * MAX
prime = []  # Almacena Numeros Primos
SPF = [2] * MAX  # Factores Primos

def manipulatedSieve(N):

    isPrime[0] = isPrime[1] = False
    for i in range(2, N):
        if isPrime[i]:
            prime.append(i)
            SPF[i] = i
        j = 0
        while j < len(prime) and i * prime[j] < N and prime[j] <= SPF[i]:
            isPrime[i*prime[j]] = False
            SPF[i*prime[j]] = prime[j]
            j += 1

N = 30
manipulatedSieve(N)

for i in prime[:N]:
    wr(f'{i} ')
wr('\n')
for i in isPrime[:N]:
    wr(f'{i} ')
wr('\n')
for i in SPF[:N]:
    wr(f'{i} ')
