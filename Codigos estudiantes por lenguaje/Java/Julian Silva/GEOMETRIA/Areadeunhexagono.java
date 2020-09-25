import java.util.*;

public class Main {
	static double AreaHexagono(double s) {
		return ((3 * Math.sqrt(3) * (s * s)) / 2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double s=sc.nextDouble();
		System.out.println("El Area es: "+AreaHexagono(s)+" ");
	}
}
