#include <bits/stdc++.h>
using namespace std;
struct z_algorithm{
    vector<int> z_algorithm_array(string s) {
      int n = s.size();
      vector<int> z(n);
      int x = 0, y = 0;
      for(int i = 1; i < n; ++i) {
        z[i] = max(0, min(z[i-x], y-i+1));
        while (i+z[i] < n && s[z[i]] == s[i+z[i]])
          x = i, y = i+z[i], z[i]++;
      }
      return z;
    }
    void search_pattern(string text, string pattern){
        string concat = pattern + "$" + text;
        int l = concat.size();
        vector<int>Z=z_algorithm_array(concat);
        for (int i = 0; i < l; ++i){
            if (Z[i] == pattern.length()){
                int index = i - pattern.size() -1;
                cout << "Pattern found at index "
                <<index<<" to "<<index+pattern.size();
            }
        }
    }
};
int main(){
    string text = "Lorem ipsum dolor sit amet, consectetur";
    string pattern = "dolor";
    z_algorithm ans;
    ans.search_pattern(text,pattern);
}
