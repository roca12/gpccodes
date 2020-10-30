from collections import deque

cola = deque()

for i in range(10):
    cola.appendleft(i)

while len(cola) != 0:
    print(cola.pop())
'''
for i in range(10):
    cola.append(i)

while len(cola) != 0:
    print(cola.popleft())
