//pointInsideTriangle
public class Main {
	
	public static void main(String[] args) {
	  int x1 = 0, y1 = 0, x2 = 5, y2 = 5, x3 = 10, y3 = 0, puntox = 100, puntoy = 100;
	  if(isInside(x1, y1, x2, y2, x3, y3, puntox, puntoy)) {
		  System.out.println("Esta adentro");
	  }else {
		  System.out.println("Esta afuera");
	  }
	}
	
	static double area(int x1, int y1, int x2, int y2, int x3, int y3) {
		return Math.abs((x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2.0);
	}
	
	static boolean isInside(int x1, int y1, int x2, int y2, int x3, int y3, int x, int y) {
		// triangulo completo
		double A = area(x1, y1, x2, y2, x3, y3);
		// subtriangulo 1 
		double A1 = area(x1, y1, x2, y2, x, y);
		// subtriangulo 2
		double A2 = area(x1, y1, x3, y3, x, y);
		// subtriangulo 3
		double A3 = area(x2, y2, x3, y3, x, y);
		return (A==A1+A2+A3);
		
	}
}
