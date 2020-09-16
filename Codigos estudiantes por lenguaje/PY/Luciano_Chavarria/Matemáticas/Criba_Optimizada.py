from sys import stdout, stdin

wr = stdout.write

MAX_SIZE = 1000001

isprime = [True for x in range(MAX_SIZE)]

prime = []

SPF = [int for x in range(MAX_SIZE)]

def manipuledSieve(N):
    global isprime
    global prime
    global SPF
    isprime[0] = False
    isprime[1] = False
    for i in range(2,N):
        if isprime[i]:
            prime.append(i)
            SPF[i] = i
        j = 0
        while j < len(prime) and i * prime[j] < N and prime[j] <= SPF[i]:
            isprime[i*prime[j]] = False
            SPF[i*prime[j]] = prime[j]
            j+=1

N = 100
for i in range(MAX_SIZE):
    # isprime.append(True)
    SPF.append(2)
manipuledSieve(N)
for i in range(len(prime)):
    wr(f"{prime[i]}  ")

wr("\n")

for i in range(2,N):
    wr(f"{i} : {SPF[i]} \n")
