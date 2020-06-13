import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alturas, casos;
        casos = sc.nextInt();
        for (int i = 1; i <=casos; i++) {
        ArrayList<Integer> muros = new ArrayList<Integer>();
        int sube = 0;
        int baja = 0;
            alturas = sc.nextInt();
            for (int j = 0; j < alturas; j++) {
                muros.add(sc.nextInt());
                if (j > 0) {
                    if (muros.get(j - 1) < muros.get(j)) {
                      //System.out.println(muros.get(j));
                        sube++;
                    } else if (muros.get(j - 1) > muros.get(j)) {
                     // System.out.println(muros.get(j));
                        baja++;
                    }
                }
            }
            System.out.println("Case "+i+": "+sube+" "+baja);
        }

    }

}
