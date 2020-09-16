from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write

V, E = rl().strip().split()
V, E = int(V), int(E)

G = [[-1 for x in range(V)] for x in range(V)]
for i in range(V):
    G[i][i] = 0

for i in range(E):
    desde, hasta, peso = rl().strip().split()
    desde, hasta, peso = int(desde), int(hasta), int(peso)
    G[desde][hasta] = peso
    G[hasta][desde] = peso

for i in range(V):
    for j in range(V):
        if G[i][j] == -1:
            wr(f'inf\t')
        else:
            wr(f'{G[i][j]}\t')
    wr('\n')
