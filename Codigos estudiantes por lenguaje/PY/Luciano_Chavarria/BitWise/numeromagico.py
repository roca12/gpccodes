from sys import stdin, stdout, maxsize

def nthMagic(n):
    pow_ = 1
    answer = 0
    while n:
        pow_ = pow_*5
        if (n&1) == 1:
            answer += pow_
        n >>= 1
    return answer

n = 7
stdout.write(f"{n} -> {bin(n)[2:]} -> {nthMagic(n)}")
