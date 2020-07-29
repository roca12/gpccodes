#include <bits/stdc++.h>
using namespace std;
typedef long long int ll;
int main(){
    int c;cin>>c;
    for(int i=0;i<c;i++){
        int n,l;
        cin>>n>>l;
        set<int>st;
        st.insert(l);
        string str;
        cin>>str;
        for(int j=0;j<str.size();j++){
            if(str[j]=='L'){
                l--;
                st.insert(l);
            }
            else if(str[j]=='R'){
                l++;
                st.insert(l);
                }
            }
        cout<<st.size()<<endl;
        }
    return 0;
}
