#include <bits/stdc++.h>
#include <cstdlib>
using namespace std;
int main(){
    string a="puto_batman123yimail",result;
    regex e ("[\\d]");
    regex_replace(std::back_inserter(result), a.begin(), a.end(), e, "@");
    cout<<result<<endl;
    return 0;
}
