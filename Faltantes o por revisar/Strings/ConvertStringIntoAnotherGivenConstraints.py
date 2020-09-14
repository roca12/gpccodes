
def isItPossible(str1, str2, m, n): 
    if (m != n): 
        return False
    if str1.count('A') != str2.count('A') \ or str1.count('B') != str2.count('B'): 
        return False
    for i in range(m): 
        if (str1[i] != '#'): 
            for j in range(n): 
                if ((str2[j] != str1[i]) and str2[j] != '#'): 
                    return False
                if (str2[j] == str1[i]): 
                    str2[j] = '#'
                    if (str1[i] == 'A' and i < j): 
                        return False
                    if (str1[i] == 'B' and i > j): 
                        return False
                    break
				
    return True
str1 = "A#B#"
str2 = "A##B"
m = len(str1) 
n = len(str2) 
str1 = list(str1) 
str2 = list(str2) 
if(isItPossible(str1, str2, m, n)): 
    print("Yes") 
else: 
    print("No") 
