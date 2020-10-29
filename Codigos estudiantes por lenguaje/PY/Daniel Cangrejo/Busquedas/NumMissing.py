from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write


def get_Missing_N(a=list, n=int):
    x1 = a[0]
    x2 = 1
    for i in range(1, n):  # Hash de Datos que tengo
        x1 ^= a[i]
        # wr(f'{i} -> {x1}\n')  # Print Statement
    for i in range(2, n+2):  # Hash de Datos que debería tener
        x2 ^= i
        # wr(f'{i} -> {x2}\n')  # Print Statement
    return x1 ^ x2


arr = list(map(int, rl().split()))
missed = get_Missing_N(arr, len(arr))
wr(f'El numero que falta es: {missed}')
