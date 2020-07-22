import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;


public class Eulerian_Cycle_Directed_Graph {

    public static void main(String[] args) {
       Graph g =new Graph(5);
       g.addEdge(1, 0);
       g.addEdge(0, 2);
       g.addEdge(2, 1);
       g.addEdge(0, 3);
       g.addEdge(3, 4);
       g.addEdge(4, 0);
       if(g.isEulerian()){
           System.out.println("El grafo es euleriano");
       }else{
           System.out.println("El grafo dado no es euleriano");
       }
    }
    
    static class Graph{
        int V;
        LinkedList <Integer> adj[];
        int in[];
        
        public Graph(int v) {
            V = v;
            adj = new LinkedList[v];
            in = new int[V];
            for (int i = 0; i < v; ++i) {
                adj[i] = new LinkedList<>();
                in[i] = 0;
            }
        }
        
        void addEdge(int source, int destiny){
           adj[source].add(destiny);
           in[destiny]++;
        }
        void DFSUtil(int v, boolean visited[]){
            visited[v] = true;
            int n;
            for(int i = 0; i < adj[v].size(); ++i){
                n = adj[v].get(i);
                if(!visited[n]){
                    DFSUtil(n, visited);
                }
            }
        }
        Graph getTranspose(){
            Graph g = new Graph(V);
            for (int v = 0; v < V; v++) {
                Iterator <Integer> i = adj[v].listIterator();
                while(i.hasNext()){
                    g.adj[i.next()].add(v);
                    (g.in[v])++;
                }
            }
            return g;
        }
        boolean isSC(){
            boolean visited[] = new boolean[V];
            Arrays.fill(visited, false);
            DFSUtil(0, visited);
            for (int i = 0; i < V; i++) {
                if(visited[i] == false){
                    return false;
                }
            }
            Graph gr = getTranspose();
            Arrays.fill(visited,false);
            gr.DFSUtil(0, visited);
            for (int i = 0; i < V; i++) {
                if(visited[i] == false){
                    return false;
                }
            }
            return true;
        }
        
        boolean isEulerian(){
            if(isSC()==false){
                return false;
            }
            for (int i = 0; i < V; i++) {
                if(adj[i].size() != in[i]){
                    return false;
                } 
            }
            return true;
        }
    }
}
