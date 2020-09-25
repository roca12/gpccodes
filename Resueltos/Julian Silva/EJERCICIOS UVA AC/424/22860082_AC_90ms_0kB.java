import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger a = new BigInteger("0");
		while(sc.hasNext()) {
			BigInteger b=sc.nextBigInteger();
			
			if(b.equals(a.ZERO)) {
				break;
				
			}else {
				a=b.add(a);
			}
			
		}
		System.out.println(a);
	
		
	}

}
