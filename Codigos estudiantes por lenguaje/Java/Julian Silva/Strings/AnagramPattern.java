public class ejercicios {
	static final int MAX = 256;
// Esta función retorna true si los contenidos
// de arr1[] y arr2[] son iguales, de otra forma es falso

	static boolean compare(char vec1[], char vec2[]) {
		for (int i = 0; i < MAX; i++) {
			if (vec1[i] != vec2[i]) {
				return false;
			}
		}
		return true;
	}
// Esta función busca todas las permutaciones de
// pat[] en txt[]

	static void search(String busqueda, String str) {
		int x = busqueda.length();
		int y = str.length();
// countP[]:	Almacena el conteo de todos
// los caracteres del patrón
// countTW[]: Almacena el conteo de los caracteres
// la ventana de texto
		char[] conteopalabras = new char[MAX];
		char[] countTW = new char[MAX];
		for (int i = 0; i < x; i++) {
			(conteopalabras[busqueda.charAt(i)])++;
			(countTW[str.charAt(i)])++;
		}
//Atravesar atravez de los caracteres restantes de patrón
		for (int i = x; i < y; i++) { // Compara conteos de la ventana actual
// de texto con los conteos de pattern[]

			if (compare(conteopalabras, countTW)) {
				System.out.println("Encontrado en indice " + (i - x));
			}
// Agreca el actual caracter a la ventana actual 
			(countTW[str.charAt(i)])++;
// Remueve el primer caracter de la anterior ventana 
			countTW[str.charAt(i - x)]--;
		}
// Revisa por la ultima ventana en el texto 
		if (compare(conteopalabras, countTW)) {
		System.out.println("Encontrado en indice " + (y - x));
	}

}

	public static void main(String args[]) {
		String str = "BACDGABCDA";
		String busqueda = "ABCD";
		search(busqueda, str);
	}
}
