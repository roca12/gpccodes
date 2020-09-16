
public class main {
//linetwopoints
	
	static void linefrompoints(Punto p, Punto q) {
		double a = q.y-p.y;
		double b = p.x-q.x;
		double c = a*(p.x)+b*(p.y);
		
		if(b<0) {
		System.out.println("La linea que pasa a traves de los puntos P y Q es : "+a+"x + "+b+"y = "+c);
		} else {
			System.out.println("La linea que pasa a traves de los puntos P y Q es : "+a+"x + "+b+"y = "+c);
			}

	}
	//Se crea variables personalizadas:
	static class Punto{
		int x,y;
		
		public Punto(int x, int y) {
			this.x =x;
			this.y =y;
		}
	}
	
	public static void main(String[] args) {
		Punto primerpunto = new Punto(0, 0);
		Punto segundopunto = new Punto(5, 5);
		linefrompoints(primerpunto, segundopunto);
		
	}
}
