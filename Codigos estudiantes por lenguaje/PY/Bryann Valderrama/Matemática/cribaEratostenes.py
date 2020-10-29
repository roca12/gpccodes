''' Criba de Eratostenes 

    - Hallar todos los numeros primos menores que un numero N
    - Se forma una tabla con todos los numeros enteros comprendidos entre 2 y n
    - Se comienza desde 2, y se tachan todos sus multiplos
    - Comenzando de nuevo, al encontrar un numero entero no tachado, ese numero es primo
    - Se procede a tachar todos los multiplos de ese numero primo, y asi sucesivamente
    - Complejidad Tiempo: O(n log (log n))
'''

from sys import stdout
wr = stdout.write


def sieveEra(N):

    prime = [True for x in range(N+1)]
    prime[0] = prime[1] = False

    p = 2
    while p * p <= N:
        if prime[p]:
            i = p * p
            while i <= N:
                prime[i] = False
                i += p
        p += 1

    return prime


ans = sieveEra(99)
for i, j in enumerate(ans, 99):
    wr(f'{i} : {j}\n')
