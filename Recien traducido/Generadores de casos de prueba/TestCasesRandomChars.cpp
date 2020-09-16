#include<bits/stdc++.h> 
using namespace std;

#define RUN 5 
#define MAX 25 

void randomChars() {
    srand(time(NULL));
    for (int i = 1; i <= RUN; i++)
        printf("%c\n", 'a' + rand() % MAX);
}

int main() {
    randomChars();
}
