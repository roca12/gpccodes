import java.util.*;

public class ejercicios {

	static void KMPSearch(String pat, String txt) {
		int M = pat.length();
		int N = txt.length();
// Crea lps[] el cual podra mantener el
// más largo prefijo sufijo para patrón 
		int lps[] = new int[M];
		int j = 0; // indice de pat[]
// Preprocesa el patrón (Calcula lps[])
		computeLPSArray(pat, M, lps);
		int i = 0; // indice para txt[]
		while (i < N) {
			if (pat.charAt(j) == txt.charAt(i)) {
				j++;
				i++;
			}
			if (j == M) {
				System.out.println("Encontrado patrón " + "en el indice " + (i - j)+"-"+(i-1));
				System.out.println(txt.substring(i-j, i));
				j = lps[j - 1];
			} // no coincide luego de j veces
			else if (i < N && pat.charAt(j) != txt.charAt(i)) {
				/* No coincide lps[0..lps[j-1]] caracteres ellos coincidiran de todos modos */
				if (j != 0) {
					j = lps[j - 1];
				} else {
					i = i + 1;
				}
			}
		}

	}

	static void computeLPSArray(String pat, int M, int lps[]) {
// Longitus del anterior prefijo sufijo más largo 
		int len = 0;
		int i = 1;
		lps[0] = 0; // lps[0] es siempre 0
// el ciclo calcula lps[i] para i = 1 hasta M-1 
		while (i < M) {
			if (pat.charAt(i) == pat.charAt(len)) {

				len++;
				lps[i] = len;
				i++;
			} else // (pat[i] != pat[len])
			{
// Esto es dificl, considere el ejemplo
// AAACAAAA y i = 7. la idea es similar
// el paso de busqueda 
				if (len != 0) {
					len = lps[len - 1];
// Tambien, note que no incrementamos
//i aqui
				} else {
					if (len == 0)
						lps[i] = len;
					i++;
				}
			}

		}
	}

	public static void main(String args[]) {
		String txt = "ABABDABACDABABCABAB";
		String pat = "ABABCABAB";
		KMPSearch(pat, txt);
	}
}
