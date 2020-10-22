import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    static final int MAX = 30005;
    static final int INF = 1 << 30;


    static class Node implements Comparable<Node> {

        int first, second;

        Node(int d, int p) {
            this.first = d;
            this.second = p;
        }

        @Override
        public int compareTo(Node other) {
 
            if (second > other.second) {
                return 1;
            }
            if (second == other.second) {
                return 0;
            }
            return -1;
        }
    };

    static Scanner sc = new Scanner(System.in);
    static List< List< Node>> ady = new ArrayList< List< Node>>();
    static int distancia[] = new int[MAX];
    static boolean visitado[] = new boolean[MAX];
    static PriorityQueue< Node> Q = new PriorityQueue<Node>();
    static int V; 
    static int previo[] = new int[MAX];

    static void init() {
        for (int i = 0; i <= V; ++i) {
            distancia[i] = INF; 
            visitado[i] = false;
            previo[i] = -1; 
        }
    }
    static void relajacion(int actual, int adyacente, int peso) {
        if (distancia[actual] + peso < distancia[adyacente]) {
            distancia[adyacente] = distancia[actual] + peso;
            previo[adyacente] = actual;
            Q.add(new Node(adyacente, distancia[adyacente]));
        }
    }
    static void print(int destino) {
        if (previo[destino] != -1)
        {
            print(previo[destino]);
        }

        System.out.printf("%d ", destino);
    }

    static void dijkstra(int inicial) {
        init();
        Q.add(new Node(inicial, 0));
        distancia[inicial] = 0;
        int actual, adyacente, peso;
        while (!Q.isEmpty()) {
            actual = Q.element().first;
            Q.remove(); 
            if (visitado[actual]) {
                continue;
            }
            visitado[actual] = true;
  
            for (int i = 0; i < ady.get(actual).size(); ++i) {
                adyacente = ady.get(actual).get(i).first;

                peso = ady.get(actual).get(i).second;

                if (!visitado[adyacente]) {
     
                    relajacion(actual, adyacente, peso);
                }
            }
        }
    }

    public static void main(String[] args) {
        int E, origen, destino, peso, inicial,N,PER;
        while(true) {
        V = sc.nextInt();
        E = sc.nextInt();
        N=sc.nextInt();
        PER=sc.nextInt();
        if(V==E && N==PER && N==0)break;
        for (int i = 0; i <= V; ++i) {
            ady.add(new ArrayList<>());
        }
        Arrays.fill(distancia, INF);
        Arrays.fill(previo, -1);
        for (int i = 0; i < E; ++i) {
            origen = sc.nextInt();
            destino = sc.nextInt();
            peso = sc.nextInt();
            ady.get(origen).add(new Node(destino, peso)); 
        }
        dijkstra(PER);
        for (int i = 0; i < N; i++) {
			int x=sc.nextInt();
			if(distancia[x]==INF) {
				System.out.println("Impossible");
				continue;
			}
			System.out.println(distancia[x]);
		}
        System.out.println();
        Arrays.fill(distancia, INF);
        Arrays.fill(previo, -1);
        ady.clear();
        }
    }
}
