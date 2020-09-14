#include<bits/stdc++.h> 
using namespace std;


#define RUN 1000 
#define MAX 25 
#define MAXNUM 20
#define MAXLEN 20 

void randomStrArr() {
    srand(time(NULL));
    int NUM; 
    int LEN;
    for (int i = 1; i <= RUN; i++) {
        NUM = 1 + rand() % MAXNUM;
        printf("%d\n", NUM);

        for (int k = 1; k <= NUM; k++) {
            LEN = 1 + rand() % MAXLEN;
            for (int j = 1; j <= LEN; j++)
                printf("%c", 'a' + rand() % MAX);

            printf(" ");
        }
        printf("\n");
    }
}

int main() {
    randomStrArr();
    return (0);
}
