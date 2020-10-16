import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for (int i = 0; i < c; i++) {
            int aux = 0;
            int x = sc.nextInt();
            System.out.println(reverse(x));
        }
    }

    static int reverse(int x) {
        int aux = 0;
        while (x > 0) {
            aux = aux * 10 + x % 10;
            x /= 10;
        }
        return aux;
    }
}
