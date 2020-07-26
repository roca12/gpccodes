 #include <iostream>
 #include <vector>
 #include <utility>
 #include <algorithm>

 using namespace std;
 const int MAX = 1000;
 int id[MAX], nodes, edges;  //El arreglo id es usado para verificar el padre del vertice
 pair <long long, pair<int, int> > p[MAX];

//Inicializar el arreglo id de padre
 void init()
 {
     for(int i = 0;i < MAX;++i)
         id[i] = i;
 }

 int root(int x)
 {
     while(id[x] != x)  //Si x no es padre de si mismo, actualice el padre
     {
         id[x] = id[id[x]];
         x = id[x];
     }
     return x; //Retorne el padre
 }

//Funcion para union
 void union1(int x, int y)
 {
     int p = root(x);
     int q = root(y);
     id[p] = id[q];
 }

 //función para descubrir los caminos en el árbol de expansión mínima y su costo
 long long kruskal(pair <long long, pair <int, int>> p[])
 {
     int x, y;
     long long cost, minimumCost = 0;
     for(int i = 0;i < edges;++i)
     {
         x = p[i].second.first;
         y = p[i].second.second;
         cost = p[i].first;
         if(root(x) != root(y))
         {
             minimumCost += cost;
    //Imprimir los caminos contenidos por el arbol de expansión mínima
     cout<<x<<" ----> "<<y<<" :"<<p[i].first<<endl;
             union1(x, y);
         }
     }
     return minimumCost;
 }

 int main()
 {
     int x, y;
     long long weight, cost, minimumCost;
     init();
     cout <<"Enter Nodes and edges"<<endl;
     cin >> nodes >> edges;

     //Ingreso de los vertices y el costo o peso
     for(int i = 0;i < edges;++i)
     {
         cout<<"Enter the value of X, Y and edges"<<endl;
     cin >> x >> y >> weight;
         p[i] = make_pair(weight, make_pair(x, y));
     }

     //Ordenar los caminos de acuerdo a su costo
     sort(p, p + edges);
     minimumCost = kruskal(p);
     cout <<"Minimum cost is "<< minimumCost << endl;
     return 0;
 }
