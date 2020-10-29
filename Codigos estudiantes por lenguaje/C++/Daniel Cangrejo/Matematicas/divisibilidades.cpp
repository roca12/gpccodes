#include <bits/stdc++.h>
using namespace std;
bool isMultipleOf[13];
void divisibility(int num){
    memset(isMultipleOf,false,sizeof isMultipleOf);
    string M=to_string(num);
    int n=M.size();
    int sum=0;
    for(char c:M){
        sum+=(c-'0');
    }
    int lastDigit=M[n-1]-'0';
    isMultipleOf[1]=true;
    isMultipleOf[2]=!(lastDigit&1);
    isMultipleOf[3]=sum%3==0;
    if(n>1){
        isMultipleOf[4]=stoi(M.substr(n-2,n))%4==0;
    }else{
        isMultipleOf[4]=lastDigit%4==0;
    }
    isMultipleOf[5]=lastDigit==0 || lastDigit==5;
    isMultipleOf[6]=isMultipleOf[2]&&isMultipleOf[3];
    int lastSum=0;
    int j=0;
    int pattern[]={1,3,2,-1,-3,-2};
    for(int i=n-1;i>=0;i--){
        lastSum=pattern[j]*(M[i]-'0');
        j=(j+1)%6;
    }
    isMultipleOf[7]=abs(lastSum)%7==0;
    if(n>2){
        isMultipleOf[8]=stoi(M.substr(n-3,n))%8==0;
    }else{
        isMultipleOf[8]=stoi(M)%8==0;
    }
    isMultipleOf[9]=sum%9==0;
    isMultipleOf[10]=lastDigit==0;
    isMultipleOf[11]=abs(lastSum)%11==0;
    isMultipleOf[12]=isMultipleOf[3]&&isMultipleOf[4];
    for(int i=1;i<13;i++){
        cout<<i<<" : "<<isMultipleOf[i]<<endl;
    }
}
int main(){
    int n;
    cin>>n;
    divisibility(n);
    return 0;
}
