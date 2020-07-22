// Programa java para el problema del tour del caballo

public class Knight_Tour_Backtracking {

    static int N = 8;

    /* Una función que verifica si i.j es
    indice valido para un tablero n*n*/
    static boolean isSafe(int x, int y, int sol[][]) {
        return (x >= 0 && x < N && y >= 0
                && y < N && sol[x][y] == -1);
    }

    /* Imprimir la solución*/
    static void printSolution(int sol[][]) {
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                System.out.print(sol[x][y] + "\t");
            }
            System.out.println();
        }
    }

    /*Esta función resuelve el problema de Knight Tour.
       utilizando Backtracking. Esta función principalmente
       utiliza solveKTUtil () para resolver el problema. Eso
       devuelve falso si no es posible realizar un recorrido completo,
       De lo contrario, devuelve true e imprime el recorrido.
       Tenga en cuenta que puede haber más de una
       soluciones, esta función imprime una de las
       soluciones viables.*/
    static boolean solveKT() {
        int sol[][] = new int[N][N];
        /* Inicializando la matriz de solución*/
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                sol[x][y] = -1;
            }
        }
        /* xMove[] y yMove[] define el siguiente movimiento del caballo 
          xMove[] para siguiente valor en x
          yMove[] para siguiente valor en y */
        int xMove[] = {2, 1, -1, -2, -2, -1, 1, 2};
        int yMove[] = {1, 2, 2, 1, -1, -2, -2, -1};
        //Desde que el caballero inicie en el primer bloque
        sol[0][0] = 0;
        if (!solveKTUtil(0, 0, 1, sol, xMove, yMove)) {
            System.out.println("No existe la solución");
            return false;
        } else {
            printSolution(sol);
        }
        return true;
    }

    static boolean solveKTUtil(int x, int y, int movei,
            int sol[][], int xMove[],
            int yMove[]) {
        int k, next_x, next_y;
        if (movei == N * N) {
            return true;
        }
        /* Intenta todos los movimientos desde la coordenada
        x  y y*/
        for (k = 0; k < 8; k++) {
            next_x = x + xMove[k];
            next_y = y + yMove[k];
            if (isSafe(next_x, next_y, sol)) {
                sol[next_x][next_y] = movei;
                if (solveKTUtil(next_x, next_y, movei + 1,
                        sol, xMove, yMove)) {
                    return true;
                } else {
                    sol[next_x][next_y] = -1;// backtracking 
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {
        solveKT();
    }
}
