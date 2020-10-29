import java.math.BigInteger;
import java.util.Scanner;

public class Main{
	
	static BigInteger factorial(BigInteger num){
		if (num.equals(BigInteger.ZERO)) return BigInteger.ONE;
		else return num.multiply(factorial(num.subtract(BigInteger.ONE)));
		}
	
	static int potencialXD(BigInteger K, BigInteger fac) {
		int i = 1;
		int temp=0;
		BigInteger num=K;
		while(num.compareTo(fac)==-1) {
			num=K.pow(i);
			if(fac.mod(num).equals(BigInteger.ZERO)) {
				temp=i;
			}
			i = i+1;
		}
		return temp;
	}
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);    	
    	int rep=sc.nextInt();
    	for (int i = 0; i < rep; i++) {
    		BigInteger N = sc.nextBigInteger();
    		BigInteger K = sc.nextBigInteger();
    		System.out.println(potencialXD(K, factorial(N)));
		}
    }  
}
