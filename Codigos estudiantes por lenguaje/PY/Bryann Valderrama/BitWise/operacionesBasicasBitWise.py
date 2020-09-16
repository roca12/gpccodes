from sys import stdout, stdin
rl = stdin.readline
wr = stdout.write


def par_o_Impar(n):
    wr('---------------------------------------------\n')
    if n & 1:
        wr(f'{n} es Impar\n')
    else:
        wr(f'{n} es Par\n')
    wr('---------------------------------------------\n')


def verificar_K_esimo_Bit_Encendido(n, k):
    wr(f'[Verificar K-esimo Bit (On/Off)]\n')
    res = n & (1 << k)
    if res:
        wr(f'En el {n} el Bit {k} está Encendido\n')
        wr(f'{bin(n)[2:]}\n')
    else:
        wr(f'En el {n} el Bit {k} está Apagado\n')
        wr(f'{bin(n)[2:]}\n')
    wr('---------------------------------------------\n')


def encender_K_esimo_Bit(n, k):
    wr(f'[Encender K-esimo Bit]\n')
    res = n | (1 << k)
    if res != 0:
        wr(f'En el {n} encender el Bit {k}\n')
        wr(f'{n} -> {res}\n')
        wr(f'{bin(n)[2:]} -> {bin(res)[2:]}\n')
    wr('---------------------------------------------\n')


def apagar_K_esimo_Bit(n, k):
    wr(f'[Apagar K-esimo Bit]\n')
    res = n & ~(1 << k)
    if res != 0:
        wr(f'En el {n} apagar el Bit {k}\n')
        wr(f'{n} -> {res}\n')
        wr(f'{bin(n)[2:]} -> {bin(res)[2:]}\n')
    wr('---------------------------------------------\n')


def invertir_K_esimo_Bit(n, k):
    wr(f'[Invertir K-esimo Bit]\n')
    res = n ^ (1 << k)
    if res != 0:
        wr(f'En el {n} invertir el Bit {k}\n')
        wr(f'{n} -> {res}\n')
        wr(f'{bin(n)[2:]} -> {bin(res)[2:]}\n')
    wr('---------------------------------------------\n')


def invertir_All_Bits(n):
    wr(f'[Invertir todos los Bits]\n')
    res = ~n
    if res != 0:
        wr(f'En el {n} invertir todos los Bits\n')
        wr(f'{n} -> {res}\n')
        wr(f'{bin(n)[2:]} -> {bin(res)}\n')
    wr('---------------------------------------------\n')


def devolver_Bit_Encendido_Derecha(n):
    wr(f'[Devolver Bit encendido mas a la derecha]\n')
    res = n & -n
    if res != 0:
        wr(f'En el {n} devolver bit encendido mas a la derecha\n')
        wr(f'{n} -> {res}\n')
        wr(f'{bin(n)[2:]} -> {bin(res)[2:]}\n')
    wr('---------------------------------------------\n')


def devolver_Bit_Apagado_Derecha(n):
    wr(f'[Devolver Bit apagado mas a la derecha]\n')
    res = ~n & (n+1)
    if res != 0:
        wr(f'En el {n} devolver bit apagado mas a la derecha\n')
        wr(f'{n} -> {res}\n')
        wr(f'{bin(n)[2:]} -> {bin(res)[2:]}\n')
    wr('---------------------------------------------\n')


def encender_Bit_Apagado_Derecha(n):
    wr(f'[Encender Bit apagado mas a la derecha]\n')
    res = n | (n+1)
    if res != 0:
        wr(f'En el {n} encender bit apagado mas a la derecha\n')
        wr(f'{n} -> {res}\n')
        wr(f'{bin(n)[2:]} -> {bin(res)[2:]}\n')
    wr('---------------------------------------------\n')


def apagar_Bit_Encendido_Derecha(n):
    wr(f'[Apagar Bit encendido mas a la derecha]\n')
    res = n & (n-1)
    if res != 0:
        wr(f'En el {n} apagar bit encendido mas a la derecha\n')
        wr(f'{n} -> {res}\n')
        wr(f'{bin(n)[2:]} -> {bin(res)[2:]}\n')
    wr('---------------------------------------------\n')


wr('n -> ')
n = int(rl())
wr('k -> ')
k = int(rl())
par_o_Impar(n)
verificar_K_esimo_Bit_Encendido(n, k)
encender_K_esimo_Bit(n, k)
apagar_K_esimo_Bit(n, k)
invertir_K_esimo_Bit(n, k)
invertir_All_Bits(n)
devolver_Bit_Encendido_Derecha(n)
devolver_Bit_Apagado_Derecha(n)
encender_Bit_Apagado_Derecha(n)
apagar_Bit_Encendido_Derecha(n)
