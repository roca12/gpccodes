import java.util.Scanner;
public class main {
//BlockMinPerimeter
	public static void main(String[] args) {
		int n=10;
		System.out.println(minPerimeter(n));
	}
	static long minPerimeter(int n) {
		int resultraiz=(int)Math.sqrt(n);
		int sq= resultraiz * resultraiz;
		if(sq==n) {
			return resultraiz * 4;
		}else {
			long row = n / resultraiz;
			long perimeter = 2*(resultraiz + row);
			if(n%resultraiz != 0) {
				perimeter +=2;
			}
			return perimeter;
		}
	}
}
