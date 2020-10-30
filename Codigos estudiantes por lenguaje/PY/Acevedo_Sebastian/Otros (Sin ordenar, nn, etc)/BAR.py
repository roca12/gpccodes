from collections import namedtuple
from collections import deque  

Persona = namedtuple('Persona', ['nombre', 'edad', 'sexo'])

Persona1 = Persona('Edwin', 19, 'M')
Persona2 = Persona('Angie', 17, 'F')
Persona3 = Persona('Bryann', 20, 'M')
Persona4 = Persona('Yeison', 17, 'M')
Persona5 = Persona('Yuliana', 19, 'F')
Persona6 = Persona('Sebastian', 20, 'M')
Persona7 = Persona('Diana', 19, 'F')
Persona8 = Persona('Laura', 20, 'F')

filaBar = deque()


filaBar.append(Persona1)
filaBar.append(Persona2)
filaBar.append(Persona3)
filaBar.append(Persona4)
filaBar.append(Persona5)
filaBar.append(Persona6)
filaBar.append(Persona7)
filaBar.append(Persona8)


while(len(filaBar) != 0):
    actual = filaBar.pop()
    if actual.edad < 18:
        print(f'{actual.nombre} no tiene edad para tomar')
    else:
        print(f'{actual.nombre} tiene edad para tomar y entra al bar')
