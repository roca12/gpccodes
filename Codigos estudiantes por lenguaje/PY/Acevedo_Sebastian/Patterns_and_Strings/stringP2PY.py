'''
Created on 12/10/2020
@author: Sebastian
'''
from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write

nombre = rl().strip()  # Se usa strip para eliminar cualquier espacio al inicio o final
wr(f'{nombre} sabe programar\n')  # Dentro de las llaves se pone la variable

frase = ' le gusta la pizza'

completo = nombre + frase
wr(f'{completo}\n')

completo = completo[2:7]  # Desde la pos 2 hasta la 6
wr(f'{completo}\n')

if 'gusta' in frase:  # Verificar si substring esta dentro de string
    wr('Existe\n')
else:
    wr('No existe\n')

wr(f'{frase.index("l")}\n')  # Indice de primera ocurrencia
wr(f'{frase.upper()}\n')  # Convertir a Mayusculas
wr(f'{frase.lower()}\n')  # Convertir a Minusculas
