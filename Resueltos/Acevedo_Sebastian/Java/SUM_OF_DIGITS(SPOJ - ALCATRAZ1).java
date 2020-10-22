import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int rep = sc.nextInt();
    for (int i = 0; i < rep; i++) {
		BigInteger numero = sc.nextBigInteger();
		System.out.println(sumas(numero));		
	}	
  }
    
    static BigInteger sumas(BigInteger numero) {
    	BigInteger sumas=BigInteger.ZERO;
    	while(numero.compareTo(BigInteger.ZERO)==1) {
    		sumas = sumas.add(numero.mod(BigInteger.TEN));
    		numero = numero.divide(BigInteger.TEN);
    	}
    	return sumas;
    }
}
