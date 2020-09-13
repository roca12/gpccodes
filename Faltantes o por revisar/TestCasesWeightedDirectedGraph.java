// A C++ Program to generate test cases for 
// an unweighted directed graph 
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class TestCasesWeightedDirectedGraph {

// Define the number of runs for the test data 
// generated 
    static int RUN = 5;

// Define the maximum number of vertices of the graph 
    static int MAX_VERTICES = 20;

// Define the maximum number of edges 
    static int MAX_EDGES = 20;
    static int MAXWEIGHT =200;

    static class Pair {

        int first, second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

    }

 static int getIndex(Set<Pair> set, Pair value) {
        int result = 0;
        for (Object entry : set) {
            if (entry.equals(value)) {
                return result;
            }
            result++;
        }
        return set.size()+1;
    }

    public static void main(String[] args) {
        Set<Pair> container = new HashSet<>();
        //For random values every time 
        Random r = new Random();

        int VERTICES; // Number of Vertices 
        int NUMEDGE; // Number of Edges 

        for (int i = 1; i <= RUN; i++) {
            VERTICES = 1 + r.nextInt(MAX_VERTICES);
            // Define the maximum number of edges of the graph 
            // Since the most dense graph can have N*(N-1)/2 edges 
            // where N = nnumber of vertices in the graph 
            NUMEDGE = 1 + r.nextInt(MAX_EDGES);
            while (NUMEDGE > VERTICES * (VERTICES - 1) / 2) {
                NUMEDGE = 1 + r.nextInt(MAX_EDGES);
            }
            // First print the number of vertices and edges 
            System.out.printf("%d %d\n", VERTICES, NUMEDGE);
            // Then print the edges of the form (a b) 
            // where 'a' is connected to 'b' 
            for (int j = 1; j <= NUMEDGE; j++) {
                int a = 1 + r.nextInt(VERTICES);
                int b = 1 + r.nextInt(VERTICES);
                Pair p = new Pair(a, b);
                // Search for a random "new" edge everytime 
                // Note - In a tree the edge (a, b) is same 
                // as the edge (b, a) 
                while (getIndex(container, p) != container.size()+1) {
                    a = 1 + r.nextInt(VERTICES);
                    b = 1 + r.nextInt(VERTICES);
                    p = new Pair(a, b);
                }
                container.add(p);
            }
            for (Pair p : container) {
                int wt = 1 + r.nextInt(MAXWEIGHT);
                System.out.printf("%d %d %d\n", p.first - 1, p.second - 1, wt);
            }
            container.clear();
            System.out.printf("\n");
        }

    }
}
