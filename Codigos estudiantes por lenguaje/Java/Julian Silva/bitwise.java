
import java.util.*;

public class bitwise{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		for (int i = 0; i < a; i++) {
			int res=i&(1<<3);
			if(res!=0) {
				System.out.println(i+": el tercer bit esta activo");
				System.out.println(Integer.toString(i, 2));
			}
		}
	}
}
