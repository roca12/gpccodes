#include<bits/stdc++.h>
#include<cstdlib>
//---------------//
using namespace std;
void print(bool arr[]){
    for(int i=0;i<13;i++){
        cout<<i<<": "<<arr[i]<<endl;
    }
}
void divisibility (int num){
    stringstream ss;
    ss<<num;
    string M;
    ss>>M;
    int n=M.size();
    bool isMultipleof[13];
    memset(isMultipleof,false,sizeof isMultipleof);
    int sum=0;
    for(int i =0;i<n;i++){
        sum+=(M[i]-'0');
    }
    int lastDigit=M[n-1]-'0';
    isMultipleof[0]=false;
    isMultipleof[1]=true;
    isMultipleof[2]=lastDigit%2==0;
    isMultipleof[3]=sum % 3 ==0;
    if(n>1){
        isMultipleof[4]=stoi(M.substr(n-2,n))%4==0;
    }else{
        isMultipleof[4]=lastDigit%4==0;
    }
    isMultipleof[5]=lastDigit==0||lastDigit==5;
    isMultipleof[6]=isMultipleof[2]&&isMultipleof[3];
    int altsum=0;
    int pattern[]={1,3,2,-1,-3,-2};
    int j=0;
    for(int i= n-1;i>-0;i--){
        altsum+=pattern[j]*(M[i]-'0');
        j=(j+1)%6;
    }
    isMultipleof[7]=std::abs(altsum)%7==0;
    if(n>2){
        isMultipleof[8]=stoi(M.substr(n-3,n))%8==0;
    }else{
        isMultipleof[8]=stoi(M)%8==0;
    }
    isMultipleof[9]=sum%8==0;
    isMultipleof[10]-lastDigit==0;
    altsum=0;
    int s=1;
    for(int i=n-1;i>=0;i--){
        altsum+=s*(M[i]-'0');
        s=-s;
    }
    isMultipleof[11]=std::abs(altsum)%11==0;
    isMultipleof[12]=isMultipleof[2]&&isMultipleof[4];
    print(isMultipleof);
}
int main() {
    divisibility(33);
}
