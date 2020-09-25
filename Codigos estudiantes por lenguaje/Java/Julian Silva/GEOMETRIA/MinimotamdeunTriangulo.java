import java.util.*;

public class Main {
	static double tamMin(double base, double area){
		double d=(2*area)/base;
		return Math.ceil(d);
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base=4,area=8;
		System.out.println("El tamaño minimo es: "+tamMin(base, area));
	}
}
