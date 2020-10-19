import java.util.*;

public class ejercicios {

    static boolean busquedastring(String str, String pattern, int x, int y) {

        if (y == 0) {
            return (x == 0);
        }

// Tabla de busqueda para almacenar resultados
// de subproblemás
        boolean[][] verificacion = new boolean[x + 1][y + 1];
//Inicializa la tabla en falso 
        for (int i = 0; i < x + 1; i++) {
            Arrays.fill(verificacion[i], false);
        }
        verificacion[0][0] = true;
//Solo '*' puede coincidri con string vacio 
        for (int j = 1; j <= y; j++) {
            if (pattern.charAt(j - 1) == '*') {
                verificacion[0][j] = verificacion[0][j - 1];
            }
        }
// Llena la tabla
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                                if (pattern.charAt(j - 1) == '*') {
                    verificacion[i][j] = verificacion[i][j - 1] || verificacion[i - 1][j];
                }  else if (pattern.charAt(j - 1) == '?' || str.charAt(i - 1) == pattern.charAt(j - 1)) {
                    verificacion[i][j] = verificacion[i - 1][j - 1];
                } // Si el caracter no coincide
                else {
                    verificacion[i][j] = false;
                }
            }
        }
        return verificacion[x][y];
    }

    public static void main(String args[]) {
        String str = "baaabab";
        String pattern = "*****ba*****ab";


        if (busquedastring(str, pattern, str.length(), pattern.length())) {
            System.out.println("Si");
        } else {
            System.out.println("No");
        }
    }
}