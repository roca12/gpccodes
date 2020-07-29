#include<bits/stdc++.h>
#include<cstdlib>
#define MAX 1000
using namespace std;
int main() {
    char str[MAX];
    while(gets(str)){
        for(int i=0;i<strlen(str);i++){
                char c=str[i]-7;
        printf("%c",c);
        }
        cout<<endl;
    }
}
