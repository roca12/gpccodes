/*
TOCA ARREGLAR EL COMPARE TO
*/
#include <bits/stdc++.h>
using namespace std;
int compareTo(int a,int b){
    if(a==b){
        return 0;
    }
    else if(a>b){
        return 1;
    }else{
        return -1;
    }
}
struct Suffix{
    int index;
    int rankk;
    int next;
};
bool cmp(Suffix s,Suffix other){
    if(s.rankk!=other.rankk){
        return compareTo(other.rankk,s.rankk);
    }
    return compareTo(other.next,s.next);
}
map<int,Suffix>suffixes;
vector<int>suffixArray(string s){
    int n=s.size();
    vector<Suffix> su(n);
    for(int i=0;i<n;i++){
        su[i]={i,s[i]-'$'};
    }
    for(int i=0;i<n;i++){
        su[i].next=(i+1<n?su[i+1].rankk:-1);
    }
    sort(su.begin(),su.end(),cmp);
    int ind[n];
    for(int length=4;length<2*n;length<<=1){
        int rankk=0,prev=su[0].rankk;
        ind[su[0].index]=0;
        for(int i=1;i<n;i++){
            if(su[i].rankk==prev && su[i].next==su[i-1].next){
                prev=su[i].rankk;
                su[i].rankk=rankk;
            }else{
                prev=su[i].rankk;
                su[i].rankk=rankk++;
            }
            ind[su[i].index]=i;
        }
        for(int i=0;i<n;i++){
            int nextP=su[i].index+length/2;
            su[i].next=(nextP<n?su[ind[nextP]].rankk:-1);
        }
        sort(su.begin(),su.end(),cmp);
    }
    vector<int>suf(n);
    for(int i=0;i<n;i++){
        suf[i]=su[i].index;
    }
    int k=0;
    for(Suffix i:su){
        suffixes.insert({su[k].index,su[k]});
        k++;
    }
    return suf;
}
void printArr(vector<int>arr){
    for(int i:arr){
        cout<<i<<" ";
    }
    cout<<endl;
}
int main(){
    string txt="banana";
    vector<int>suf_arr=suffixArray(txt);
    int n=txt.size();
    cout<<"All suffixes"<<endl;
    for(auto entry:suffixes){
        cout<<"index: "<<entry.first<<". suffix: "<<txt.substr(entry.second.index)<<endl;
    }
    cout<<"Following is suffix array for "<<txt<<" sorted:"<<endl;
    printArr(suf_arr);
    return 0;
}
