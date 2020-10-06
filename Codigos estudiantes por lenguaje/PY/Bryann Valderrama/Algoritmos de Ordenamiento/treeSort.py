'''Tree Sort
   
   - Crea una Arbol de Busqueda Binario con los elementos del arreglo.
   - Luego realiza un recorrido entre:
        InOrder (Menor a Mayor)
        PosOrder(Mayor a Menor). 
   - Complejidad Tiempo: 
        Promedio: O(n log n)
        Peor Caso: O(n^2)
'''

from sys import stdin, stdout, maxsize
rl = stdin.readline
wr = stdout.write


class Hoja:

    def __init__(self, item):
        self.key = item
        self.right = None
        self.left = None


def init():
    global root
    root = None


def insert(key):
    global root
    root = insertRec(root, key)


def insertRec(raiz, key):
    global root

    if raiz == None:
        raiz = Hoja(key)
        return raiz

    if key < raiz.key:
        raiz.left = insertRec(raiz.left, key)
    elif key >= raiz.key:
        raiz.right = insertRec(raiz.right, key)

    return raiz


def inOrder(actual):
    if actual != None:
        inOrder(actual.left)
        wr(f'{actual.key} ')
        inOrder(actual.right)


def insertInTree(arr):
    for i in range(len(arr)):
        insert(arr[i])


arr = list(map(int, rl().split()))
root = Hoja(arr[0])
insertInTree(arr)
inOrder(root)
