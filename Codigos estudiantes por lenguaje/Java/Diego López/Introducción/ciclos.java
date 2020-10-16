package javaapplication1;

import java.util.Random;
import java.util.Scanner;

public class JavaApplication1 {

    public static Random r = new Random();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int accion, n1, n2, f;
        String rep;
        do {
            System.out.println("Selecione la opción");
            System.out.println("Digite 1 para sumar");
            System.out.println("Digite 2 para generar numeros aleatorios");
            System.out.println("Digite 3 para multiplicar");
            System.out.println("Digite 4 para generar contraseña aleatoria");
            System.out.println("Digite 5 para identificar numeros pares");
            accion = sc.nextInt();
            switch (accion) {
                case 1:
                    System.out.println("Digite el valor de los numeros");
                    n1 = sc.nextInt();
                    n2 = sc.nextInt();
                    f = n1 + n2;
                    System.out.println("El valor es: " + f);
                    break;
                case 2:
                    System.out.println("Digite cuantos numeros aleatorios desea generar");
                    n1 = sc.nextInt();
                    int[] vf = new int[n1];
                    for (int i = 0; i < n1; i++) {
                        vf[i] = r.nextInt();
                    }
                    System.out.println("Sus numeros son");
                    for (int i = 0; i < vf.length; i++) {
                        System.out.println(vf[i]);
                    }
                    break;
                case 3:
                    System.out.println("Digite el valor de los numeros");
                    n1 = sc.nextInt();
                    n2 = sc.nextInt();
                    f = n1 * n2;
                    System.out.println("El valor es: " + f);
                    break;
                case 4:
                    int cont = 0;
                    String ar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
                    StringBuilder sb = new StringBuilder();
                    while (sb.length() < 15) {
                        f = (int) (r.nextFloat() * ar.length());
                        sb.append(ar.charAt(f));
                    }
                    rep = sb.toString();
                    System.out.println(rep);
                    break;
                case 5:
                    System.out.println("Digite el valor del numero");
                    n1 = sc.nextInt();
                    f = n1 % 2;
                    if (f == 0) {
                        System.out.println("El numero es par");
                    } else {
                        System.out.println("No es par");
                    }
                    break;
                default:
                    System.out.println("No digito ningún valor correspondiente al menú");
            }
            System.out.print("Desea hacer una nueva operación? \n"
                    + "S/N \n");
            rep = sc.next();
        } while (rep.equals("S"));
    }

}

