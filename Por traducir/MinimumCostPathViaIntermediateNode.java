

// CPP program to find minimum distance between 
// source and destination node and visiting 
// of intermediate node is compulsory 
import java.util.ArrayList;
import java.util.PriorityQueue;

public class MinimumCostPathViaIntermediateNode {

    static int MAXN = 100005;
    // to strore maped values of graph 
    static ArrayList<Pair> v[] = new ArrayList[MAXN];

    // to store distance of 
    // all nodes from the source node 
    static int dist[] = new int[MAXN];

    // Dijkstra's algorithm to find 
    // shortest path from source to node 
    static class Pair implements Comparable<Pair> {
        int first, second;
        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public int compareTo(Pair o) {
            if (this.first < o.first) {
                return 1;
            } else if (this.first > o.first) {
                return -1;
            }
            return 0;
        }
    }

    static void dijkstra(int source, int n) {
        // set all the vertices 
        // distances as infinity 
        for (int i = 0; i < n; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        // set all vertex as unvisited 
        boolean vis[] = new boolean[n];
        // make distance from source 
        // vertex to source vertex is zero 
        dist[source] = 0;
        // // multiset do the job 
        // as a min-priority queue 
        PriorityQueue<Pair> s = new PriorityQueue<>();
        // insert the source node with distance = 0 
        s.add(new Pair(0, source));

        while (!s.isEmpty()) {
            Pair p = s.peek();
            // pop the vertex with the minimum distance 
            s.poll();
            int x = p.second;
            int wei = p.first;
            // check if the popped vertex 
            // is visited before 
            if (vis[x]) {
                continue;
            }
            vis[x] = true;
            for (int i = 0; i < v[x].size(); i++) {
                int e = v[x].get(i).first;
                int w = v[x].get(i).second;

                // check if the next vertex 
                // distance could be minimized 
                if (dist[x] + w < dist[e]) {

                    dist[e] = dist[x] + w;

                    // insert the next vertex 
                    // with the updated distance 
                    s.add(new Pair(dist[e], e));
                }
            }
        }
    }

    // function to add edges in graph 
    static void add_edge(int s, int t, int weight) {
        v[s].add(new Pair(t, weight));
        v[t].add(new Pair(s, weight));
    }

    // function to find the minimum shortest path 
    static int solve(int source, int destination,
            int intermediate, int n) {
        int ans = Integer.MAX_VALUE;
        dijkstra(source, n);
        // store distance from source to 
        // all other vertices 
        int dsource[] = new int[n];
        for (int i = 0; i < n; i++) {
            dsource[i] = dist[i];
        }

        dijkstra(destination, n);
        // store distance from destination 
        // to all other vertices 
        int ddestination[] = new int[n];
        for (int i = 0; i < n; i++) {
            ddestination[i] = dist[i];
        }

        dijkstra(intermediate, n);
        // store distance from intermediate 
        // to all other vertices 
        int dintermediate[] = new int[n];
        for (int i = 0; i < n; i++) {
            dintermediate[i] = dist[i];
        }

        // find required answer 
        for (int i = 0; i < n; i++) {
            ans = Math.min(ans, dsource[i] + ddestination[i]
                    + dintermediate[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            v[i] = new ArrayList<>();
        }
        int source = 0, destination = 2, intermediate = 3;
        // add edges in graph 
        add_edge(0, 1, 1);
        add_edge(1, 2, 2);
        add_edge(1, 3, 3);
        // function call for minimum shortest path 
        System.out.println(solve(source, destination, intermediate, n));

    }

}
