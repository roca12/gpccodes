public class ejercicios {

	static int no_caracteres = 256;

//Una función de utilidad para obtener el maximo de
//dos enteros
	static int maximo(int a, int b) {
		return (a > b) ? a : b;
	}

//El preprocesado del algoritmo
	static void peorCaso(char[] str, int size, int badchar[]) {
		int i;

// Inicializa todas las ocurrencias en	-1 
		for (i = 0; i < no_caracteres; i++) {
			badchar[i] = -1;
		}
		/* Llena el actual valor de la ultima ocurrencia de un caracter */
		for (i = 0; i < size; i++) {
			badchar[(int) str[i]] = i;
		}
	}

	/* Una función de busqueda de patrón que usa la heuristica de mal caracter */
	static void busquedas(char a[], char busqueda[]) {
		int m = busqueda.length;
		int n = a.length;
		int badchar[] = new int[no_caracteres];
		/*
		 * Llena el arreglo de malos caracteres llamando la función de preprocesado para
		 * el patrón dado
		 */ 
		peorCaso(busqueda, m, badchar);
		int str1 = 0; // s es cambiado del patron con respecto al texto
		while (str1 <= (n - m)) {
			int j = m - 1;
			/*
			 * Mantiene reduciento el indice j para el patrón mientras los caracteres del
			 * patrón y el texto estan coincidiendo en s
			 */
			while (j >= 0 && busqueda[j] == a[str1 + j]) {
				j--;
			}
			/*
			 * Si el patrón esta presente en el actual cambio, entonces el indice j se
			 * convertira en -1 luego del ciclo de arriba
			 */
			if (j < 0) {
				System.out.println("Patrón encontrado en cambio = " + str1);
				str1 += (str1 + m < n) ? m - badchar[a[str1 + m]] : 1;
			} else {
				str1 += maximo(1, j - badchar[a[str1 + j]]);
			}
		}
	}

	public static void main(String[] args) {
		char a[] = "ABAAABCDABCABC".toCharArray();
		char busqueda[] = "ABC".toCharArray();
		busquedas(a, busqueda);
	}
}
