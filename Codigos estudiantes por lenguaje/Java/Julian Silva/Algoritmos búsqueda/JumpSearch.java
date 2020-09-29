import java.util.*;

public class Main3 {
	static int jumpSearch(int vec[],int x) {
		int n=vec.length;
		int step=(int)Math.floor(Math.sqrt(n));
		int prev=0;
		while(vec[Math.min(step, n)-1]<x) {
			prev=step;
			step +=(int)Math.floor(Math.sqrt(n));
			if(prev>=n) {
				return -1;
			}
		}
		while(vec[prev]<x) {
			prev++;
			if(prev==Math.min(step, n)) {
				return -1;
			}
		}
		if(vec[prev]==x) {
			return prev;
		}
		return -1;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c=sc.nextInt();
		int vec[]= new int [c];
		for (int i = 0; i < vec.length; i++) {
			vec[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		int indice=jumpSearch(vec, x);
		System.out.println("\nNumero "+ x + " esta en el indice "+ indice);
	}
}
