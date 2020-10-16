import java.util.Scanner;

public class Main {
	
	 public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	int caso = 0;
	    	while(caso!=-1) {
	    		long A = sc.nextLong();
	    		long limit = sc.nextLong();
	    		long cont = 0;
	    		caso++;
	    	    if(A>-1 && limit>-1) {
	    	    	cont = terms(A, limit, cont);
	    	    	System.out.println("Case " + caso + ": " + "A = " + A + ", limit = " + limit + ", number of terms = " + cont);
	    	    }
	    	    else caso=-1;	
	    	} 	
	    }
    
    static long terms(long A, long limite, long cont){
    	
    	if(A==1) {
    		cont++;
    		return cont;
    		
    	}else if(A > limite) {
    		cont++;
    		return cont-1;
    
    	}else{
    		cont++;
    		if(A % 2 == 0) {
            	A = A/2;
            	
            	return terms(A, limite, cont);
            }else {
            	A = (A*3) + 1;
            	return terms(A, limite, cont);
            }
    	}
    }
 
}
