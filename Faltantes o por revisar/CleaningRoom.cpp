
#include <bits/stdc++.h> 
using namespace std;
char A[105][105];
vector<pair<int, int> > ans;

void print() {
    cout << "Yes, the house can be"
            << " cleaned." << endl;

    for (int i = 0; i < ans.size(); i++)
        cout << ans[i].first << " "
            << ans[i].second << endl;
}

int solve(int n) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (A[i][j] == '.') {
                ans.push_back(make_pair(i + 1, j + 1));
                break;
            }
        }
    }
    if (ans.size() == n) {
        print();
        return 0;
    }

    ans.clear();

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (A[j][i] == '.') {
                ans.push_back(make_pair(i + 1, j + 1));
                break;
            }
        }
    }
    if (ans.size() == n) {
        print();
        return 0;
    }
    cout << "house cannot be cleaned."<< endl;
}


int main() {
    int n = 3;
    string s = "";
    s += ".**";
    s += ".**";
    s += ".**";
    int k = 0;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++)
            A[i][j] = s[k++];
    }
    solve(n);
    return 0;
}
