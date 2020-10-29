from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write


class Hoja:

    def __init__(self, item=None):
        self.key = item
        self.right = None
        self.left = None

      
root = Hoja()


def init():
    global root
    root = None


def insert(key):
    global root
    root = insertRec(root, key)


def insertRec(raiz, key):
   
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

      
def posOrder(actual):
    if actual != None:
        posOrder(actual.right)
        wr(f'{actual.key} ')
        posOrder(actual.left)
      
      
def insertInTree(arr):
    for i in range(len(arr)):
        insert(arr[i])


arr = list(map(int, rl().split()))
init()
insertInTree(arr)
inOrder(root)
wr('\n')
posOrder(root)
