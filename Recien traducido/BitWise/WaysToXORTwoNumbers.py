def countWays(s1, s2): 

    c1 = 0
    c0 = 0
    n = len(s1) 
    for i in range(0, n): 
        if (s1[i] == '1'): 
            c1 += 1
        else: 
            c0 += 1
	
    used1 = 0
    used0 = 0
    ways = 0

    for i in range(0, n): 
        if (s1[i] == '0' and s2[i] == '0'): 
            ways += c1 
            ways -= used1 
            used0 += 1
        elif (s1[i] == '1' and s2[i] == '0'): 
            ways += c0 
            ways -= used0 
            used1 += 1

    return ways 
s1 = "01011"
s2 = "11001"
print(countWays(s1, s2)) 



