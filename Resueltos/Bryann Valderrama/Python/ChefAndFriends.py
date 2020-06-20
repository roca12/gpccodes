cont = 0
for i in range(int(input())):
    nick = input()
    n1 = nick.count('ch')
    n2 = nick.count('he')
    n3 = nick.count('ef')
    n4 = nick.count('chef')
    n5 = nick.count('che')
    n6 = nick.count('hef')
    nf = n1+n2+n3+n4+n5+n6
    if(nf >= 1):
        cont = cont+1
print(cont)
