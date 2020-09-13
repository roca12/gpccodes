
#include<bits/stdc++.h> 
using namespace std;

#define RUN 5 
#define MAX 100000 
#define MAXNUM 100 

void randSortedArray() {
    srand(time(NULL));
    int NUM; 
    for (int i = 1; i <= RUN; i++) {
        NUM = 1 + rand() % MAXNUM;
        int arr[NUM];
        printf("%d\n", NUM);
        for (int j = 0; j < NUM; j++)
            arr[j] = rand() % MAX;
        sort(arr, arr + NUM);
        for (int j = 0; j < NUM; j++)
            printf("%d ", arr[j]);

        printf("\n");
    }
}

int main() {
    randSortedArray();
}
