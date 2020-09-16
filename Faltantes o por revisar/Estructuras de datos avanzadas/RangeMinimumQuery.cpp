#include <bits/stdc++.h> 
#define ll long long 

using namespace std;

void construct_segment_tree(vector<int>& segtree,
        vector<int> &a, int n) {
    for (int i = 0; i < n; i++)
        segtree[n + i] = a[i];
    for (int i = n - 1; i >= 1; i--)
        segtree[i] = min(segtree[2 * i],
            segtree[2 * i + 1]);
}

void update(vector<int>& segtree, int pos, int value,
        int n) {
    pos += n;
    segtree[pos] = value;
    while (pos > 1) {
        pos >>= 1;
        segtree[pos] = min(segtree[2 * pos],
                segtree[2 * pos + 1]);
    }
}

int range_query(vector<int>& segtree, int left, int
        right, int n) {
    left += n;
    right += n;
    int mi = (int) 1e9;

    while (left < right) {
        if (left & 1) {
            mi = min(mi, segtree[left]);
            left++;
        }
        if (right & 1) {
            right--;
            mi = min(mi, segtree[right]);
        }
        left /= 2;
        right /= 2;
    }
    return mi;
}


int main() {
    vector<int> a = {2, 6, 10, 4, 7, 28, 9, 11, 6, 33};
    int n = a.size();
    vector<int> segtree(2 * n);
    construct_segment_tree(segtree, a, n);
    int left = 0, right = 5;
    cout << "Minimum in range " << left << " to "
            << right << " is " << range_query(segtree, left,
            right + 1, n) << "\n";

    int index = 3, value = 1;
    update(segtree, index, value, n); 
    left = 2, right = 6;
    cout << "Minimum in range " << left << " to "
            << right << " is " << range_query(segtree,
            left, right + 1, n) << "\n";

    return 0;
} 