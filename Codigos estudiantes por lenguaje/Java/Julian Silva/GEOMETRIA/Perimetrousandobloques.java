import java.util.*;

public class Main {
	public static long PerMinimo(int x) {
		int l=(int)Math.sqrt(x),sq=l*l;
		if(sq==x) {
			return l*4;
		}else {
			long fila=x/l,perimetro=2*(l+fila);
			if(x%l!=0) {
				perimetro+=2;
			}
			return perimetro;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println(PerMinimo(x));					
	}
}
