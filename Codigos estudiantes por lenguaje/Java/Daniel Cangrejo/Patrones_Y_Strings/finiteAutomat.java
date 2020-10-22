public class Main {
    static int Num_chars = 256;

    static int getNextState(char[] patron, int M, int estado, int x) {
        if (estado < M && x == patron[estado]) {
            return estado + 1;
        }
        int aux, i;
        for (aux = estado; aux > 0; aux--) {
            if (patron[aux - 1] == x) {
                for (i = 0; i < aux - 1; i++) {
                    if (patron[i] != patron[estado - aux + 1 + i]) {
                        break;
                    }
                }

                if (i == aux - 1) {
                    return aux;
                }
            }
        }
        return 0;
    }
    static void computeTF(char[] patron, int M, int matxTF[][]) {
        int estado, x;
        for (estado = 0; estado <= M; ++estado) {
            for (x = 0; x < Num_chars; ++x) {
                matxTF[estado][x] = getNextState(patron, M, estado, x);
            }
        }
    }

    static void search(char[] patron, char[] texto) {
        int M = patron.length;
        int N = texto.length;
        int[][] matxTF = new int[M + 1][Num_chars];
        computeTF(patron, M, matxTF);
// Procesa txt sobre FA.
        int i, chars = 0;
        for (i = 0; i < N; i++) {
            chars = matxTF[chars][texto[i]];
            if (chars == M) {
                System.out.println("Patrón encontrado " + "en indice " + (i - M + 1));
            }
        }
    }

    public static void main(String[] args) {
        char[] txt = "AABAACAADAABAAABAA".toCharArray();
        char[] pat = "AABA".toCharArray();
        search(pat, txt);
    }   
}
