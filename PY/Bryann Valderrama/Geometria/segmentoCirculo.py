from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write


def setCirc(radio, angle):
    if angle >= 360:
        wr(f'Angulo no es posible')
    else:
        sector = ((22 * radio * radio)/7) * (angle/360)
        wr(f'{sector} cm^2')


r = 6
a = 22.7
setCirc(r, a)
