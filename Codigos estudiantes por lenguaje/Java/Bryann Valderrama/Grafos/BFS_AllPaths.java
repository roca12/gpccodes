import java.util.ArrayList;
import java.util.List;

public class Main {

    static int v;
    static ArrayList<Integer> adjlist[];

    static void initGraph(int vertices) {
        v = vertices;
        initAdjList();
    }

    static void initAdjList() {
        adjlist = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            adjlist[i] = new ArrayList<>();
        }
    }

    static void addEdge(int u, int v) {
        adjlist[u].add(v);
        //adjlist[v].add(u);
    }

    static void printAllPaths(int s, int d) {
        boolean[] isvisited = new boolean[v];
        ArrayList<Integer> pathList = new ArrayList<>();
        pathList.add(s);
        printAllPathsUtil(s, d, isvisited, pathList);
    }

    static void printAllPathsUtil(Integer u, Integer d, boolean[] isvisited, List<Integer> localPathList) {
        isvisited[u] = true;
        if (u.equals(d)) {
            System.out.println(localPathList);
            isvisited[u] = false;
            return;
        }
        for (Integer i : adjlist[u]) {
            if (!isvisited[i]) {
                localPathList.add(i);
                printAllPathsUtil(i, d, isvisited, localPathList);
                localPathList.remove(i);
            }
        }
        isvisited[u] = false;
    }

    public static void main(String[] args) {
        initGraph(4);
        addEdge(0, 1);
        addEdge(0, 2);
        addEdge(0, 3);
        addEdge(2, 0);
        addEdge(2, 1);
        addEdge(1, 3);
        int inicio = 2;
        int destino = 3;
        System.out.println("los siguientes son todos los diferentes caminos desde " + inicio + " a " + destino);
        printAllPaths(inicio, destino);
    }
}
