
import java.util.*;

import java.math.BigInteger;

public class Main{
	public static void main (String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int a;
		while(c!=0){
		    a = sc.nextInt();
		    BigInteger x = new BigInteger("1");
		    for(int i =1;i<=a;i++){
		        x =x.multiply(BigInteger.valueOf(i));
		    }
		    System.out.println(x);
		    c--;

		}
	}
}
