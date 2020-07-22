//Programa para el problema del tour del caballo

#include <bits/stdc++.h>

using namespace std;
const int N = 8;

/*Una función que verifica si i.j es
indice valido para un tablero n*n.*/

bool isSafe(int x, int y, int sol [N][N]){
    return (x >=0 && x < N && y >= 0 && y < N && sol[x][y] == -1);
}
//Imprimir la Solución
void printSolution(int sol[N][N]){
    for(int x = 0; x < N; x++){
        for(int y = 0; y < N; y++){
             cout << sol [x][y] << "\t";
        }
        cout << endl;
    }
}

bool solveKTUtil(int x, int y, int movei, int sol[N][N], int xMove[], int yMove[]){
    int k, next_x, next_y;
    if(movei == N*N){
        return true;
    }
    /*Intenta todos los movimientos desde la coordenada
    x & y*/
    for(k = 0; k < 8; k++){
        next_x = x + xMove[k];
        next_y = y + yMove[k];
        if(isSafe(next_x, next_y,sol)){
            sol[next_x][next_y] = movei;
            if(solveKTUtil(next_x, next_y, movei + 1, sol, xMove, yMove)){
            return true;
            }else{
                sol[next_x][next_y] = -1;//Backtracking
            }
        }
    }
    return false;
}

/*Esta función resuelve el problema de Knight Tour.
utilizando Backtracking. Esta función principalmente
utiliza solveKTUtil () para resolver el problema. Eso
devuelve falso si no es posible realizar un recorrido completo,
De lo contrario, devuelve true e imprime el recorrido.
Tenga en cuenta que puede haber más de una
soluciones, esta función imprime una de las
soluciones viables.*/

bool solveKT(){
    int sol[N][N];

    /*Inicializando matriz de solución*/

    memset(sol, -1, sizeof sol);

    /* xMove[] y yMove[] define el siguiente movimiento del caballo
    xMove[] para siguiente valor en x
    yMove[] para siguiente valor en y*/

    int xMove [8] = {2, 1, -1, -2, -2, -1, 1, 2};
    int yMove [8] = {1, 2, 2, 1, -1, -2, -2, -1};
    /*Desde que el caballero inicie en el primer bloque*/
    sol[0][0] = 0;
    if(!solveKTUtil(0, 0, 1, sol, xMove, yMove)){
        printf("No existe la solucion");
        return false;
    }else{
        printSolution(sol);
    }
    return true;
}

int main()
{
    solveKT();

}
