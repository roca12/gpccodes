
#include <bits/stdc++.h> 
using namespace std;

const int n = 6;
const int m = 8;
int visited[n][m]; 
int result[n][m];
int COUNT;

bool is_valid(int x, int y, int key, int input[n][m]) {
    if (x < n && y < m && x >= 0 && y >= 0) {
        if (visited[x][y] == false && input[x][y] == key)
            return true;
        else
            return false;
    }
    else
        return false;
}


void BFS(int x, int y, int i, int j, int input[n][m]) {
    if (x != y)
        return;
    visited[i][j] = 1;
    COUNT++;
    int x_move[] = {0, 0, 1, -1};
    int y_move[] = {1, -1, 0, 0}; 
    for (int u = 0; u < 4; u++)
        if (is_valid(i + y_move[u], j + x_move[u], x, input))
            BFS(x, y, i + y_move[u], j + x_move[u], input);
}


void reset_visited() {
    for (int i = 0; i < n; i++)
        for (int j = 0; j < m; j++)
            visited[i][j] = 0;
}
 

void reset_result(int key, int input[n][m]) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (visited[i][j] && input[i][j] == key)
                result[i][j] = visited[i][j];
            else
                result[i][j] = 0;
        }
    }
}

void print_result(int res) {
    cout << "The largest connected "
            << "component of the grid is :" << res << "\n";
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (result[i][j])
                cout << result[i][j] << " ";
            else
                cout << ". ";
        }
        cout << "\n";
    }
}

void computeLargestConnectedGrid(int input[n][m]) {
    int current_max = INT_MIN;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            reset_visited();
            COUNT = 0;
            if (j + 1 < m)
                BFS(input[i][j], input[i][j + 1], i, j, input);
            if (COUNT >= current_max) {
                current_max = COUNT;
                reset_result(input[i][j], input);
            }
            reset_visited();
            COUNT = 0;
            if (i + 1 < n)
                BFS(input[i][j], input[i + 1][j], i, j, input);
            if (COUNT >= current_max) {
                current_max = COUNT;
                reset_result(input[i][j], input);
            }
        }
    }
    print_result(current_max);
}

int main() {
    int input[n][m] = {
        { 1, 4, 4, 4, 4, 3, 3, 1},
        { 2, 1, 1, 4, 3, 3, 1, 1},
        { 3, 2, 1, 1, 2, 3, 2, 1},
        { 3, 3, 2, 1, 2, 2, 2, 2},
        { 3, 1, 3, 1, 1, 4, 4, 4},
        { 1, 1, 3, 1, 1, 4, 4, 4}
    };
    computeLargestConnectedGrid(input);
    return 0;
}
