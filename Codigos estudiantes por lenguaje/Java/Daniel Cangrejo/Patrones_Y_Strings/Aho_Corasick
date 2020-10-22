import java.io.PrintWriter;
import java.util.*;

//Programa JAVA implementando Aho Corasick
//para matching de strings 
public class Main {
	static PrintWriter pw = new PrintWriter(System.out);
//Maximo numero de estados en la maquina de cotejamiento
//debe ser igual a la suma del tamaño de todas las palablas clave 
	static final int MAXS = 500;
//numero maximo de caracteres en el alfabeto de entrada 
	static final int MAXC = 500;
//La funcion Output esta implementada usando out[]
// bit i de esta mascara es uno si la palabra en el
// indice i aparece cuando la maquina entra en este estado 
	static int salida[] = new int[MAXS];
//función de fallo
	static int f[] = new int[MAXS];
//implementación de las tries
	static int s[][] = new int[MAXS][MAXC];

// Construye la maquina de cotejado
	/*
	 * "out[state] & (1 << i)" es > 0 si encontramos la palabra de word[i] en el
	 * texto arr-> vector de palabras, el incide de cada palabla clave es importante
	 */
// retorna el numero de estados que la maquina tiene construidos
// los estados estan numerados desde 0 hasta el valor de retorno - 1 
	static int construirlamaquinadelMatch(String vec[], int k) {
//Inicializar todos los valores de out en 0. 
		Arrays.fill(salida, 0);
// Inicializar todos los valores de g en -1. 
		for (int i = 0; i < MAXS; i++) {
			Arrays.fill(s[i], -1);

		}
// Inicialmente tenemos 0 estados 
		int estado = 1;
//Esto es lo mismo que construir un Trie para arr[] 
		for (int i = 0; i < k; ++i) {
			String palabra = vec[i];
			int estadoActual = 0;
// Insertar todos los caracteres de la palabra actual
// en arr[]
			for (int j = 0; j < palabra.length(); ++j) {
				int cont = palabra.charAt(j) - 'a';
// crea un nuevo nodo (estado) si un nodo
// para ch no existe
				if (s[estadoActual][cont] == -1) {
					s[estadoActual][cont] = estado++;
				}
				estadoActual = s[estadoActual][cont];
			}
// agrega la palabra actual a la función de salida
			salida[estadoActual] |= (1 << i);
		}
// para todos los caracteres que no tengan un camino desde
// la raiz (El estado 0) en el trie, agregar un camino
// hacia el estado 0 mismo
		for (int cont = 0; cont < MAXC; ++cont) {
			if (s[0][cont] == -1) {
				s[0][cont] = 0;
			}
		}
//Inicializamos los valores en la funcion de fallo 
		Arrays.fill(f, -1);
// Se usa BFS y una cola para calcular los fallos 
		Queue<Integer> queue = new LinkedList<>();
// Se itera por lo que se encuentre 
		for (int cont = 0; cont < MAXC; ++cont) {
// Todos los nodos de profundidad 1 tienen una funcion de fallo
// como 0.
			if (s[0][cont] != 0) {
				f[s[0][cont]] = 0;
				queue.offer((s[0][cont]));
			}
		}
		while (!queue.isEmpty()) {
// Tomamos el nodo o estado del frente de la cola 
			int est = queue.poll();
// Se busca la funcion de fallo de todos los caracteres del estado
// removido para cuales funcion g no esta definido 
			for (int cont = 0; cont < MAXC; ++cont) {
				if (s[est][cont] != -1) {
//Encontrar el valor de la funcion de fallo 
					int perdido = f[est];
// encuentra el nodo mas profundo con el sufijo
// apropiado del string desde el nodo raiz al estado actual 
					while (s[perdido][cont] == -1) {

						perdido = f[perdido];
					}
					perdido = s[perdido][cont];
					f[s[est][cont]] = perdido;
//Junta los valores de salida
					salida[s[est][cont]] |= salida[perdido];
//Inserta el nodo del siguiente nivel del trie 
					queue.offer(s[est][cont]);
				}
			}
		}

		return estado;
	}
// currentState - El estado actual de la maquina
//	entre 0 y el total de estados -1
// nextInput - El siguiente caracter que entra en la maquina.

	static int encontrarElsiguiente(int estadoConcurrencia, char siguienteEntrada) {
		int respuesta = estadoConcurrencia;
		int cont = siguienteEntrada - 'a';
// Si g no esta definido, use la funcion de fallo 
		while (s[respuesta][cont] == -1) {
			respuesta = f[respuesta];
		}
		return s[respuesta][cont];
	}

//Función que busca las ocurrencias en el texto
	static void busquedadePalabras(String vec[], int x, String text) {
// Preprocesar patrones
// Construir los tries como una maquina de estado finito
		construirlamaquinadelMatch(vec, x);
// Inicializar los estados 
		int estadoOcurrencia = 0;
//Atravesamos el texto buscando las ocurrencias 
		for (int i = 0; i < text.length(); ++i) {
			estadoOcurrencia = encontrarElsiguiente(estadoOcurrencia, text.charAt(i));
// Si no se encuentra cotejado, pasa al siguiente estado 
			if (salida[estadoOcurrencia] == 0) {
				continue;
			}
// cotejado encontrado, imprimir todas las palabras de
// arr[] que se encontraron 
			for (int j = 0; j < x; ++j) {
				int aux = (salida[estadoOcurrencia] & (1 << j));
				if (aux > 0) {
					pw.println("La palabra " + vec[j] + " aparece de " + (i - vec[j].length() + 1) + " a " + i);
				}
			}
		}
		pw.close();
	}

	public static void main(String[] args) {
		String vec[] = { "juega", "futbol", "amigos", "parque" };
		String srt = "danieljuegafutbolenelparqueconsusamigos";
		int x = vec.length;
		busquedadePalabras(vec, x, srt);
	}
}
