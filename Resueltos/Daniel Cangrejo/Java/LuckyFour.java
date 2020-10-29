import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        int num = 0;
        for(int i = 0; i < casos; i++) {
            int x = sc.nextInt();
            num = numeros4(x);
            System.out.println(num);
        }
    }

    static int numeros4(int x) {
        int aux = 0;
        int cont=0;
        while (x > 0) {
            aux =  x % 10;
            if(aux==4)cont++;
            x /= 10;
        }
        return cont;
    }
}
