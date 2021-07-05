#include <bits/stdc++.h>

using namespace std;

string removeCharacters(string mail){
    string dom = mail.substr(mail.find('@'));
    string temp = "";
    for(int i = 0; i < (int)mail.size(); i++){
        if(mail[i] == '@' || mail[i] == '+'){
            break;
        }else if (mail[i] == '.'){
            continue;
        }else{
            temp += mail[i];
        }
    }
    return (temp + '@' + dom);
}

int main()
{
    ios_base::sync_with_stdio(0);cin.tie(0);
    int cases; cin>>cases;
    set <string> no_rep;
    while(cases--){
        string mail;cin>>mail;
        no_rep.insert(removeCharacters(mail));
    }
    cout<<(int)no_rep.size()<<endl;
    return 0;
}
