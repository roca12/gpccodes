aux = 2
while True:
    try:
        n = input()
        l = []
        for i in n:
            if i == '"':
                if aux & 1:
                    l.append("''")
                else:
                    l.append("``")
                aux += 1
            else:
                l.append(i)
        print("".join(l))
    except EOFError:
        break
