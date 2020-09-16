#include<bits/stdc++.h>
#include<cstdlib>
//---------------//
using namespace std;
char xor_c(char a,char b){
    return (a==b)?'0':'1';
}
char flip(char c){
    return (c==0)?'1':'0';
}
string grayToBinary(string gray){
    string binary = "";
    int tam = gray.size();
    binary += gray[0];
    for(int i = 1; i < tam; i++){
        if(gray[i] == '0'){
            binary += binary[i - 1];
        }else{
            binary += flip(binary[i - 1]);
        }
    }
    return binary;
}
string binaryToGrey(string binary){
    string grey="";
    grey+=binary[0];
    for(int i=1;i<binary.size();i++){
        grey+=xor_c((binary[i-1]),(binary[i]));
    }
    return grey;
}
int main() {
    string n="01001";
    cout<<(binaryToGrey(n))<<endl;
    n="01001";
    cout<<(grayToBinary(n))<<endl;
}
