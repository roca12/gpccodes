import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.ArrayList;

public class DijkstraSP {

    //similar a los defines de C++
    static final int MAX = 10005; //maximo número de vértices
    static final int INF = 1 << 30; //definimos un valor 
    //grande que represente la distancia infinita
    //inicial, basta conque sea superior al maximo 
    //valor del peso en alguna de las aristas
    //En el caso de java usamos una clase que 
    //representara el pair de C++

    static class Node implements Comparable<Node> {

        int first, second;

        Node(int d, int p) { //constructor
            this.first = d;
            this.second = p;
        }

        @Override
        public int compareTo(Node other) { //es necesario 
            //definir un comparador para el
            //correcto funcionamiento del PriorityQueue
            if (second > other.second) {
                return 1;
            }
            if (second == other.second) {
                return 0;
            }
            return -1;
        }
    };

    static Scanner sc = new Scanner(System.in); //para lectura de datos
    static List< List< Node>> ady = new ArrayList< List< Node>>(); //lista de adyacencia
    static int distancia[] = new int[MAX]; // distancia de vértice inicial
    //vértice con ID = u
    static boolean visitado[] = new boolean[MAX]; //para vértices visitados
    static PriorityQueue< Node> Q = new PriorityQueue<Node>();
    //usamos el comparador definido para 
    //que el de menor valor este en el tope
    static int V; //número de vertices
    static int previo[] = new int[MAX]; //para la impresion de caminos

    //función de inicialización
    static void init() {
        for (int i = 0; i <= V; ++i) {
            distancia[i] = INF; //inicializamos todas 
            //las distancias con valor infinito
            visitado[i] = false; //inicializamos todos 
            //los vértices como no visitados
            previo[i] = -1; //inicializamos el previo 
            //del vertice i con -1
        }
    }

    //Paso de relajacion
    static void relajacion(int actual, int adyacente, int peso) {
        //Si la distancia del origen al vertice actual + 
        //peso de su arista es menor a la distancia del
        //origen al vertice adyacente
        if (distancia[actual] + peso < distancia[adyacente]) {
            //relajamos el vertice actualizando la distancia
            distancia[adyacente] = distancia[actual] + peso;
            //a su vez actualizamos el vértice previo
            previo[adyacente] = actual;
            //agregamos adyacente a la cola de prioridad
            Q.add(new Node(adyacente, distancia[adyacente]));
        }
    }

    //Impresion del camino más corto desde el vertice inicial y final ingresados
    static void print(int destino) {
        if (previo[destino] != -1) //si aun poseo un vertice previo
        {
            print(previo[destino]); //recursivamente sigo explorando
        }
        //terminada la recursion imprimo los vertices
        //recorridos
        System.out.printf("%d ", destino);
    }

    static void dijkstra(int inicial) {
        init(); //inicializamos nuestros arreglos
        //Insertamos el vértice inicial en la Cola de Prioridad
        Q.add(new Node(inicial, 0));
        //Este paso es importante, inicializamos la distancia del
        //inicial como 0
        distancia[inicial] = 0;
        int actual, adyacente, peso;
        while (!Q.isEmpty()) { //Mientras cola no este vacia
            //Obtengo de la cola el nodo con menor peso, en un
            //comienzo será el inicial
            actual = Q.element().first;
            Q.remove(); //Sacamos el elemento de la cola
            if (visitado[actual]) {
                continue; //Si el vértice actual ya fue visitado entonces sigo
            }//sacando elementos de la cola
            visitado[actual] = true; //Marco como visitado el vértice actual
            //reviso sus adyacentes del
            //vertice actual
            for (int i = 0; i < ady.get(actual).size(); ++i) {
                adyacente = ady.get(actual).get(i).first; //id del vertice adyacente
                //peso de la arista que une actual
                //con adyacente ( actual , adyacente )
                peso = ady.get(actual).get(i).second;
                //si el vertice adyacente no fue visitado
                if (!visitado[adyacente]) {
                    //realizamos el paso de relajacion
                    relajacion(actual, adyacente, peso);
                }
            }
        }

        System.out.printf("Distancias más cortas iniciando en vertice %d\n", inicial);
        for (int i = 0; i <= V; ++i) {
            System.out.printf("Vertice %d , distancia más corta = %d\n", i, distancia[i]);
        }

        System.out.println("\n**************Impresion de camino más corto**************");
        System.out.printf("Ingrese vertice destino: ");
        int destino;
        destino = sc.nextInt();
        print(destino);
        System.out.printf("\n");
    }

    public static void main(String[] args) {
        int E, origen, destino, peso, inicial;

        V = sc.nextInt();
        E = sc.nextInt();
        for (int i = 0; i <= V; ++i) {
            ady.add(new ArrayList<>()); //inicializamos lista de
        }//adyacencia
        for (int i = 0; i < E; ++i) {
            origen = sc.nextInt();
            destino = sc.nextInt();
            peso = sc.nextInt();
            ady.get(origen).add(new Node(destino, peso)); //grafo dirigido
            ady.get( destino ).add( new Node( origen , peso ) ); //no dirigido
        }
        System.out.print("Ingrese el vertice inicial: ");
        inicial = sc.nextInt();
        dijkstra(inicial);
    }
}
