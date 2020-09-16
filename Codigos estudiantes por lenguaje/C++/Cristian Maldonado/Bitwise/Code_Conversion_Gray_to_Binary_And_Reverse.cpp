#include <iostream>
//--------------//
#define FAST ios_base::sync_with_stdio(false);cout.tie(NULL);

using namespace std;

char xor_c(char a, char b){
    return (a == b)? '0':'1';
}

string binaryToGray(string binary){
    string gray = "";
    int tam = binary.size();
    gray += binary[0];
    for(int i = 1; i < tam; i++){
        gray += xor_c(binary[i - 1], binary[i]);
    }
    return gray;
}

char flip(char c){
    return (c == '0') ? '1': '0';
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

int main()
{
    FAST
    string b1 = "111010";
    string res1 = binaryToGray(b1);
    string res2 = grayToBinary(res1);
    cout<<"De binario a Gray: "<<res1<<endl;
    cout<<"De Gray a Binario: "<<res2<<endl;
}
