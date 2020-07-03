#include <bits/stdc++.h>
#define tablero 101
using namespace std;
int N = 12;

bool isSafe(int x, int y, int sol[tablero][tablero]){
    return (x >= 0 && x < N && y >= 0 && y < N && sol[x][y] == -1);
}

void printSolution(int sol[tablero][tablero]){
    for (int x = 0; x < N; x++){
        for (int y = 0; y < N; y++){
            cout << sol[x][y] << "\t";
        }
        cout << endl;
    }
}
bool solveKUtil(int x, int y, int movei, int sol[tablero][tablero], int xMove[tablero], int yMove[tablero]){
    int k, next_x, next_y;
    if (movei == N * N){
        return true;
    }
    for (k = 0; k < N; k++){
        next_x = x + xMove[k];
        next_y = y + yMove[k];
        if (isSafe(next_x, next_y, sol)){
            sol[next_x][next_y] = movei;
            if (solveKUtil(next_x, next_y, movei + 1, sol, xMove, yMove)){
                return true;
            }
            else{
                sol[next_x][next_y] = -1;
            }
        }
    }
    return false;
}
bool solveKT(){
    int sol[tablero][tablero];
    for (int x = 0; x < N; x++){
        for (int y = 0; y < N; y++){
            sol[x][y] = -1;
        }
    }
    int xMove[8] = {2, 1, -1, -2, -2, -1, 1, 2};
    int yMove[8] = {1, 2, 2, 1, -1, -2, -2, -1};
    sol[0][0] = 0;
    if (!solveKUtil(0, 0, 1, sol, xMove, yMove)){
        cout << "No existe la solucion" << endl;
        return false;
    }
    else{
        printSolution(sol);
    }
    return true;
}

int main(){
    solveKT();
}
