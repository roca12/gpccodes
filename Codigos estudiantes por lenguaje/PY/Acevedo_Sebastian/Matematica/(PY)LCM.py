'''Minimo Comun Multiplo de N numeros
'''

from sys import stdout
wr = stdout.write


def LCM_array(arr):
    ans = 1
    divisor = 2

    while True:
        counter = 0
        divisible = False

        for i in range(len(arr)):
            if arr[0] == 0:
                return 0
            elif arr[i] < 0:
                arr[i] = abs(arr[i])
            if arr[i] == 1:
                counter += 1
            if arr[i] % divisor == 0:
                divisible = True
                arr[i] //= divisor

        if divisible:
            ans = ans * divisor
        else:
            divisor += 1

        if counter == len(arr):
            return ans


arr = [2, 7, 3, 9, 4]
wr(f'{LCM_array(arr)}\n')
