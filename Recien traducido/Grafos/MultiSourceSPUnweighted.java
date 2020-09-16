// CPP program to demonstrate Multi-source BFS 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class MultiSourceSPUnweighted {

    static final int N = 1000000;
    // This array stores the distances of the vertices 
    // from the nearest source 
    static int dist[] = new int[N];

    //This boolean array is true if the current vertex 
    // is visited otherwise it is false 
    static boolean visited[] = new boolean[N];

    static void addEdge(ArrayList<Integer> graph[], int u, int v) {
        //Function to add 2 edges in an undirected graph 
        graph[u].add(v);
        graph[v].add(u);
    }

    // Multisource BFS Function 
    static void Multisource_BFS(ArrayList<Integer> graph[], LinkedList<Integer> q) {
        while (!q.isEmpty()) {
            int k = q.getFirst();
            q.pollFirst();
            for (Integer i : graph[k]) {
                if (!visited[i]) {
                    // Pushing the adjacent unvisited vertices 
                    // with distance from current source = this 
                    // vertex's distance + 1 
                    q.push(i);
                    dist[i] = dist[k] + 1;
                    visited[i] = true;
                }
            }
        }
    }

    // This function calculates the distance of each 
    // vertex from nearest source 
    static void nearestTown(ArrayList<Integer> graph[], int n, int sources[], int s) {
        //Create a queue for BFS 
        LinkedList<Integer> q = new LinkedList<>();

        //Mark all the source vertices as visited and enqueue it 
        for (int i = 0; i < s; i++) {
            q.push(sources[i]);
            visited[sources[i]] = true;
        }

        Multisource_BFS(graph, q);

        //Printing the distances 
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + dist[i]);
        }
    }

    public static void main(String[] args) {
        // Number of vertices 
        int n = 6;
        ArrayList<Integer> graph[] = new ArrayList[n + 1];
        Arrays.fill(graph, new ArrayList<>());
        // Edges 
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 6);
        addEdge(graph, 2, 6);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 6);
        addEdge(graph, 5, 4);
        addEdge(graph, 6, 5);
        addEdge(graph, 3, 4);
        addEdge(graph, 5, 3);

        // Sources 
        int sources[] = {1, 5};

        int S = sources.length;

        nearestTown(graph, n, sources, S);

    }

}
