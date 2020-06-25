#include <bits/stdc++.h>
#define MAX_V 101
//typedef pair Edge;
using namespace std;
/*
class Graph{
private:
    int V;
    vector<int> adj[];
public:
    Graph(int V,vector)
    void addEdge(int v,int w){
    void DFSUtil(int v,bool visited[]){
    void DFS(int v){
        bool visited[V];
        DFSUtil(v,visited);
};*/
struct Graph{
    int V;
    vector<int> adj[];
    void addEdge(int v,int w){
        adj[v].push_back(w);
        }
    void DFSUtil(int v,bool visited[]){
        visited[v]=true;
        cout<<v<<" ";
        vector<int>::iterator it=adj[v].begin();
        for(it=adj[v].begin();it!=adj[v].end();it++)
            if(!visited[*it]){
                DFSUtil(*it,visited);
        }
    }
     void DFS(int v){
        bool visited[V];
        DFSUtil(v,visited);
    }
};
int main()
{
    Graph gra={4};
    gra.addEdge(0,1);
    gra.addEdge(0,2);
    gra.addEdge(1,2);
    gra.addEdge(2,0);
    gra.addEdge(2,3);
    gra.addEdge(3,3);
    int initial=0;
    gra.DFS(initial);
    return 0;
}
