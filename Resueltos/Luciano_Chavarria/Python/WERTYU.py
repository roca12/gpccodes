while True:
    try:
        res = ''
        l = ('`', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '-', '=',
             'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', '[', ']','\\',
             'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', ';', "'",
             'Z', 'X', 'C', 'V', 'B', 'N', 'M', ',', '.', '/')
        string = input()
        for i in range(len(string)):
            if string[i] == ' ':
                res += ' '
            else:
                res += l[l.index(string[i])-1]
        print(res)
    except EOFError:
        break
