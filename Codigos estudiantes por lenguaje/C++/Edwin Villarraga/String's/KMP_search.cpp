#include <bits/stdc++.h>
using namespace std;
vector<int> get_phi(string &p) {
    vector<int> phi(p.size());
    phi[0] = 0;
    for(int i = 1, j = 0; i < p.size(); ++i ) {
        while(j > 0 && p[i] != p[j] ) j = phi[j-1];
        if(p[i] == p[j]){
            ++j;
        }
        phi[i] = j;
    }
    return phi;
}
int get_match(string &t, string &p) {
    vector<int> phi = get_phi(p);
    int matches = 0;
    for(int i = 0, j = 0; i < t.size(); ++i ) {
        while(j > 0 && t[i] != p[j] ) j = phi[j-1];
            if(t[i] == p[j]) ++j;
                if(j == p.size()) {
                matches++;
                cout<<"Pattern found at index "<<(i - j)<<endl;
                j = phi[j-1];
            }
        }
    return matches;
}
int main(){
    string text;
    getline(cin,text);
    string pattern;
    getline(cin,pattern);
    int amount = get_match(text,pattern);
    cout<<((amount==0)?"Palabra no encontrada":
           "Palabra encontrada "+to_string(amount))<<endl;
}
