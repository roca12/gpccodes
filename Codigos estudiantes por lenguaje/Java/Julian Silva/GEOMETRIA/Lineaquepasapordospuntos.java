import java.util.*;

public class Main {
	static void lineaDospuntos(Pair p, Pair q) {
		double a=q.second-p.second;
		double b=p.first-q.first;
		double c= a*(p.first)+b*(p.second);
		if(b<0) {
			System.out.println("La linea que pasa a traves de "+ "los puntos P Y Q es: "+a+"x "+b+"y = "+c);
		}else {
			System.out.println("La linea que pasa a traves de "+"los puntos P y Q es: "+a+"x "+b+"y = "+c);
		}
		
	}
	static class Pair{
		int first;
		int second;
		public Pair(int first, int second) {
			this.first=first;
			this.second=second;
			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pair p=new Pair(3,2);
		Pair q= new Pair(2, 6);
		lineaDospuntos(p, q);
				
				
	}
}
