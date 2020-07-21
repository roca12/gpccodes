#include <bits/stdc++.h>

using namespace std;

int main()
{
    char letra;
    while(scanf("%c", &letra) != EOF){
        if(letra == '\n'){
            printf("\n");
        }else{
            printf("%c", letra - 7);
        }
    }
    return 0;
}
