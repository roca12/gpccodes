import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    static Set<String> permutaciones;
    static Set<String> result = new HashSet<>();

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
        return permutaciones;

    }

    public static void main(String[] args) {
        Set<String> res = permutation("1234");
        System.out.println("Hay en total " + res.size() + " permutaciones");
        Iterator<String> it = res.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
