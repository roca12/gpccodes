import java.io.PrintWriter;
import java.util.*;


public class Main {
	//MAXIMO COMUN DIVISOR
	static int gcd(int a, int b) {
		return b==0?a:gcd(b, a%b);
	} 
	
	//MINIMO COMÚN MULTIPLO
	static int lcm(int a, int b) {
		return a*(b/gcd(a,b));
	}
	
	public static void main(String[] args) {
		int a = 80;
		int b = 30;
		System.out.println("GCD: " + gcd(a, b));
		System.out.println("LCM: " + lcm(a, b));
	
	}
}
