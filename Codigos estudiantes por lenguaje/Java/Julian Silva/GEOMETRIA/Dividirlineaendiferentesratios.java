import java.util.*;

public class Main {
	static void seleccion(double x1, double x2, double y1, double y2, double m, double n) {
		double a=((n*x1)+(m*x2)/(m+n)),b=((n*y1)+(m*y2)/(m+n));
		System.out.println("("+a+" , "+b+")");
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		double x1=sc.nextDouble(),x2=sc.nextDouble(),y1=sc.nextDouble(),y2=sc.nextDouble(),m=sc.nextDouble(),n=sc.nextDouble();
		seleccion(x1, x2, y1, y2, m, n);
	}

}
