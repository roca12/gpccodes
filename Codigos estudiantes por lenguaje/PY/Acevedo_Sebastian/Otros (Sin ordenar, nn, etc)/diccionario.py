from sys import stdin,stdout
import operator

dicc = {}
dicc['Programar'] = 'Utilizacion de codigo para ejecutar un programa'
dicc['Funar'] = 'Gritar como una loca'
dicc['Futbol'] = 'Deporte con una pelota y arcos'
dicc['Among Us'] = 'Juego para funar'
dicc['Impostor'] = 'Si, ya sabemos'
dicc['Edwin'] = 'Parlon de Miedo'

dicc_ordenado_keys = sorted(dicc.items(),key=operator.itemgetter(0)) #ordenar por las llaves

dicc_ordenado_values = sorted(dicc.items(),key=operator.itemgetter(1)) #ordenar por valores

print(dicc_ordenado_keys)

print(dicc_ordenado_values)

"""
dicc = {}
dicc['Programar'] = 'Utilizacion de codigo para ejecutar un programa'
dicc['Funar'] = 'Gritar como una loca'
dicc['Futbol'] = 'Deporte con una pelota y arcos'
dicc['Among Us'] = 'Juego para funar'
dicc['Impostor'] = 'Si, ya sabemos'
dicc['Edwin'] = 'Parlon de Miedo'

for concepto, definicion in dicc.items():
    print(f'{concepto} -> {definicion}')
"""
