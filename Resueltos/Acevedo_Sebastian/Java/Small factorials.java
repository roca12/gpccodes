import java.math.BigInteger;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		long fac[]=new long[r];
		for (int i=0; i<r;i++) {
			BigInteger num = sc.nextBigInteger();
	        System.out.println(factorial(num));
		}
	}
	
	static BigInteger factorial(BigInteger num){
		if (num.equals(BigInteger.ZERO)) return BigInteger.ONE;
		else return num.multiply(factorial(num.subtract(BigInteger.ONE)));
		}
}
