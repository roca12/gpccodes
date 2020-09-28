import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r =sc.nextInt();
		int numero, remplazo;
		for(int i=0; i<r; i++) {
			int rr = sc.nextInt();
			int resultado[]=new int [rr];
			int S=0, otra=0,vez=0, xd=0;
			for(int j=0; j<rr;j++) {
				numero = sc.nextInt();
				resultado[j]=numero;
			}
			while(otra==vez) {
				xd=0;
			for(int j=0; j<rr-1;j++) {
				if(resultado[j] > resultado[j+1]) {
					remplazo=resultado[j];
					resultado[j]=resultado[j+1];
					resultado[j+1]=remplazo;
					S++; vez=0; xd=1;
				}
			}
			if(xd==0)vez++;
			}
			System.out.println("Optimal train swapping takes "+ S+ " swaps.");
		}
	}
}
