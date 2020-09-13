
#include<bits/stdc++.h> 
using namespace std;

#define RUN 5
#define MAX 25 
#define MAXLEN 100 

void randString() {
    srand(time(NULL));
    int LEN; 
    for (int i = 1; i <= RUN; i++) {
        LEN = 1 + rand() % MAXLEN;
        printf("%d\n", LEN);
        for (int j = 1; j <= LEN; j++)
            printf("%c", 'a' + rand() % MAX);
        printf("\n");
    }
}

int main() {
    randString();
}
