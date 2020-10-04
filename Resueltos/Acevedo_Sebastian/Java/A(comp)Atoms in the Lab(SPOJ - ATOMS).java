import java.math.BigInteger;
import java.util.Scanner;

public class Main{
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int rep = sc.nextInt();
    	for (int i = 0; i < rep; i++) {
    		BigInteger time=BigInteger.ZERO;
    		BigInteger N = sc.nextBigInteger();
    		BigInteger K = sc.nextBigInteger();
    		BigInteger M = sc.nextBigInteger();
    		System.out.println(timeAtoms(time, N, K, M));
		}		
    }
    
    static BigInteger timeAtoms(BigInteger time,BigInteger N,BigInteger K,BigInteger M) {
    	BigInteger multi = (N.multiply(K));
    	if(multi.compareTo(M)==1) {
    		return time;
    	}else {
    		return timeAtoms(time.add(BigInteger.ONE), multi, K, M);
    	}
    }
    
}
