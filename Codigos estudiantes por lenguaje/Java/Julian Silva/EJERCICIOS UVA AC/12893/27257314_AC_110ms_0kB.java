import java.util.*;
public class Main {
	
	static long conIt(long n) {
		if(n==0) {
			return 0;
		}
		return (conIt(n/2)+(n%2));
	}
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		for (int i = 0; i < c; i++) {
			long a=sc.nextLong();
			System.out.println(conIt(a));
		}
		
	}
}