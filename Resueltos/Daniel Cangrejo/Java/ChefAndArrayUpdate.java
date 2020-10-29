import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt(); int k = sc.nextInt();
		
		int n[] = new int[t];
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();    
		}
		
		int menor;
		menor = n[0];
		
		for (int i = 0; i < n.length; i++) {
			if(n[i]<menor) {
				menor = n[i];
			}
		}
		System.out.println(k - menor);
		
	}

}
