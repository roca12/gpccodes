#include <iostream>
#include <vector>

using namespace std;

bool isSafe(vector<vector<int>> &board, int row, int column){
    int i, j, size_board = (int) board.size();
    //Tachar toda la fila
    j = column;
    while(--j >= 0){
        if(board[row][j] == 2){
            return false;
        }
        board[row][j] = 1;
    }
    //Tachar hacia la derecha
    j = column;
    while(++j < size_board){
        if(board[row][j] == 2){
            return false;
        }
        board[row][j] = 1;
    }
    //Tachar hacia Arriba
    i = row;
    while(--i > 0){
        if(board[i][column] == 2){
            return false;
        }
        board[i][column] = 1;
    }
    //Tachar hacia abajo
    i = row;
    while(++i < size_board){
        if(board[i][column] == 2){
            return false;
        }
        board[i][column] = 1;
    }
    //Tachar diagonal derecha abajo
    i = row; j = column;
    while(++i < size_board && ++j < size_board){
        if(board[i][j] == 2){
            return false;
        }
        board[i][j] = 1;
    }
    //Tachar Diagonal derecha arriba
    i = row; j = column;
    while(--i >= 0 && ++j < size_board){
        if(board[i][j] == 2){
            return false;
        }
        board[i][j] = 1;
    }
    //Tachar Diagonal izquierda arriba
    i = row; j = column;
    while(--i >= 0 && --j >= 0){
        if(board[i][j] == 2){
            return false;
        }
        board[i][j] = 1;
    }
    //Tachar Diagonal izquierda abajo
    i = row; j = column;
    while(++i < size_board && --j >= 0){
        if(board[i][j] == 2){
            return false;
        }
        board[i][j] = 1;
    }
    return true;
}

int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
    int N; bool flag = false;
    cin>>N;
    vector<vector<int>> board(N);
    for(int i = 0; i < N; i++){
        board[i].resize(N);
    }
    while(N--){
        int row, column; cin>>row>>column;
        board[row][column] = 2;
        if(isSafe(board, row, column) && flag == false){
            continue;
        }else{
            flag = true;
        }
    }
    if(flag){
        cout<<"INCORRECT"<<endl;
    }else{
        cout<<"CORRECT"<<endl;
    }
    return 0;
}
