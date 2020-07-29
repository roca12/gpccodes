while True:
    try:
        l = [x for x in input().split()]
        count = 0
        for i in l:
            x = 0
            for j in i:
                if (97 <= ord(j) and ord(j) <= 122) or (65 <= ord(j) and ord(j) <= 90):
                    if x == 0:
                        count += 1
                        x = 1
                else:
                    if x == 1:
                        x = 0
        print(count)
    except EOFError:
        break
