import java.util.*;

public class Main3 {
	static class Pair{
		int min;
		int max;
	}
	static Pair obtenerMinMax(int vec[], int n) {
		Pair minmax=new Pair();
		int i;
		if(n==1) {
			minmax.max=vec[0];
			minmax.min=vec[0];
			return minmax;
		}
		if(vec[0]>vec[1]) {
			minmax.max=vec[0];
			minmax.min=vec[1];
		}else {
			minmax.max=vec[1];
			minmax.min=vec[0];
		}
		for (i = 2; i < n; i++) {
			if(vec[i]>minmax.max) {
				minmax.max=vec[i];
			}else if(vec[i]<minmax.min) {
				minmax.min=vec[i];
			}
		}
		return minmax;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c;
		int vec[]=new int [c=sc.nextInt()];
		for (int i = 0; i < vec.length; i++) {
			vec[i]=sc.nextInt();
		}
		int vec_tam=vec.length;
		Pair minmax=obtenerMinMax(vec, vec_tam);
		System.out.printf("\nEl minimo elemento es %d", minmax.min);
		System.out.printf("\nEl maximo elemento es %d", minmax.max);
		
		
	}
}
