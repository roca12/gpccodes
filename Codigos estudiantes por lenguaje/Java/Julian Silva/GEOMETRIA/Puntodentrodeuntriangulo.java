import java.util.*;

public class Main {
	static double area(int x1, int y1, int x2, int y2, int x3, int y3) {
		return Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0);
	}

	static boolean Dentro(int x1, int y1, int x2, int y2, int x3, int y3, int x, int y) {
		double A = area(x1, y1, x2, y2, x3, y3);
		double A1 = area(x, y, x2, y2, x3, y3);
		double A2 = area(x1, y1, x, y, x3, y3);
		double A3 = area(x1, y1, x2, y2, x, y);
		return (A == A1 + A2 + A3);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		if (Dentro(0, 0, 20, 0, 10, 30, 10, 15)) {
			System.out.println("Adentro");
		} else {
			System.out.println("Por fuera");
		}
	}

}
