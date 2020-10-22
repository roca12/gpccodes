public class ejercicios {
// d es elnúmero de caracteres en el alfabeto de entrada public final static 
	static int d = 256;

	/*
	 * pat -> patrón txt -> texto q -> Un número primo
	 */
	static void search(String pat, String txt, int q) {
		int M = pat.length();
		int N = txt.length();
		int i, j;
		int p = 0; // valor hash del patrón
		int t = 0; // valor hash del txt
		int h = 1;
// el valor de h debe ser "pow(d, M-1)%q" 
		for (i = 0; i < M - 1; i++) {
			h = (h * d) % q;
		}
		/* Calcula el valor hash del patron y primera ventana de texto */
		for (i = 0; i < M; i++)

		{
			p = (d * p + pat.charAt(i)) % q;
			t = (d * t + txt.charAt(i)) % q;
		}
//Desliza el patrón por encima del texto uno por uno 
		for (i = 0; i <= N - M; i++) {

			/*
			 * Verifica los valores hash de la actual ventana de text y patrón. Si el valor
			 * hash coincide entonces solo revisa los caratceres uno por uno
			 */
			if (p == t) {
				/* Revisa por caracteres uno por uno */ for (j = 0; j < M; j++) {
					if (txt.charAt(i + j) != pat.charAt(j)) {
						break;
					}
				}
// Si p==t y pat[0...M-1] = txt[i, i+1, ...i+M-1] 
				if (j == M) {
					System.out.println("Patron encontrado en el indice " + i);
				}
			}
// Calcula el valor hash de la siguiente ventana de texto
// Remueve el digito lider, y final 
			if (i < N - M) {
				t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + M)) % q;
				/* Nosotros obtendremos un valor negativo de t convirtiendolo a positivo */
				if (t < 0) {
					t = (t + q);
				}
			}
		}
	}

	public static void main(String[] args) {
		String txt = "EQUIPO ARTEMIS";
		String pat = "ARTE";
		int q = 101;
		search(pat, txt, q);
	}
}
