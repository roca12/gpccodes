import java.util.Scanner;

public class Main {
	
	 public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	long K = sc.nextLong();
	    	while(K!=0) {
	    		long N = sc.nextLong();
	    		long M = sc.nextLong();	    		
	    		for (long i = 0; i < K; i++) {
	    			long X = sc.nextLong();
	    			long Y = sc.nextLong();
	    			position(N, M, X, Y);
	    			
	    		}
	    		K = sc.nextLong();
	    	}
	    }   
	 static void position(long coorN, long coorM, long X, long Y){
	    	if(coorN > X) {
	    		if(coorM > Y) {
	    			System.out.println("SO");
	    		}else if(coorM < Y) {
	    			System.out.println("NO");
	    		}else {
	    			System.out.println("divisa");
	    		}
	    	}else if(coorN < X) {
	    		if(coorM > Y) {
	    			System.out.println("SE");
	    		}else if(coorM < Y) {
	    			System.out.println("NE");
	    		}else {
	    			System.out.println("divisa");
	    		}
	    	}else {
	    		System.out.println("divisa");
	    	}
	    	
	    }
}
