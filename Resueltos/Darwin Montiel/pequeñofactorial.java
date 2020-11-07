import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner num_de_ciclos = new Scanner(System.in); 
        int n = num_de_ciclos.nextInt(); 

        for (int i = 0; i < n; i++) {
            int n1 = num_de_ciclos.nextInt(); 
            int factorial = 1;                
            for (int j = n1; j > 1; j--) { 

                factorial = factorial * j;

            }

            System.out.println(factorial);
        }
    }

}
