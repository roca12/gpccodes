import java.util.*;

public class Main {
	static double pi=Math.PI;
	static double circunCirculo(double a) {
		double x=a*a;
		return(x*(pi/3));
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double a=sc.nextDouble();
		System.out.println("El area circuncircular es: "+circunCirculo(a));
	}
}
