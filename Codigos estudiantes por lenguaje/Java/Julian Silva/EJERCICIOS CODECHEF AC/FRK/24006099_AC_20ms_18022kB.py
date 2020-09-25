x = int(input())
y = 0
for i in range(x) :
    s = input()
    if('ch' in s or 'he' in s or 'ef' in s or 'che' in s or 'hef' in s or 'chef' in s) :
        y += 1
print(y)
