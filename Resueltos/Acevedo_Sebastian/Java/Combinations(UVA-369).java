import java.math.BigInteger;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger N = sc.nextBigInteger();
		BigInteger M = sc.nextBigInteger();
		while (!M.equals(BigInteger.ZERO) && !N.equals(BigInteger.ZERO)) {
			BigInteger res = factorial(N).divide((factorial(N.subtract(M)).multiply(factorial(M))));
			System.out.println(N+" things taken "+M+" at a time is "+res+" exactly.");
			N = sc.nextBigInteger();
			M = sc.nextBigInteger();
		}        
	}
	
	static BigInteger factorial(BigInteger num){
		if (num.equals(BigInteger.ZERO)) return BigInteger.ONE;
		else return num.multiply(factorial(num.subtract(BigInteger.ONE)));
		}
}
