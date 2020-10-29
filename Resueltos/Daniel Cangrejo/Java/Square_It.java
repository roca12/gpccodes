import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
        int t=sc.nextInt();
        
        long n[] = new long[t];
        
        for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
			System.out.println(n[i]*n[i]);
			
		}

	}

}
