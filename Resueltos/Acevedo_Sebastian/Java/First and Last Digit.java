import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r =sc.nextInt();
		int residuo;
		int suma[]=new int [r];
		for(int i=0; i<r; i++) {
			int numeros = sc.nextInt();
			residuo=numeros%10;
			suma[i]=residuo+firstD(numeros);
		}
		for(int i=0; i<r; i++) {
			System.out.println(suma[i]);
		}
	}
	static int firstD(int x) {
		while (x > 9) {
            x /= 10;
        }		
        return x;
	}
}
