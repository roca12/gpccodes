from sys import stdout


def strMatch(string, pattern, n, m):
    if m == 0:
        return n == 0
    lookup = [[False for x in range(m+1)] for x in range(n+1)]
    lookup[0][0] = True
    for j in range(1, m+1):
        if pattern[j-1] == '*':
            lookup[0][j] = lookup[0][j-1]
    for i in range(1, n+1):
        for j in range(1, m+1):
            if pattern[j-1] == '*':
                lookup[i][j] = lookup[i][j-1] or lookup[i-1][j]
            elif pattern[j-1] == '?' or string[i-1] == pattern[j-1]:
                lookup[i][j] = lookup[i-1][j-1]
            else:
                lookup[i][j] = False
    return lookup[n][m]


# String
string = 'baaabab'

# *-------- Una Palabra --------*
stdout.write('Una Palabra\n')
pattern = 'b*'
if strMatch(string, pattern, len(string), len(pattern)):
    stdout.write('Si\n')
else:
    stdout.write('No\n')

# *----- Lista de Palabras -----*
stdout.write('Lista de Palabras\n')
pattern = ['b*', 'b?aab*', 'baaabab', 'b']
cont = 0
for i in pattern:
    if strMatch(string, pattern[cont], len(string), len(i)):
        stdout.write('Si\n')
    else:
        stdout.write('No\n')
    cont += 1
