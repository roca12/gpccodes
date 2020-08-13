from sys import stdin, stdout, maxsize
rl = stdin.readline
wr = stdout.write


def nthMagicNo(n):
    pow_ = 1
    answer = 0
    while n != 0:
        pow_ = pow_ * 5
        if n & 1 == 1:
            answer += pow_
        n >>= 1
    return answer

n = int(rl())
wr(f'{n} -> {bin(n)[2:]} -> {nthMagicNo(n)}')
