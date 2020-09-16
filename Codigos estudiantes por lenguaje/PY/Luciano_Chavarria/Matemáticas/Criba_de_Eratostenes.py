from sys import stdout, stdin


def sieveErathostenes(n):
    prime = [True for x in range(n + 1)]
    prime[0] = False
    prime[1] = False
    p = 2
    while p**2 <= n:
        if prime[p]:
            i = p**2
            while i <= n:
                prime[i] = False
                i += p
        p+=1
    return prime

res = sieveErathostenes(100)

for i in range(len(res)):
    stdout.write(str(i) + " " + str(res[i])+ "\n")
