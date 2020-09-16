#include <iostream>
#include <string.h>
#define FAST ios_base::sync_with_stdio(false);cin.tie(NULL);
#define MAX_V 10005

using namespace std;

int minimo(int a, int b){
    int res = a;
    if(b < a){
        res = b;
    }
    return res;
}

void findLPS(char text[], int N){
    if(N == 0){
        return;
    }
    N = 2 * N + 1;
    int L[N];
    L[0] = 0;
    L[1] = 1;
    int C = 1; //Posicion central
    int R = 2; //Posicion Centro derecho
    int i = 0; //Posicion actual derecho
    int iMirror; //Posicion actual izquierda
    int maxLPSLength = 0;
    int maxLPSCenterPosition = 0;
    int start = -1;
    int ended = -1;
    int diff = -1;
    for(i = 2; i < N; i++){
        iMirror = 2 * C - i;
        L[i] = 0;
        diff = R - i;
        if(diff > 0){
            L[i] = minimo(L[iMirror], diff);
        }
    /*Intente expandir palíndromo centrado en currentRightPosition i
    Aquí para posiciones impares, comparamos caracteres y
    si coinciden, aumente la longitud de LPS en UNO
    Si la posición es igual, solo incrementamos LPS en UNO sin*/
    try{
        while(((i + L[i]) < N && (i - L[i]) > 0)
            && (((i + L[i] + 1) % 2 == 0)
            || (text[(i + L[i] + 1) / 2] == text[(i - L[i] - 1) / 2]))){
                    L[i]++;
            }
        }catch(exception& e){
        }
        //Comparacion de cualquier caracter
        if(L[i] > maxLPSLength){
            maxLPSLength = L[i];
            maxLPSCenterPosition = i;
        }
        if(i + L[i] > R){
            C = i;
            R = i + L[i];
        }
    }
    start = (maxLPSCenterPosition - maxLPSLength) / 2;
    ended = start + maxLPSLength - 1;
    cout << "LPS del string es: ";
    for(i = start; i <= ended; i++){
        cout << text[i];
    }
    cout<<endl;
    int tam = sizeof(L) / sizeof(L[0]);
    for(i = 0; i < tam; i++){
        cout << L[i] << " ";
    }
    cout<<endl;
}

int main()
{
    FAST
    char text[MAX_V];
    gets(text);
    int N = strlen(text);
    findLPS(text, N);
    return 0;
}
