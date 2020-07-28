//Permutaciones Con y Sin Repetición
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    static Set<String> permutaciones;
    static Set<String> result = new HashSet<>();
    static int cont = 0;

    static void permWithRepUtil(String str, char[] data,
            int last, int index) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            data[index] = str.charAt(i);
            if (index == last) {
                System.out.println(new String(data));
                cont++;
            } else {
                permWithRepUtil(str, data, last,
                        index + 1);
            }
        }
    }

    static void permWithRep(String str) {
        int length = str.length();
        char[] data = new char[length + 1];
        char[] temp = str.toCharArray();
        Arrays.sort(temp);
        str = new String(temp);
        permWithRepUtil(str, data, length - 1, 0);
    }

    static void shuffle(char c) {
        if (permutaciones.isEmpty()) {
            permutaciones.add(String.valueOf(c));
        } else {
            Iterator<String> it = permutaciones.iterator();
            for (int i = 0; i < permutaciones.size(); i++) {
                String temp1;
                while (it.hasNext()) {
                    temp1 = it.next();
                    for (int k = 0; k < temp1.length() + 1; k++) {
                        StringBuilder sb = new StringBuilder(temp1);
                        sb.insert(k, c);
                        result.add(sb.toString());
                    }
                }
            }
            permutaciones = result;
            result = new HashSet<>();
        }
    }

    static Set<String> permutation(String string) {
        permutaciones = new HashSet<>();
        int n = string.length();
        for (int i = n - 1; i >= 0; i--) {
            shuffle(string.charAt(i));
        }
        Set<String> aux = new HashSet<>();
        Iterator<String> it = permutaciones.iterator();
        while (it.hasNext()) {
            String aux2 = it.next();
            //Entre mas aumente r, mas pequeñas seran las permutaciones
            int r = 0;
            aux.add(aux2.substring(0, aux2.length() - 0));
        }
        return aux;
    }

    public static void main(String[] args) {
        String entrada = "1234";
        Set<String> res = permutation(entrada);
        System.out.println("Hay en total " + res.size() + " permutaciones sin repetición de " + entrada);
        Iterator<String> it = res.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("");
        String entrada2 = "1234";
        permWithRep(entrada2);
        System.out.println("Hay en total " + cont + " permutaciones con repetición de " + entrada2);
    }
}
