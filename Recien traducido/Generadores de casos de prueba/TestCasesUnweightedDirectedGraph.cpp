
#include<bits/stdc++.h> 
using namespace std;

#define RUN 5 
#define MAX_VERTICES 20 
#define MAX_EDGES 20 

int main() {
    set<pair<int, int>> container;
    srand(time(NULL));
    int VERTICES; 
    int NUMEDGE; 
    for (int i = 1; i <= RUN; i++) {
        VERTICES = 1 + rand() % MAX_VERTICES;
        NUMEDGE = 1 + rand() % MAX_EDGES;
        while (NUMEDGE > VERTICES * (VERTICES - 1) / 2)
            NUMEDGE = 1 + rand() % MAX_EDGES;
        printf("%d %d\n", VERTICES, NUMEDGE);
        for (int j = 1; j <= NUMEDGE; j++) {
            int a = 1 + rand() % VERTICES;
            int b = 1 + rand() % VERTICES;
            pair<int, int> p = make_pair(a, b);
            while (container.find(p) != container.end()) {
                a = 1 + rand() % VERTICES;
                b = 1 + rand() % VERTICES;
                p = make_pair(a, b);
            }
            container.insert(p);
        }
        for (pair<int,int> p : container){
            printf("%d %d\n", p.first-1, p.second-1);
        }
        container.clear();
        printf("\n");
    }
    return (0);
}
