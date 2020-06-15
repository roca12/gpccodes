import java.util.Scanner;

public class Text_Quotes {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String entrada;
        boolean inicio = true;
        while (sc.hasNextLine()) {
            entrada = sc.nextLine();
            for (int i = 0; i < entrada.length(); i++) {
                if (entrada.charAt(i) == '\"') {
                    if (inicio == true) {
                        System.out.print("``");
                        inicio = false;
                        continue;
                    } else {
                        System.out.print("''");
                        inicio = true;
                        continue;
                    }
                }
                System.out.print(entrada.charAt(i));
            }
            System.out.print("\n");
        }
    }
}
