import java.io.PrintWriter;
import java.util.*;

//Factores primos
public class Main {
	
	static void primeFactors(int n) {
		for (long i = 2; i*i <= n; i++) {
			while(n % i == 0) {
				System.out.println(i);
				n/=i;
			}
		}
		if(n>1) {
			System.out.println(n);
		}
	}		
	
	public static void main(String[] args) {
		int n = 654132;
		primeFactors(n);
	}
}
