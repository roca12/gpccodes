import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//Programa JAVA implementando Aho Corasick
//para matching de strings
public class Main {

    //Maximo numero de estados en la maquina de cotejamiento
    //debe ser igual a la suma del tamaño de todas las palablas clave
    static final int MAXS = 500;
    //numero maximo de caracteres en el alfabeto de entrada
    static final int MAXC = 26;
    //La funcion Output esta implementada usando out[]
    // bit i de esta mascara es uno si la palabra en el 
    // indice i aparece cuando la maquina entra en este estado
    static int out[] = new int[MAXS];
    //función de fallo 
    static int f[] = new int[MAXS];
    //implementación de las tries
    static int g[][] = new int[MAXS][MAXC];

    // Construye la maquina de cotejado
    /* "out[state] & (1 << i)" es > 0 si encontramos la
    palabra de word[i] en el texto
    arr-> vector de palabras, el incide de cada palabla clave
    es importante */
    // retorna el numero de estados que la maquina tiene construidos
    // los estados estan numerados desde 0 hasta el valor de retorno - 1
    static int buildMatchingMachine(String arr[], int k) {
        //Inicializar todos los valores de out en 0. 
        Arrays.fill(out, 0);
        // Inicializar todos los valores de g en -1.
        for (int i = 0; i < MAXS; i++) {
            Arrays.fill(g[i], -1);
        }
        // Inicialmente tenemos 0 estados 
        int states = 1;
        //Esto es lo mismo que construir un Trie para arr[] 
        for (int i = 0; i < k; ++i) {
            String word = arr[i];
            int currentState = 0;
            // Insertar todos los caracteres de la palabra actual
            // en arr[]
            for (int j = 0; j < word.length(); ++j) {
                int ch = word.charAt(j) - 'a';
                // crea un nuevo nodo (estado) si un nodo
                // para ch no existe
                if (g[currentState][ch] == -1) {
                    g[currentState][ch] = states++;
                }
                currentState = g[currentState][ch];
            }
            // agrega la palabra actual a la función de salida
            out[currentState] |= (1 << i);
        }
        // para todos los caracteres que no tengan un camino desde
        // la raiz (El estado 0) en el trie, agregar un camino
        // hacia el estado 0 mismo
        for (int ch = 0; ch < MAXC; ++ch) {
            if (g[0][ch] == -1) {
                g[0][ch] = 0;
            }
        }
        //Inicializamos los valores en la funcion de fallo
        Arrays.fill(f, -1);
        // Se usa BFS y una cola para calcular los fallos
        Queue<Integer> q = new LinkedList<>();
        // Se itera por lo que se encuentre
        for (int ch = 0; ch < MAXC; ++ch) {
            // Todos los nodos de profundidad 1 tienen una funcion de fallo
            // como 0.
            if (g[0][ch] != 0) {
                f[g[0][ch]] = 0;
                q.offer((g[0][ch]));
            }
        }
        while (!q.isEmpty()) {
            // Tomamos el nodo o estado del frente de la cola
            int state = q.poll();
            // Se busca la funcion de fallo de todos los caracteres del estado
            // removido para cuales funcion g no esta definido
            for (int ch = 0; ch < MAXC; ++ch) {
                if (g[state][ch] != -1) {
                    //Encontrar el valor de la funcion de fallo
                    int failure = f[state];
                    // encuentra el nodo mas profundo con el sufijo
                    // apropiado del string desde el nodo raiz al estado actual
                    while (g[failure][ch] == -1) {
                        failure = f[failure];
                    }
                    failure = g[failure][ch];
                    f[g[state][ch]] = failure;
                    //Junta los valores de salida
                    out[g[state][ch]] |= out[failure];
                    //Inserta el nodo del siguiente nivel del trie
                    q.offer(g[state][ch]);
                }
            }
        }

        return states;
    }
    // currentState - El estado actual de la maquina 
    //                 entre 0 y el total de estados -1  
    // nextInput - El siguiente caracter que entra en la maquina. 

    static int findNextState(int currentState, char nextInput) {
        int answer = currentState;
        int ch = nextInput - 'a';
        // Si g no esta definido, use la funcion de fallo 
        while (g[answer][ch] == -1) {
            answer = f[answer];
        }
        return g[answer][ch];
    }

    //Función que busca las ocurrencias en el texto
    static void searchWords(String arr[], int k, String text) {
        // Preprocesar patrones
        // Construir los tries como una maquina de estado finito
        buildMatchingMachine(arr, k);
        // Inicializar los estados
        int currentState = 0;
        //Atravesamos el texto buscando las ocurrencias
        for (int i = 0; i < text.length(); ++i) {
            currentState = findNextState(currentState, text.charAt(i));
            // Si no se encuentra cotejado, pasa al siguiente estado
            if (out[currentState] == 0) {
                continue;
            }
            // cotejado encontrado, imprimir todas las palabras de 
            // arr[] que se encontraron 
            for (int j = 0; j < k; ++j) {
                int aux = (out[currentState] & (1 << j));
                if (aux > 0) {
                    System.out.println("La palabra " + arr[j] + " aparece de "
                            + (i - arr[j].length() + 1) + " a " + i);
                }
            }
        }
    }

    public static void main(String[] args) {
        String arr[] = {"he", "she", "hers", "his"};
        String text = "ahishersahishersahi";
        int k = arr.length;
        searchWords(arr, k, text);
    }
}
