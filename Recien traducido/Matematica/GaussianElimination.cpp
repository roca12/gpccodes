#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;
const int MAX = 100;
int n = 3;
double matrix[MAX][MAX];
double result[MAX];

vector<double> gauss() {
    vector<double> ans;
    for (int i = 0; i < n; i++) {
        ans.emplace_back(0.0);
    }
    double temp;
    for (int i = 0; i < n; i++) {
        int pivot = i;
        for (int j = i + 1; j < n; j++) {
            temp = abs(matrix[j][i]) - abs(matrix[pivot][i]);
            if (temp > 0.000001) {
                pivot = j;
            }
        }
        double temp2[n];
        copy(matrix[i], matrix[i] + n, temp2);
        copy(matrix[pivot], matrix[pivot] + n, matrix[i]);
        copy(temp2, temp2 + n, matrix[pivot]);
        temp = result[i];
        result[i] = result[pivot];
        result[pivot] = temp;
        if (!(abs(matrix[i][i]) < 0.000001)) {
            for (int k = i + 1; k < n; k++) {
                temp = -matrix[k][i] / matrix[i][i];
                matrix[k][i] = 0;
                for (int l = i + 1; l < n; l++) {
                    matrix[k][l] += matrix[i][l] * temp;
                }
                result[k] += result[i] * temp;
            }
        }
    }
    for (int m = n - 1; m >= 0; m--) {
        temp = result[m];
        for (int i = n - 1; i > m; i--) {
            temp -= ans.at(i) * matrix[m][i];
        }
        auto itPos = ans.begin() + m;
        ans.insert(itPos, temp / matrix[m][m]);
        itPos = ans.begin() + m + 1;
        ans.erase(itPos);
    }
    return ans;
}

int main() {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            matrix[i][j] = rand() % 100;
        }
    }
    for (int i = 0; i < n; i++) {
        result[i] = rand() % 100;
    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cout << matrix[i][j] << " ";
        }
        cout << "= " << result[i];
        cout << endl;
    }
    vector<double> res = gauss();
    for (double re : res) {
        cout << re << " ";
    }
}
