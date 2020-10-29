#include <bits/stdc++.h>
using namespace std;
string ReplaceAll(string str, const string& from, const string& to) {
    size_t start_pos = 0;
    while((start_pos = str.find(from, start_pos)) != std::string::npos) {
        str.replace(start_pos, from.length(), to);
        start_pos += to.length();
    }
    return str;
}
int main(){
    string str="string antiguo";
    cout<<str<<endl;
    str=ReplaceAll(str,"antiguo","nuevo");
    cout<<str<<endl;
    str=ReplaceAll(str," ","");
    cout<<str<<endl;
    return 0;
}
