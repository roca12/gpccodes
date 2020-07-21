public class Main {

    static char text[];

    static int min(int a, int b) {
        int res = a;
        if (b < a) {
            res = b;
        }
        return res;
    }

    static void findLPS() {
        int N = text.length;
        if (N == 0) {
            return;
        }
        N = 2 * N + 1; //Conteo de posición
        int L[] = new int[N]; //LPS tamaño de array
        L[0] = 0;
        L[1] = 1;
        int C = 1; //Posición central
        int R = 2; //posición Centro derecho
        int i = 0; //Posición actual derecho
        int iMirror; //Posición actual izquierda
        int maxLPSLength = 0;
        int maxLPSCenterPosition = 0;
        int start = -1;
        int end = -1;
        int diff = -1;
        //Descomentar para imprimir tamaño del arreglo LPS
        //printf("%d %d ", L[0], L[1]); 
        for (i = 2; i < N; i++) {
            iMirror = 2 * C - i;
            L[i] = 0;
            diff = R - i;
            if (diff > 0) {
                L[i] = min(L[iMirror], diff);
            }
            /*Intente expandir palíndromo centrado en currentRightPosition i
            Aquí para posiciones impares, comparamos caracteres y
            si coinciden, aumente la longitud de LPS en UNO
            Si la posición es igual, solo incrementamos LPS en UNO sin*/
            try {
                while (((i + L[i]) < N && (i - L[i]) > 0)
                        && (((i + L[i] + 1) % 2 == 0)
                        || (text[(i + L[i] + 1) / 2] == text[(i - L[i] - 1) / 2]))) {
                    L[i]++;
                }
            } catch (Exception e) {
            }
            //Comparación de cualquier caracter
            if (L[i] > maxLPSLength) {
                maxLPSLength = L[i];
                maxLPSCenterPosition = i;
            }
            if (i + L[i] > R) {
                C = i;
                R = i + L[i];
            }
            //Descomentar para imprimir tamaño del arreglo LPS
            //printf("%d ", L[i]); 
        }
        start = (maxLPSCenterPosition - maxLPSLength) / 2;
        end = start + maxLPSLength - 1;
        System.out.println("LPS del string es " + String.copyValueOf(text) + ": ");
        for (i = start; i <= end; i++) {
            System.out.printf("%c", text[i]);
        }
        System.out.println("");
        for (int j = 0; j < L.length; j++) {
            System.out.print(L[j] + " ");
        }
    }

    public static void main(String[] args) {
        text = "anitalavatina".toCharArray();
        findLPS();
    }
}
