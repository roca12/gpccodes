
#include<bits/stdc++.h> 
using namespace std;

#define RUN 5 
#define MAX 25 
#define MAXLEN 50 

void randPalindrome(){
    srand(time(NULL));
    deque<char> container;
    deque<char>::iterator it;
    int LEN; 
    for (int i = 1; i <= RUN; i++) {
        LEN = 1 + rand() % MAXLEN;
        printf("%d\n", LEN);
        if (LEN % 2)
            container.push_back('a' + rand() % MAX);

        for (int j = 1; j <= LEN / 2; j++) {
            char ch = 'a' + rand() % MAX;
            container.push_back(ch);
            container.push_front(ch);
        }
        for (it = container.begin(); it != container.end(); ++it)
            printf("%c", *it);

        container.clear();
        printf("\n");
    } 
}

int main() {
    randPalindrome();
}
