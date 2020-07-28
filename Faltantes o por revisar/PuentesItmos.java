
import java.util.ArrayList;

//Algoritmo para hallar los puentes e itsmos en un grafo no dirigido. 
//Requiere de la clase Edge.
//SE DEBEN LIMPIAR LAS ESTRUCTURAS DE DATOS ANTES DE UTILIZARSE
public class PuentesItmos {

    static int nodos, caminos; //vertices, arcos
    static int MAX = 1010;
    static ArrayList<Integer> ady[] = new ArrayList[MAX];
    static boolean marked[] = new boolean[MAX];
    static int prev[] = new int[MAX];
    static int dfs_low[] = new int[MAX];
    static int dfs_num[] = new int[MAX];
    static boolean itsmos[] = new boolean[MAX];
    static ArrayList<Edge> bridges= new ArrayList<>();
    static int dfsRoot, rootChildren, cont;

    /* Recibe el nodo inicial */
    static void dfs(int u) {
        dfs_low[u] = dfs_num[u] = cont;
        cont++;
        marked[u] = true;
        int j, v;

        for (j = 0; j < ady[u].size(); j++) {
            v = ady[u].get(j);
            if (!marked[v]) {
                prev[v] = u;
                //Caso especial 
                if (u == dfsRoot) {
                    rootChildren++;
                }
                dfs(v);

                //Itmos
                if (dfs_low[v] >= dfs_num[u]) {
                    itsmos[u] = true;
                }

                //Puentes
                if (dfs_low[v] > dfs_num[u]) {
                    bridges.add(new Edge(Math.min(u, v), Math.max(u, v)));
                }

                dfs_low[u] = Math.min(dfs_low[u], dfs_low[v]);
            } else if (v != prev[u]) {
                dfs_low[u] = Math.min(dfs_low[u], dfs_num[v]);
            }
        }
    }

    static class Edge implements Comparable<Edge> {
        int v;
        long w;
        Edge(int _v, long _w) {
            v = _v;
            w = _w;
        }
        @Override
        public int compareTo(Edge o) {
            if (w > o.w) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    public static void main(String args[]) {
        nodos = 4;
        caminos = 4;
        for (int i = 0; i < nodos; i++) {
            ady[i]= new ArrayList<>();
        }
        ady[0].add(1);
        //ady[1].add(2);
        ady[2].add(3);
        ady[3].add(0);
        dfs(dfsRoot);
        /* Caso especial */
        itsmos[dfsRoot] = (itsmos[dfsRoot] && rootChildren > 1) ? true : false;
        for (int i = 0; i < 10; i++) {
            System.out.println(itsmos[i]);
        }
        for (Edge e : bridges) {
            System.out.println(e.v+" "+e.w);
        }
    }
}
