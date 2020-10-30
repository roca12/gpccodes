matrix = [[] for x in range(3)]

cont = int(1)
for i in range(3):
    for j in range(3):
        matrix[i].append(cont)
        cont+=1
for j in range(3):
    print(matrix[j])


"""print(matrix)

mat = [[int(j)+1 for j in range(3*i,3*i+3)] for i in range(3)]

mat = [[int(j)+1 for j in range(7*i,7*i+7)] for i in range(8)]
for i in mat:
    for idx in i:
        print(idx ,'\t', end=' ')
    print()
"""
