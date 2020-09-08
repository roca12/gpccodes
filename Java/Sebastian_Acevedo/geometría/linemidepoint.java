import java.util.Scanner;

public class main {
//linemidepoint
	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);
		int x1,x2,y1,y2;
		//primer punto
		x1 = sc.nextInt();
		x2 = sc.nextInt();
		//segundo punto
		y1 = sc.nextInt();
		y2 = sc.nextInt();
		String medio = midpoint(x1,y1,y1,y2);
		System.out.println(medio);
	}
	static String midpoint(int x1, int y1, int x2, int y2) {
		String res = ((x1 + x2)/2 + "," + (y1 + y2) / 2);
		return res;
	}
}
