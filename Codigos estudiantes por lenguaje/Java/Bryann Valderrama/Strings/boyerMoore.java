import java.util.Arrays;

public class Main {

    static int NO_OF_CHARS = 256;

    static int max(int a, int b) {
        return a > b ? a : b;
    }

    static void badCharHeuristic(char[] str, int size, int badChar[]) {
        int i;
        Arrays.fill(badChar, -1);
        for (i = 0; i < size; i++) {
            badChar[(int) str[i]] = i;
        }
    }

    static void boyerMoore(char txt[], char[] pat) {
        int m = pat.length;
        int n = txt.length;
        int badchar[] = new int[NO_OF_CHARS];
        badCharHeuristic(pat, m, badchar);
        int s = 0;
        while (s <= (n - m)) {
            int j = m - 1;
            while (j >= 0 && pat[j] == txt[s + j]) {
                j--;
            }
            if (j < 0) {
                System.out.println("Patron encontrado en el indice: " + s + " - " + (s + m - 1));
                s += (s + m < n) ? m - badchar[txt[s + m]] : 1;
            } else {
                s += max(1, j - badchar[txt[s + j]]);
            }
        }
    }

    public static void main(String[] args) {
        char txt[] = "holacomoestasholahola".toCharArray();
        char pat[] = "hola".toCharArray();
        boyerMoore(txt, pat);
    }
}