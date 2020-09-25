import java.util.*;
import java.util.HashSet;

public class Main {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String linea, palabra, juez;
        int n, i, errores;
        HashSet<Character> pal;
        char c;
        boolean juez2, chick;
        while ((linea = sc.nextLine()) != null) {
            n = Integer.parseInt(linea);
            if (n == -1) {
                break;
            }

            System.out.println("Round " + n);

            palabra = sc.nextLine();
            juez = sc.nextLine();
            chick = true;
            pal = new HashSet<Character>();
            errores = 0;
            for (i = 0; i < juez.length(); i++) {
                c = juez.charAt(i);
                juez2 = pal.add(c);
                if (!juez2) {
                    continue;
                }
                if (palabra.indexOf(c) > -1) {
                    palabra = palabra.replace("" + c, "");
                    if (palabra.length() == 0) {
                        System.out.println("You win.");
                        chick = false;
                        break;
                    }
                } else {
                    errores++;
                    if (errores == 7) {
                        System.out.println("You lose.");
                        chick = false;
                        break;
                    }
                }
            }
            if (chick) {
                System.out.println("You chickened out.");
            }
        }
    }
}
