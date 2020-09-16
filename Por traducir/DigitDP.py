dp = [[[int for z in range(2)] for y in range(180)] for x in range(20)]
digitA = list()
digitB = list()


def getDigits(x=int):
    digit = list()
    while x != 0:
        digit.append(x % 10)
        x /= 10
    return digit


def digitSum(idx=int, suma=int, tight=int, digit=list):
    global dp
    if idx == -1:
        return suma
    if dp[idx][suma][tight] != -1 and tight != 1:
        return dp[idx][suma][tight]
    ret = 0
    k = digit[idx] if tight > 0 else 9
    for i in range(k + 1):
        newTight = tight if digit[idx] else 0
        ret += digitSum(idx - 1, suma + i, newTight, digit)
    if tight == 0:
        dp[idx][suma][tight] = ret
    return ret


def rangeDigitSum(a=int, b=int):
    global dp
    global digitA
    global digitB
    dp = [[[-1 for z in range(2)] for y in range(180)] for x in range(20)]
    digitA = getDigits(a - 1)
    ans1 = digitSum(len(digitA) - 1, 0, 1, digitA)
    digitB = getDigits(b)
    ans2 = digitSum(len(digitB) - 1, 0, 1, digitB)
    ans = ans2 - ans1
    return ans
a, b = 10, 20
print("digit sum for given range "+str(rangeDigitSum(a, b)))