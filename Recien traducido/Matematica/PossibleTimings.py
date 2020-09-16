num=[2, 7, 2, 3, 3, 4, 2, 5, 1, 2]
def possibleTimings(n):
    print(num[(ord(n[0]) - ord('0'))] * num[ord(n[1]) - ord('0')]) 

n = "05"
possibleTimings(n)