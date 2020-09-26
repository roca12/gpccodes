from collections import deque

cola = deque()

cola.appendleft("Luciano Chavarria - 79291")
cola.appendleft("cristian perez - 61551")
cola.appendleft("Edwin Villarraga - 84604")

while len(cola) != 0:
    print(f"en la punta esta: {cola[-1]}")
    print(f"atendi a {cola.pop()}")