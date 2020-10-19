#include <iostream>
#include <string.h>

using namespace std;

bool strMatch(string str, string pattern, int n, int m){
    if(m == 0){
        return n == 0;
    }
    bool lookUp[n + 1][m + 1];
    memset(lookUp, false, sizeof lookUp);
    lookUp [0][0] = true;
    for(int j = 1; j <= m; j++){
        if(pattern[j - 1] == '*'){
            lookUp[0][j] = lookUp[0][j - 1];
        }
    }
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= m; j++){
            if(pattern[j - 1] == '*'){
                lookUp[i][j] = lookUp[i][j - 1] || lookUp[i  -1][j];
            }else if(pattern[j - 1] == '?' || str[i - 1] == pattern[j - 1]){
                lookUp[i][j] = lookUp[i - 1][j - 1];
            }else{
                lookUp[i][j] = false;
            }
        }
    }
    return lookUp[n][m];
}

int main()
{
    string str = " \' console.log()";
    string pat = "\'printf();";
    if(strMatch(str, pat, str.size(), pat.size())){
        cout << "Si" << endl;
    }else{
        cout << "No" << endl;
    }
    return 0;
}