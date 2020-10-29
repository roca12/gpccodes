import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
		
		int t = 0;
		t = sc.nextInt();
		
	    int[] n = new int[t];
	    
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
		}
		Arrays.sort(n);
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}

	}

}
  
