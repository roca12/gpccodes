from sys import stdout
wr = stdout.write


def sieveErathostenes(n):
    prime = [True for x in range(n+1)]
    prime[0] = False
    prime[1] = False
    p = 2
    while p*p <= n:
        if prime[p]:
            i = p*p
            while i <= n:
                prime[i] = False
                i += p
        p += 1
    return prime


res = sieveErathostenes(1000)

# Calcula e Imprime los primeros n numeros
# True is Prime
# False is not Prime

for i in range(len(res)):
    wr(f'{i} : {res[i]}\n')
